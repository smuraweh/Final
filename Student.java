package finalProject;

import java.lang.*;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String program;
    private String level;
    private String asurite;
    private Node attendance; // need to write accessor and mutator functions, or may make public

    public Student(){ // constructor
        id = 0;
        firstName = null;
        lastName = null;
        program = null;
        level = null;
        asurite = null;
    }

    // mutators
    public void setID(int num) {
        this.id = num;
    }

    public void setFirst(String name) {
        this.firstName = name;
    }

    public void setLast(String name) {
        this.lastName = name;
    }

    public void setProg(String prog) {
        this.program = prog;
    }

    public void setLevel(String lev) {
        this.level = lev;
    }

    public void setASUrite(String urite) {
        this.asurite = urite;
    }

    // accessors
    public int getID() {
        return id;
    }

    public String getFirst() {
        return firstName;
    }

    public String getLast() {
        return lastName;
    }

    public String getProg() {
        return program;
    }

    public String getLevel() {
        return level;
    }

    public String getASUrite() {
        return asurite;
    }
}