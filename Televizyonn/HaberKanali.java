package Televizyonn;

public class HaberKanali extends Kanal {
    private String haberTuru;

    //üst sınıfın constructeri ile birebir aynı oluşturman gerek diyor.
    public HaberKanali(String adi,int kanalNo,String tur) {
        super(adi, kanalNo);
        this.haberTuru =tur ;
    }
}
