package Televizyonn;

public class Kanal {
    private String adi;
    private int kanalNo;

    public Kanal(String adi, int kanalNo) {
        this.adi = adi;
        this.kanalNo = kanalNo;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    public String kanalBilgisiniGoster(){
        return "Adı= "+adi+ "Numarası= "+kanalNo;
    }
}
