package BE;

import BLL.Menu;
import BLL.PersonManager;

public class MainMenu extends Menu {

    private PersonManager personManager = new PersonManager();
    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public MainMenu() {

        super("What do you want to see",  " Teachers", " Students", " ALL");
    }

    @Override
    protected void doAction(int option) {
        if (option == 1) {
            System.out.println("You've selected -> 1, Teachers");
            personManager.getAllTeachers().forEach(System.out::println);
        } else if (option == 2) {
            System.out.println("You've selected -> 2, Students");
            System.out.println(personManager.getAllStudent());
        } else if (option == 3) {
            System.out.println("You've selected -> 3, ALL");
            System.out.println(personManager.getAllPersons());

        }
    }

    private void setUpPersonData(){

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
    }

}
