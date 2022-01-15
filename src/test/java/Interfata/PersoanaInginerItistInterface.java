package Interfata;

public class PersoanaInginerItistInterface extends PersoanaInterface implements Inginer,Itist{
    public PersoanaInginerItistInterface(String nume, String prenume) {
        super(nume, prenume);
    }

    @Override
    public void proiecteaza() {
        System.out.println("IngineruItist proiecteaza");

    }

    @Override
    public void executie() {
        System.out.println("IngineruItist face executie");

    }

    @Override
    public void scrieCod() {
        System.out.println("IngineruItist scrie cod");

    }

    @Override
    public void ruleazaCod() {
        System.out.println("IngineruItist testeaza cod");

    }
}
