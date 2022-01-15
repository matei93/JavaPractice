package Protective;

public class Copil {

    //Public vizibil peste tot in proiect.
    //Privat vizibil doar in clasa unde lai declarat.
    //Protected vizibil in clasa parinte + clasa copil indiferent daca se afla  sau nu in acelas pachet.
    //Default vizibil in clasa parinte + clasa copil cu coditia sa fie in acels pachet.
    //Protected=daca declaram un obiect este vizibil in orice clasa din pachet.
    //Default=daca declaram un obiect este vizibil in orice clasa din pachet.

    public void metodaPublica(){
        System.out.println("Public");
    }
    private void metodaPrivate(){
        System.out.println("Private");
    }
    protected void metodaProtected(){
        System.out.println("Protected");
    }
    void metodaDefault(){
        System.out.println("Defoult");
    }
}
