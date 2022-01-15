package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //Doua tipuri de structuri = structuri alternative si repetitive
    //Structura alternativa = if conditie then
    //                                    els
    //Nu tot timpu trebuie sa fie els
    //Putem avea cate if avem nevoie


    @Test
    public void testautomat(){
        verificanumar();
        verificanume();
        verificanumarcomplex(5,3);
        verificanumarcomplex(5,5);


    }
    //Verificam daca 5>3
    public void verificanumar(){
        if (5>3) {
            System.out.println("5 este mai mare ca si 3");

        }
        else {
            System.out.println("5 nu este mai mic ca si 3");
        }
    }
    //Verificam daca Alexandru contine Alex.
    public void verificanume(){
        String nume="Alexandru";
        String numecomparatie= "Alexe";
        if (nume.contains(numecomparatie)){
            System.out.println("Numele Alexandru contine si numele Alex");

        }
        else{
            System.out.println("Numele Alexandru nu contine acest nume: " + numecomparatie);
        }
    }
    //Verificam daca un numar este mai mare ca altul cu mai multe cazuri
    public void verificanumarcomplex(Integer nr1,Integer nr2){
        if (nr1>nr2){
            System.out.println(nr1+" este mai mare ca si "+nr2);
        }
        if (nr1<nr2){
            System.out.println(nr1+" nu este mai mic ca si "+nr2);
        }
        if (nr1==nr2){
            System.out.println(nr1+" este egal cu "+nr2);
        }

        if (nr1!=nr2){
            System.out.println(nr1+" este diferit de "+nr2);
        }
    }
}
