package BE;

import BLL.PersonManager;

public class Test {
    public void start(){


        PersonManager personManager = new PersonManager();

        Teacher t1 = new Teacher(202, "Bent H. Pedersen", "bhp");
        t1.setEmail("bhp@easv.dk");
        t1.addSubject("Programming");
        t1.addSubject("Design");
        personManager.addPerson(t1);

        Teacher t2 = new Teacher(203, "Hans Nielsen", "hni");
        t1.setEmail("hni@easv.dk");
        t2.addSubject("French");
        t2.addSubject("Network");
        personManager.addPerson(t2);

        Teacher t3 = new Teacher(204, "Niels Hansen", "nha");
        t3.setEmail("nha@easv.dk");
        t3.addSubject("ITO");
        t3.addSubject("German");
        personManager.addPerson(t3);



        Student s1 = new Student(101, "Bo Ibsen", "Computer Science");
        s1.setEmail("        bib@easv.dk");
        s1.addGrade( new GradeInfo("Programming", 7));
        s1.addGrade(new GradeInfo("French", 4));
        personManager.addPerson(s1);


        Student s2 = new Student(102, "Ib Boesen", "Network");
        s2.setEmail("ibo@easv.dk");
        s2.addGrade(new GradeInfo("ITO", 10));
        s2.addGrade(new GradeInfo("French", 4));
        personManager.addPerson(s2);


        System.out.println("Teachers: " + personManager.getAllTeachers());
        System.out.println("Students: " + personManager.getAllStudent());
        System.out.println("All: " + personManager.getAllPersons());

        new MainMenu().run();
    }
}
