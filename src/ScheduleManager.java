import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ScheduleManager {
    private ArrayList<Subject> subjects = new ArrayList<>();
    private final String FILE_NAME = "timetable.dat";

    public void addSubject(Subject subject) {
        if (isDuplicate(subject)) {
            System.out.println("이미 같은 요일과 시간에 수업이 있습니다.");
            return;
        }
        subjects.add(subject);
        System.out.println("시간표가 등록되었습니다.");
    }

    public void showAllSubjects() {
        if (subjects.isEmpty()) {
            System.out.println("등록된 시간표가 없습니다.");
            return;
        }

        for (int i = 0; i < subjects.size(); i++) {
            System.out.println((i + 1) + ". " + subjects.get(i));
        }
    }

    public void showSubjectsByDay(String day) {
        boolean found = false;

        for (Subject subject : subjects) {
            if (subject.getDay().equals(day)) {
                System.out.println(subject);
                found = true;
            }
        }

        if (!found) {
            System.out.println(day + "요일에 등록된 수업이 없습니다.");
        }
    }

    public void updateSubject(int index, Subject newSubject) {
        if (index < 0 || index >= subjects.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        subjects.set(index, newSubject);
        System.out.println("시간표가 수정되었습니다.");
    }

    public void deleteSubject(int index) {
        if (index < 0 || index >= subjects.size()) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        subjects.remove(index);
        System.out.println("시간표가 삭제되었습니다.");
    }

    public void sortByTime() {
        subjects.sort(Comparator
                .comparing(Subject::getDay)
                .thenComparing(Subject::getStartTime));

        System.out.println("시간표가 시간순으로 정렬되었습니다.");
    }

    public void alertClass(String currentDay, String currentTime) {
        boolean found = false;

        for (Subject subject : subjects) {
            if (subject.getDay().equals(currentDay)) {
                if (subject.getStartTime().compareTo(currentTime) >= 0) {
                    System.out.println("알림: 곧 수업이 있습니다.");
                    System.out.println(subject);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("현재 이후 예정된 수업이 없습니다.");
        }
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(subjects);
            System.out.println("시간표가 파일에 저장되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류가 발생했습니다.");
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            subjects = (ArrayList<Subject>) ois.readObject();
            System.out.println("시간표를 파일에서 불러왔습니다.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("불러올 파일이 없거나 오류가 발생했습니다.");
        }
    }

    private boolean isDuplicate(Subject newSubject) {
        for (Subject subject : subjects) {
            if (subject.getDay().equals(newSubject.getDay())
                    && subject.getStartTime().equals(newSubject.getStartTime())) {
                return true;
            }
        }
        return false;
    }
}