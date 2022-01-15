package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    @Test
    public void testautomat(){
       multiminumereArray();
       multimiprenumeArray();
       multimilist();
       multimivaloriHashMap();
       multimitariorase();
    }
    public void multiminumereArray(){
       Integer[]numere=new Integer[3];
       numere[0]=5;
       numere[1]=6;
       numere[2]=7;
       for (Integer index=0;index<numere.length;index++){
           System.out.println(numere[index]);
       }
    }
    public void multimiprenumeArray(){
        String[]prenume=new String[4];
        prenume[0]="Matei";
        prenume[1]="Florin";
        prenume[2]="Roxana";
        prenume[3]="Alex";
        for(Integer index=0;index<prenume.length;index++){
            System.out.println(prenume[index]);

        }
    }
    public void multimilist(){
        List<String> prenume=new ArrayList<>();
        prenume.add("Matei");
        prenume.add("Florin");
        prenume.add("Roxana");
        for(Integer index=0;index<prenume.size();index++){
            System.out.println(prenume.get(index));

        }
    }
    public void multimivaloriHashMap(){
        //HashMap functioneaza dupa logica key=value.
        HashMap<String,String> obiectediferite=new HashMap<>();
        obiectediferite.put("fruct","mar");
        obiectediferite.put("leguma","morcov");
        obiectediferite.put("haina","bluza");
        for (String key: obiectediferite.keySet()){
            System.out.println("Cheia este "+ key);
            System.out.println("Valoarea este "+obiectediferite.get(key));

        }
        Object firstKey = obiectediferite.keySet().toArray()[0];
        Object valueForFirstKey = obiectediferite.get(firstKey);
        System.out.println("Prima cheie este "+firstKey.toString());
        System.out.println("Prima valoare este "+valueForFirstKey.toString());
    }

    public void multimitariorase(){
        List<String> oraseromania=new ArrayList<>();
        oraseromania.add("Cluj");
        oraseromania.add("Bucuresti");
        oraseromania.add("Iasi");
        List<String> orasespania=new ArrayList<>();
        orasespania.add("Barcelona");
        orasespania.add("Madrid");
        orasespania.add("Valencia");
        orasespania.add("Bilbao");
        HashMap<String,List<String>> tariorase=new HashMap<>();
        tariorase.put("Romania",oraseromania);
        tariorase.put("Spania",orasespania);
        for (String key: tariorase.keySet()){
            System.out.println("Tara este "+ key);
            System.out.println("Orasele sunt "+tariorase.get(key));

        }


    }
}
