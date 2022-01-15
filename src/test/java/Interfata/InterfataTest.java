package Interfata;

import org.junit.Test;

public class InterfataTest {
    @Test
    public void testAutomat(){
        PersoanaInginerInterface Florin = new PersoanaInginerInterface("Matei","Florin");
        Florin.executie();
        Florin.proiecteaza();

        PersoanaItistInterface Alex=new PersoanaItistInterface("Dorha", "Alex");
        Alex.scrieCod();
        Alex.ruleazaCod();

        PersoanaInginerItistInterface Superman=new PersoanaInginerItistInterface("Matei", "Florin");
        Superman.executie();
        Superman.proiecteaza();
        Superman.scrieCod();


        //4 concepte Inheritance, Encapsulation, Polymorphism, and Data abstraction
    }
}
