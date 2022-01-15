package ObiectConstructor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CursantTest {
    @Test
    public void testautomat(){
        System.out.println("---obiectu1---");
        Cursant MateiFlorin=new Cursant("Matei","Florin",28,2.550, 'M',true, Arrays.asList("Automation","Manual","DataBase"));
        MateiFlorin.dateCursant();
        MateiFlorin.verificadiploma();

        System.out.println("---obiectu1modificat---");
        MateiFlorin.prenume="Florin - Dorel";
        MateiFlorin.dateCursant();

        System.out.println("---obiectu2---");
        Cursant ManolacheMariCarmen=new Cursant("Manolcahe", "Carmen", 23, 2.55, 'F', true, Arrays.asList("Automation", "Manual", "DataBase"));
        ManolacheMariCarmen.dateCursant();
        ManolacheMariCarmen.verificadiploma();

        System.out.println("---romandescurcaret---");
        Cursant MareleAlb=new Cursant("Marele", "Alb", 3000, 2.55,'M',true, Arrays.asList("Prohod","Nunta"));
        MareleAlb.dateCursant();

        System.out.println("Dorha Alex");
        Cursant DorhaAlex=new Cursant("Dorha", "Alex", 27, 2.55, 'M', true, "Autamation");
        DorhaAlex.dateCursant();


    }

}
