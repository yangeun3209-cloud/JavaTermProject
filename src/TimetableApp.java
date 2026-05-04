import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.*;

public class TimetableApp {

    public static class ScheduleEntry {
        private final String courseName;
        private final DayOfWeek day;
        private final LocalTime start;
        private final LocalTime end;
        private final String room;

        public ScheduleEntry(String courseName, DayOfWeek day, LocalTime start, LocalTime end, String room) {
            this.courseName = courseName;
            this.day = day;
            this.start = start;
            this.end = end;
            this.room = room;
        }

        public DayOfWeek getDay() {
            return day;
        }

        public LocalTime getStart() {
            return start;
        }

        @Override
        public String toString() {
            return String.format("%-20s %s %5s-%5s [%s]",
                    courseName, day, start, end, room);
        }
    }

    private final List<ScheduleEntry> entries = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new TimetableApp().run();
    }

    private void run() {
        boolean running = true;

        while (running) {
            System.out.println("\n1) 추가  2) 조회  3) 샘플 추가  0) 종료");
            System.out.print("선택: ");

            String opt = scanner.nextLine().trim();

            switch (opt) {
                case "1" -> addEntry();
                case "2" -> listEntries();
                case "3" -> addSample();
                case "0" -> running = false;
                default -> System.out.println("올바른 번호 입력하세요.");
            }
        }

        System.out.println("종료.");
    }

    private void addEntry() {
        try {
            System.out.print("과목명: ");
            String name = scanner.nextLine().trim();

            System.out.print("요일 (MONDAY 또는 1=월 ... 7=일): ");
            DayOfWeek day = parseDay(scanner.nextLine().trim());

            System.out.print("시작시간 (HH:mm): ");
            LocalTime start = parseTime(scanner.nextLine().trim());

            System.out.print("종료시간 (HH:mm): ");
            LocalTime end = parseTime(scanner.nextLine().trim());

            if (end.isBefore(start) || end.equals(start)) {
                System.out.println("종료시간은 시작시간보다 늦어야 합니다.");
                return;
            }

            System.out.print("강의실: ");
            String room = scanner.nextLine().trim();

            entries.add(new ScheduleEntry(name, day, start, end, room));
            System.out.println("추가되었습니다.");

        } catch (IllegalArgumentException | DateTimeParseException ex) {
            System.out.println("입력 형식 오류: " + ex.getMessage());
        }
    }

    private void listEntries() {
        if (entries.isEmpty()) {
            System.out.println("등록된 수업이 없습니다.");
            return;
        }

        entries.sort(
                Comparator.comparing(ScheduleEntry::getDay)
                        .thenComparing(ScheduleEntry::getStart)
        );

        System.out.println("\n시간표:");
        for (ScheduleEntry e : entries) {
            System.out.println(e);
        }
    }

    private DayOfWeek parseDay(String input) {
        if (input.matches("\\d")) {
            int n = Integer.parseInt(input);
            return DayOfWeek.of(n); // 1=월 ... 7=일
        } else {
            return DayOfWeek.valueOf(input.toUpperCase(Locale.KOREAN));
        }
    }

    private LocalTime parseTime(String input) {
        return LocalTime.parse(input); // HH:mm
    }

    private void addSample() {
        entries.add(new ScheduleEntry("자료구조", DayOfWeek.MONDAY, LocalTime.of(9, 0), LocalTime.of(10, 15), "A101"));
        entries.add(new ScheduleEntry("운영체제", DayOfWeek.WEDNESDAY, LocalTime.of(13, 30), LocalTime.of(14, 45), "B202"));
        entries.add(new ScheduleEntry("알고리즘", DayOfWeek.FRIDAY, LocalTime.of(11, 0), LocalTime.of(12, 15), "C303"));

        System.out.println("샘플 수업 3개 추가됨.");
    }
}