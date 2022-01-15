package ClasaAbstracta;

public class PersoanaInginerItistAbstract extends PersoanaAbstract {

    public String nume;
    public String prenume;

    public PersoanaInginerItistAbstract(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
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
    public void ruleazaTeste() {
        System.out.println("IngineruItist ruleaza teste");

    }
}
