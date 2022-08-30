package studentPractise_17082022;

public class Depo {
   private String isim;
   private String frekans;

    public Depo(String isim, String frekans) {
        this.isim = isim;
        this.frekans = frekans;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getFrekans() {
        return frekans;
    }

    public void setFrekans(String frekans) {
        this.frekans = frekans;
    }

    @Override
    public String toString() {
        return
                "KANALIN ISMI = " + isim +
                " KANALIN FREKANSI = " + frekans;
    }
}
