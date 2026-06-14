import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class ScheduleManager {
    private ArrayList<Subject> subjects = new ArrayList<>();
    private static final String FILE_NAME = "timetable.dat";

    public String addSubject(Subject subject) {
        if (isDuplicate(subject)) {
            return "이미 같은 요일과 시간에 수업이 있습니다.";
        }

        subjects.add(subject);
        return "시간표가 등록되었습니다.";
    }

    public String getAllSubjectsText() {
        if (subjects.isEmpty()) {
            return "등록된 시간표가 없습니다.";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < subjects.size(); i++) {
            sb.append(i + 1).append(". ").append(subjects.get(i)).append("\n");
        }

        return sb.toString();
    }

    public String getSubjectsByDayText(String day) {
        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (Subject subject : subjects) {
            if (subject.getDay().equals(day)) {
                sb.append(subject).append("\n");
                found = true;
            }
        }

        if (!found) {
            return day + "요일에 등록된 수업이 없습니다.";
        }

        return sb.toString();
    }

    public String updateSubject(int index, Subject newSubject) {
        if (index < 0 || index >= subjects.size()) {
            return "잘못된 번호입니다.";
        }

        subjects.set(index, newSubject);
        return "시간표가 수정되었습니다.";
    }

    public String deleteSubject(int index) {
        if (index < 0 || index >= subjects.size()) {
            return "잘못된 번호입니다.";
        }

        subjects.remove(index);
        return "시간표가 삭제되었습니다.";
    }

    public String sortByTime() {
        subjects.sort(Comparator
                .comparing(Subject::getDay)
                .thenComparing(Subject::getStartTime));

        return "시간표가 시간순으로 정렬되었습니다.";
    }

    public String getAlertClassText(String currentDay, String currentTime) {
        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (Subject subject : subjects) {
            if (subject.getDay().equals(currentDay)
                    && subject.getStartTime().compareTo(currentTime) >= 0) {
                sb.append("알림: 곧 수업이 있습니다.\n");
                sb.append(subject).append("\n");
                found = true;
            }
        }

        if (!found) {
            return "현재 이후 예정된 수업이 없습니다.";
        }

        return sb.toString();
    }

    public String saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(subjects);
            return "시간표가 파일에 저장되었습니다.";
        } catch (IOException e) {
            return "파일 저장 중 오류가 발생했습니다: " + e.getMessage();
        }
    }

    @SuppressWarnings("unchecked")
    public String loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            subjects = (ArrayList<Subject>) ois.readObject();
            return "시간표를 파일에서 불러왔습니다.";
        } catch (IOException | ClassNotFoundException e) {
            return "불러올 파일이 없거나 오류가 발생했습니다: " + e.getMessage();
        }
    }

    private boolean isDuplicate(Subject newSubject) {
        for (Subject subject : subjects) {
            if (subject.getDay().equals(newSubject.getDay())
                    && subject.getStartTime().equals(newSubject.getStartTime())
                    && subject.getEndTime().equals(newSubject.getEndTime())) {
                return true;
            }
        }
        return false;
    }
}