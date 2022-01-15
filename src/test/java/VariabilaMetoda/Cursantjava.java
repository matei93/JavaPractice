package VariabilaMetoda;

import org.junit.Test;

public class Cursantjava {

    //Am facut un comentariu
    //Clasa = un sablon de variabila si metode
    //Variabila = Atributul unei clase
    //Metoda = Actiunea unei clase
    //Tot timpul o clasa va avea langa nume cuvantul class
    //O clasa trebuie sa aiba un nume
    //O clasa trebuie  sa fie publica => inseamna ca oricine sa vada clasa
    //Variabila = poate sa fie de 2 tipuri: variabila globala sau locala
    //Variabila globala = este vizibila peste tot in clasa noastra
    //Variabila globala structura = public tipVariabila Nume Variabila
    //Variabila locala = este vizibiladoar in locul unde am scris
    //Variabila locala structura = TipVariabila NumeVariabila
    //O variabila poate sau nu sa primeasca o valoare
    //Ca sa dam o valoare la o variabilase face cu egal
    //Metode sunt de 2 feluti: void si return
    //Metoda void structura = public void numemetoda(){}
    //Metoda return structura = public tipvariabila numemetoda(){}

    public String nume;
    public String prenume;
    public String adresa;
    public Integer adresaNume;
    public Integer varsta;
    public Double kg;
    public Double experienta;
    public String valuta;

    @Test
    public void testautomat(){
        caluleazasuma();
        System.out.println(getsalar() + "lei");
        System.out.println(getadresa());


    }

    public void caluleazasuma(){
        //Declaram 3 variabile care adunatesa fie 100
        Integer suma=0;
        Integer a=30;
        Integer b=30;
        Integer c=40;
        suma=a+b+c;
        System.out.println("Suma celor 3 variabile a,b,c este egala cu " + suma);


    }

    public Double getsalar(){
        Double salar=3500.69;
        return salar;


    }

    public String getadresa(){
        String adresa="Strda Mehedinti, Nr. 42-44, Bl. D8, Sc. 2, Ap. 129";
        return adresa;
    }

}


