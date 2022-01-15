package Interfata;

public class PersoanaInginerInterface extends PersoanaInterface implements Inginer {


    public PersoanaInginerInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("Ingineru proiecteaza");
    }

    @Override
    public void executie() {
        System.out.println("Ingineru face executie");

    }

}
