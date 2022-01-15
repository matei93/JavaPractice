package MostenireIncapsulare;

import org.junit.Test;

import java.util.Arrays;

public class MostenireTest {
    @Test
    public void testautomat(){
        Audi AudiA3=new Audi("HatchBack","4x4",
                             "Integrala",4,5,"roz bombon",
                             Arrays.asList("interior piele","volan incalzit","ventilatie scaune","plafon carbon"),
                             40000,"A3");
        AudiA3.infoMasina();
        AudiA3.pretfinal();

        Audi AudiA8=new Audi("Limuzina","4x4",
                "Integrala",4,6,"mov",
                Arrays.asList("interior piele","volan incalzit","ventilatie scaune"),
                100000,"A8");

        AudiA8. infoMasina();
        AudiA8.setCuloare("Negru");
        AudiA8. infoMasina();

        Toyota Auris=new Toyota("Compacta", "Manuala","2x4",2, 4, "Albastru Marin",
                                 Arrays.asList("interior piele", "volan incalzit", "ventilatie scaune", "plafon carbon"),35000,"Auris", "Hybrid");



        Auris. infoMasina();
        Auris. pretfinal();



    }
}
