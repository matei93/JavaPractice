package ClasaAbstracta;

import javax.sound.midi.Soundbank;

public abstract class PersoanaAbstract {
  //Clase Abstracte=pot sau nu sa contina metode abstracte.
  //Clasa care extinde o clasa abstracta=implementeaza toate metodele abstracte.
  //O clasa abstracta poate sa contina un constructor=tot nu putem declara un obiect.
  //Metodele abstracte folosesc cuvantul"abstract".
  //O clasa abstracta poate implementa o interfata.
  //O interfata nu poate extinde o clasa abstracta.
  //Metodetele sunt publice

   public abstract void proiecteaza();
   public abstract void executie();
   public abstract void scrieCod();
   public abstract void ruleazaTeste();
   public void afiseazaVarsta(Integer varsta){
       System.out.println("Are varsta de "+ varsta);
   }
}
