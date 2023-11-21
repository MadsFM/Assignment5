package BLL;

import BE.Person;
import BE.Student;
import BE.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private List<Person> persons = new ArrayList<>();

    public Person getPerson(int id){
        for(Person p : persons){
            if(p.getId()==id)
                return p;
        }
        return null;
    }

    public void addPerson(Person p){
        for (Person pe : persons)
            if (pe.equals(p))
                return;
        persons.add(p);
    }

    public void removePerson(int id){
        Person youAreDone = null;
        for(Person p : persons){
            if(p.getId()==id)
                youAreDone = p;
                break;
        }
        persons.remove(youAreDone);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<>();
        for(Person p : persons){
            if(p instanceof Teacher)
                teachers.add((Teacher) p);
        }
        return teachers;
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        for(Person p : persons){
            if(p instanceof Student)
                students.add((Student) p);
        }
        return students;
    }

    @Override
    public String toString() {
        String out = ("ID               NAME                    EMAIL\n");
        for (Person currentPerson : persons) {
            out += (currentPerson + "\n");
        }
        return out;
    }


}

