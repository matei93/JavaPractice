package MostenireIncapsulare;

import java.util.List;

public class Toyota extends Masina {

    private String culoare;
    private List<String> dotari;
    private Integer pret;
    private String model;
    private String motorizare;

    public Toyota(String tipCaroserie, String transmisie, String tractiune, Integer usi, Integer locuri,String culoare, List<String> dotari, Integer pret, String model, String motorizare) {
        super(tipCaroserie, transmisie, tractiune, usi, locuri);

        this.culoare=culoare;
        this.dotari=dotari;
        this.pret=pret;
        this.model=model;
        this.motorizare=motorizare;

    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotorizare() {
        return motorizare;
    }

    public void setMotorizare(String motorizare) {
        this.motorizare = motorizare;
    }

    public Integer getPret() {
        return pret;
    }

    public void pretfinal(){
        Integer pretfinal=pret;
        Integer index=0;
        while (index<dotari.size()){
            if (dotari.get(index).equals("interior piele")){
                pretfinal=pretfinal+ 800;
            }
            if (dotari.get(index).equals("volan incalzit")){
                pretfinal=pretfinal+ 1000;
            }
            if (dotari.get(index).equals("ventilatie scaune")){
                pretfinal=pretfinal+ 2500;
            }
            if (dotari.get(index).equals("plafon carbon")){
                pretfinal=pretfinal+ 1500;
            }
            index++;
        }
        System.out.println("Pretul final al masini Toyota model " +model+" este "+pretfinal);

    }
    public void infoMasina(){
        System.out.println("Detaliile despre masina Toyota model " + model + " sunt urmatoarele: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "tipCaroserie='" + getTipCaroserie() + '\'' +
                ", transmisie='" + getTransmisie() + '\'' +
                ", tractiune='" + getTractiune() + '\'' +
                ", usi=" + getUsi() +
                ", locuri=" + getLocuri() +
                ", culoare='" + getCuloare() + '\'' +
                ", dotari=" + getDotari() +
                ", pret=" + getPret() +
                ", model='" + getModel() + '\'' +
                ", motorizare='" + getMotorizare() + '\'' +
                '}';
    }
}
