package ClasaAbstracta;

import Interfata.PersoanaInginerItistInterface;
import org.junit.Test;

public class AbstractTest {
    @Test
    public void testAutomat(){
        PersoanaInginerAbstract Florin=new PersoanaInginerAbstract("Florin", "matei");
        Florin.proiecteaza();
        Florin.executie();
        Florin.afiseazaVarsta(28);

        PersoanaItistAbstract Alex=new PersoanaItistAbstract("Dorha", "Alex");
        Alex.scrieCod();
        Alex.ruleazaTeste();
        Alex.afiseazaVarsta(27);

        PersoanaInginerItistAbstract Superman=new PersoanaInginerItistAbstract("Super", "Man");
        Superman.proiecteaza();
        Superman.executie();
        Superman.scrieCod();
        Superman.ruleazaTeste();
        Superman.afiseazaVarsta(1000);

    }
}
