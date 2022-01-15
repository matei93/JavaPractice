package TemeDeCasa;
import org.junit.Test;

public class Tema1 {

    public String salut;
    public Integer varsta;
    public String nume;
    public String prenume;
    public String data;
    public String ora;
    public String zi;
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    public Integer e;
    public Double f;
    public Double numar1;
    public Double numar2;
    public Double numar3;
    public Double suma3numere;
    public Integer g;
    public Integer h;
    public Integer produsgh;
    public String mesajconcateneaza;
    public String h1;
    public String s1;
    public String z;
    public String potiplecaacasa;

    @Test
    public void testautomat(){
        variabile();
        formula();
        suma();
        produs();
        saluthello();
        vocale();

    }
    public void variabile(){
        salut="HELLO WORLD";
        varsta=28;
        nume="MATEI";
        prenume="FLORIN";
        data="27.11.2021";
        ora="10:00";
        zi="Sambata";
        potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
        System.out.println(salut+potiplecaacasa);
        System.out.println(varsta+potiplecaacasa);
        System.out.println(nume+potiplecaacasa);
        System.out.println(prenume+potiplecaacasa);
        System.out.println(data+potiplecaacasa);
        System.out.println(ora+potiplecaacasa);
        System.out.println(zi+potiplecaacasa);
    }
    public void formula(){
      a=2;
      b=3;
      c=4;
      d=3;
      e=3;
      f=3.66;
      mesajconcateneaza=" Stiu ca am calculat bine";
      potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
      System.out.println(f + mesajconcateneaza+potiplecaacasa);
    }
    public void suma(){
        numar1=55.5;
        numar2=67.8;
        numar3=123.3;
        suma3numere=246.6;
        mesajconcateneaza=" Stiu ca am calculat bine";
        potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
        System.out.println("Suma celor 3 numere(numar1, numar2 si numar3) este egala cu " + suma3numere + mesajconcateneaza+potiplecaacasa);
    }
    public void produs(){
        g=2;
        h=4;
        produsgh=8;
        mesajconcateneaza=" Stiu ca am calculat bine";
        potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
        System.out.println("Produsul dintre g si h este egal cu " + produsgh + mesajconcateneaza+potiplecaacasa);


    }
    public void saluthello(){
        h1="H";
        s1="S";
        potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
        System.out.println(h1+" Salut"+potiplecaacasa);
        System.out.println("Hello "+s1+potiplecaacasa);
    }
    public void vocale(){
        z="Z";
        potiplecaacasa=" Poti pleca acasa dupa ce iti verific tema";
        System.out.println("Ana"+z+" are"+z+" mere"+z+","+" pere"+z+","+" prune"+z+"."+potiplecaacasa);
    }



}
