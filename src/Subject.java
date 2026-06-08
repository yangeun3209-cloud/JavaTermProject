import java.io.Serializable;

public class Subject implements Serializable {
    private String subjectName;
    private String day;
    private String startTime;
    private String endTime;
    private String classroom;

    public Subject(String subjectName, String day, String startTime, String endTime, String classroom) {
        this.subjectName = subjectName;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classroom = classroom;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getDay() {
        return day;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "[과목명] " + subjectName +
                " | [요일] " + day +
                " | [시간] " + startTime + " ~ " + endTime +
                " | [강의실] " + classroom;
    }
}