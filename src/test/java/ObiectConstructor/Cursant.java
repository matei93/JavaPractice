package ObiectConstructor;

import org.junit.Test;

import java.util.List;

public class Cursant {


    //Obiect=instanta unei clase.
    //Recunoastem un obiect dupa cavantu cheie new.
    //Putem face un infinit de obiecte.
    //Structura unui obiect- NumeClasa NumeObiect=new NumeClasa(se va apela constructoru clasei)(dam valori pentru variabile)
    //Exemplu obiect= Cursant MateiFlorin=new Cursant()
    //Constructor = Are ca rol sa initializeze variabilele unei clase.
    //Intr-o clasa putem avea un infinit de constructori.
    //Exista doua tipuri de constructori=cu parametri sau fara parametri
    //Diferentierea dintre constructori se face prin tipul parametrilor sau numarul parametrilor.
    //Daca nu fac eu un constructor = exista unul by default fara parametri.
    //Structura constructor = public numeclasa()

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Character gen;
    public Boolean diplomabac;
    public List<String> cursuriinteres;
    public String cursinteres;

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomabac = diplomabac;
        this.cursuriinteres = cursuriinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Double taxa, Character gen, Boolean diplomabac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.gen = gen;
        this.diplomabac = diplomabac;
        this.cursinteres = cursinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomabac, String cursinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomabac = diplomabac;
        this.cursinteres = cursinteres;
    }

    public Cursant(String nume, String prenume, Integer varsta, Character gen, Boolean diplomabac, List<String> cursuriinteres) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
        this.diplomabac = diplomabac;
        this.cursuriinteres = cursuriinteres;
    }

    public void dateCursant(){
        System.out.println("Datele despre cursant sunt urmatoarele: ");
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
        if (taxa != null){
            System.out.println(taxa);
        }
        System.out.println(gen);
        System.out.println(diplomabac);
        System.out.println("Cursurile de interes sunt urmatoarele: ");
        if (cursuriinteres != null) {
            for (Integer index = 0; index < cursuriinteres.size(); index++) {
                System.out.println(cursuriinteres.get(index));
            }
        }
        else {
            System.out.println(cursinteres);
        }
    }
    public void verificadiploma(){
        if (diplomabac){
            System.out.println("Cursantul" + nume+" "+prenume+" "+"are diploma de bac");
        }
        else {
            System.out.println("Cursantul" + nume+" "+prenume+" "+"nu are diploma de bac");
        }
    }
}




