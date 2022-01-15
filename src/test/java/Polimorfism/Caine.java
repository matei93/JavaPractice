package Polimorfism;

public class Caine extends Animal {

    public Caine(String rasa, String talie, String culoareBlana) {
        super(rasa, talie, culoareBlana);
    }

    //Polimorfism dinamic

    @Override
    public void scoateSunet() {
        System.out.println("Cainele latra");
    }

    public void apeleazaMetodaParinte(){
        super.scoateSunet();
    }

    //Polimorfismu static

    public void cumparaProduse(){
        System.out.println("Nu am cumparat nici un produs");
    }

    public void cumparaProduse(String Produs1){

        System.out.println("Am cumparat un produs:" + Produs1);
    }

    public void cumparaProduse(Integer Produs1){

        System.out.println("Am cumparat un produs:" + Produs1);
    }

    //Polimorfismu se poate aplica in metoda return doar prin numarul prametrilor.

    public Integer getCaine(){
        return 1;
    }

    public Integer getCaine(String numar){
        return 1;
    }

    //Metoda return=putem aplica polimorfismu dinamic.
    //Metoda return=putem aplica polimofismu static doar la nivel de numar de parametri.

    @Override
    public Integer getPret() {
        return super.getPret();
    }
}
