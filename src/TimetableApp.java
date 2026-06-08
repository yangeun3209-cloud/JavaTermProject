import java.util.Scanner;

public class TimetableApp {
    private Scanner scanner = new Scanner(System.in);
    private ScheduleManager manager = new ScheduleManager();

    public void start() {
        while (true) {
            showMenu();

            System.out.print("메뉴 선택: ");
            int choice = inputInt();

            switch (choice) {
                case 1:
                    addSubject();
                    break;
                case 2:
                    manager.showAllSubjects();
                    break;
                case 3:
                    showByDay();
                    break;
                case 4:
                    updateSubject();
                    break;
                case 5:
                    deleteSubject();
                    break;
                case 6:
                    manager.sortByTime();
                    manager.showAllSubjects();
                    break;
                case 7:
                    alertClass();
                    break;
                case 8:
                    manager.saveToFile();
                    break;
                case 9:
                    manager.loadFromFile();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 메뉴입니다.");
            }
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.println("===== 시간표 알림 프로그램 =====");
        System.out.println("1. 시간표 등록");
        System.out.println("2. 시간표 전체 조회");
        System.out.println("3. 요일별 조회");
        System.out.println("4. 시간표 수정");
        System.out.println("5. 시간표 삭제");
        System.out.println("6. 시간순 정렬");
        System.out.println("7. 수업 알림");
        System.out.println("8. 파일 저장");
        System.out.println("9. 파일 불러오기");
        System.out.println("0. 종료");
    }

    private void addSubject() {
        Subject subject = inputSubjectInfo();
        manager.addSubject(subject);
    }

    private void showByDay() {
        System.out.print("조회할 요일 입력: ");
        String day = scanner.nextLine();
        manager.showSubjectsByDay(day);
    }

    private void updateSubject() {
        manager.showAllSubjects();

        System.out.print("수정할 번호 입력: ");
        int index = inputInt() - 1;

        Subject subject = inputSubjectInfo();
        manager.updateSubject(index, subject);
    }

    private void deleteSubject() {
        manager.showAllSubjects();

        System.out.print("삭제할 번호 입력: ");
        int index = inputInt() - 1;

        manager.deleteSubject(index);
    }

    private void alertClass() {
        System.out.print("현재 요일 입력: ");
        String day = scanner.nextLine();

        System.out.print("현재 시간 입력 예) 09:30 : ");
        String time = scanner.nextLine();

        manager.alertClass(day, time);
    }

    private Subject inputSubjectInfo() {
        System.out.print("과목명: ");
        String name = scanner.nextLine();

        System.out.print("요일: ");
        String day = scanner.nextLine();

        System.out.print("시작 시간 예) 09:00 : ");
        String startTime = scanner.nextLine();

        System.out.print("종료 시간 예) 10:30 : ");
        String endTime = scanner.nextLine();

        System.out.print("강의실: ");
        String classroom = scanner.nextLine();

        return new Subject(name, day, startTime, endTime, classroom);
    }

    private int inputInt() {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.print("숫자로 다시 입력하세요: ");
            }
        }
    }
}