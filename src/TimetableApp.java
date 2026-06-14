import javax.swing.*;
import java.awt.*;

public class TimetableApp extends JFrame {

    private final ScheduleManager manager = new ScheduleManager();

    private JTextField nameField;
    private JTextField dayField;
    private JTextField startField;
    private JTextField endField;
    private JTextField classroomField;
    private JTextArea outputArea;

    public TimetableApp() {
        setTitle("시간표 알림 프로그램");
        setSize(750, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI();

        setVisible(true);
    }

    private void createUI() {
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        inputPanel.add(new JLabel("과목명"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("요일"));
        dayField = new JTextField();
        inputPanel.add(dayField);

        inputPanel.add(new JLabel("시작 시간 예) 09:00"));
        startField = new JTextField();
        inputPanel.add(startField);

        inputPanel.add(new JLabel("종료 시간 예) 10:30"));
        endField = new JTextField();
        inputPanel.add(endField);

        inputPanel.add(new JLabel("강의실"));
        classroomField = new JTextField();
        inputPanel.add(classroomField);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 5, 5, 5));

        JButton addButton = new JButton("등록");
        JButton showButton = new JButton("전체 조회");
        JButton dayButton = new JButton("요일별 조회");
        JButton updateButton = new JButton("수정");
        JButton deleteButton = new JButton("삭제");

        JButton sortButton = new JButton("시간순 정렬");
        JButton alertButton = new JButton("수업 알림");
        JButton saveButton = new JButton("파일 저장");
        JButton loadButton = new JButton("파일 불러오기");
        JButton clearButton = new JButton("입력 초기화");

        buttonPanel.add(addButton);
        buttonPanel.add(showButton);
        buttonPanel.add(dayButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(sortButton);
        buttonPanel.add(alertButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(clearButton);

        outputArea = new JTextArea(15, 50);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(inputPanel, BorderLayout.NORTH);
        topPanel.add(buttonPanel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addButton.addActionListener(e -> addSubject());
        showButton.addActionListener(e -> showAllSubjects());
        dayButton.addActionListener(e -> showByDay());
        updateButton.addActionListener(e -> updateSubject());
        deleteButton.addActionListener(e -> deleteSubject());
        sortButton.addActionListener(e -> sortSubjects());
        alertButton.addActionListener(e -> alertClass());
        saveButton.addActionListener(e -> saveToFile());
        loadButton.addActionListener(e -> loadFromFile());
        clearButton.addActionListener(e -> clearFields());
    }

    private void addSubject() {
        Subject subject = inputSubjectInfo();

        if (subject == null) {
            return;
        }

        String result = manager.addSubject(subject);

        outputArea.setText(result + "\n");
        outputArea.append(subject + "\n");

        clearFields();
    }

    private void showAllSubjects() {
        outputArea.setText("전체 시간표 조회\n");
        outputArea.append("----------------------\n");
        outputArea.append(manager.getAllSubjectsText());
    }

    private void showByDay() {
        String day = JOptionPane.showInputDialog(this, "조회할 요일을 입력하세요.");

        if (day == null || day.trim().isEmpty()) {
            return;
        }

        outputArea.setText(day.trim() + "요일 시간표 조회\n");
        outputArea.append("----------------------\n");
        outputArea.append(manager.getSubjectsByDayText(day.trim()));
    }

    private void updateSubject() {
        String indexText = JOptionPane.showInputDialog(this, "수정할 번호를 입력하세요.");

        if (indexText == null || indexText.trim().isEmpty()) {
            return;
        }

        Subject subject = inputSubjectInfo();

        if (subject == null) {
            return;
        }

        try {
            int index = Integer.parseInt(indexText.trim()) - 1;
            String result = manager.updateSubject(index, subject);

            outputArea.setText(result + "\n");
            outputArea.append(manager.getAllSubjectsText());
        } catch (NumberFormatException e) {
            outputArea.setText("번호는 숫자로 입력해야 합니다.");
        }
    }

    private void deleteSubject() {
        String indexText = JOptionPane.showInputDialog(this, "삭제할 번호를 입력하세요.");

        if (indexText == null || indexText.trim().isEmpty()) {
            return;
        }

        try {
            int index = Integer.parseInt(indexText.trim()) - 1;
            String result = manager.deleteSubject(index);

            outputArea.setText(result + "\n");
            outputArea.append(manager.getAllSubjectsText());
        } catch (NumberFormatException e) {
            outputArea.setText("번호는 숫자로 입력해야 합니다.");
        }
    }

    private void sortSubjects() {
        String result = manager.sortByTime();

        outputArea.setText(result + "\n");
        outputArea.append(manager.getAllSubjectsText());
    }

    private void alertClass() {
        String day = JOptionPane.showInputDialog(this, "현재 요일을 입력하세요.");
        String time = JOptionPane.showInputDialog(this, "현재 시간을 입력하세요. 예) 09:30");

        if (day == null || time == null || day.trim().isEmpty() || time.trim().isEmpty()) {
            return;
        }

        outputArea.setText("수업 알림 결과\n");
        outputArea.append("----------------------\n");
        outputArea.append(manager.getAlertClassText(day.trim(), time.trim()));
    }

    private void saveToFile() {
        outputArea.setText(manager.saveToFile());
    }

    private void loadFromFile() {
        outputArea.setText(manager.loadFromFile() + "\n");
        outputArea.append(manager.getAllSubjectsText());
    }

    private Subject inputSubjectInfo() {
        String name = nameField.getText().trim();
        String day = dayField.getText().trim();
        String start = startField.getText().trim();
        String end = endField.getText().trim();
        String classroom = classroomField.getText().trim();

        if (name.isEmpty() || day.isEmpty() || start.isEmpty() || end.isEmpty() || classroom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "모든 정보를 입력하세요.");
            return null;
        }

        return new Subject(name, day, start, end, classroom);
    }

    private void clearFields() {
        nameField.setText("");
        dayField.setText("");
        startField.setText("");
        endField.setText("");
        classroomField.setText("");
    }
}