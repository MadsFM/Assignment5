package BE;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<String> subjects = new ArrayList<>();
    private String initials;
    private double salary;

    public Teacher(int id, String name, String initials) {
        super(id, name);
        this.initials = initials;
    }

    public List<String> getSubject() {
        return subjects;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }
    public String getInitials() {
        return initials;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return super.toString() + "     " + initials + "     " + subjects.get(0);
    }
}
