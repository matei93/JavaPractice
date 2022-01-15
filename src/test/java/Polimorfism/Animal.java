package Polimorfism;

public class Animal {
   //Polimorfism=conceptu prin care o metoda poate avea implementari diferite
   //Doua feluri=Dinamic(override); Static(overloade)
   //Polimorfismu Dinamic=intr-o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite.
    //Polimorfismu Static=conceptu pe baza caruia o metoda are o structura diferita

    public String rasa;
    public String talie;
    public String culoareBlana;

    public Animal(String rasa, String talie, String culoareBlana) {
        this.rasa = rasa;
        this.talie = talie;
        this.culoareBlana = culoareBlana;
    }

    //Polimorfism Dinamic
    public void scoateSunet(){
        System.out.println("Animalu scoate sunet");
    }

    public Integer getPret(){
        return 3;
    }
}
