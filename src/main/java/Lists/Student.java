package Lists;

public class Student extends Person{
    private  String facultate;

    public Student(String name, String facultate) {
        super(name);
        this.facultate = facultate;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}
