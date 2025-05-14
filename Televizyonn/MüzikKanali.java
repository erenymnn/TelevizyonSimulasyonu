package Televizyonn;

public class MüzikKanali extends Kanal {
    private String muzikTuru;

    public MüzikKanali(String adi, int kanalNo, String muzikTuru) {
        super(adi, kanalNo);
        this.muzikTuru = muzikTuru;
    }
}
