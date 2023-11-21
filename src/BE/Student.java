package BE;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

private List<GradeInfo> gradeReport = new ArrayList<>();
private String education;


    public Student(int id, String name, String education) {
        super(id, name);
        this.education = education;
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public String getEducation() {
        return education;
    }

    public double getAverageGrade(){
        double sum = 0;
        for (GradeInfo gi : gradeReport){
            sum += gi.getGrade();
        }
        return sum/gradeReport.size();
    }

    public int getGrade(String subject){
        for (GradeInfo gi : gradeReport){
            if (gi.getSubject().equals(subject))
                return gi.getGrade();
        }
        throw new RuntimeException("You have failed");
    }

    public void addGrade(GradeInfo gradeInfo){
        gradeReport.add(gradeInfo);
    }

    @Override
    public String toString() {
        return super.toString() + "     " + education + "     " + getAverageGrade();
    }
}
