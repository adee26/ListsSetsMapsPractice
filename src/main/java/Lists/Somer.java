package Lists;

public class Somer extends Person{
    private String meserieDeBaza;

    public Somer(String name, String meserieDeBaza) {
        super(name);
        this.meserieDeBaza  = meserieDeBaza;
    }

    public String getMeserieDeBaza() {
        return meserieDeBaza;
    }

    public void setMeserieDeBaza(String meserieDeBaza) {
        this.meserieDeBaza = meserieDeBaza;
    }
}
