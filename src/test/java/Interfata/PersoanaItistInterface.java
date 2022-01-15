package Interfata;

public class PersoanaItistInterface extends PersoanaInterface implements Itist {
    public PersoanaItistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void scrieCod() {
        System.out.println("Itistul scrie cod");

    }

    @Override
    public void ruleazaCod() {
        System.out.println("Itistul ruleaza cod");

    }
}
