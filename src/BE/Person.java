package BE;

public abstract class Person {
    private int id;
    private String name;
    private String email;


    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return id + "          " + name + "          " + email;
    }

    @Override
    public boolean equals(Object obj) {
        Person otherPerson = (Person) obj;
        if (otherPerson.getId() == this.getId())
            return true;
        else return false;
    }
}
