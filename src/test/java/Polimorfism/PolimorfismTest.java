package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {
    @Test
    public void testAutomat(){
        Caine Labrador=new Caine("GoldenRetriever", "Medie", "Alb-Auriu");
        Labrador.scoateSunet();
        Labrador.apeleazaMetodaParinte();
        Labrador.cumparaProduse();
        Labrador.cumparaProduse("Lesa");
        Labrador.cumparaProduse(2);
        System.out.println(Labrador.culoareBlana);
    }
}
