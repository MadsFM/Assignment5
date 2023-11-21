package BE;

public class GradeInfo {

    private String subject;
    private int grade;

    public GradeInfo(String subject, int grade){
        this.subject = subject;
        this.grade = grade;

    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade: " + grade + ", Subject: " + subject;
    }
}
