package Televizyonn;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private boolean acik;
    private int ses;
    private int aktifKanal;
    //arraylist içinde tipi kanal olan veriler olacak kanal yerine haberkanal yazabilirdik ama genel olması icin.
    private ArrayList<Kanal> Kanallar;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        //bu alttaki olmazsa arrayliste eklenemez elemanlar hata verir.
        Kanallar = new ArrayList<>();
        ses=10;
        aktifKanal=1;
        kanallariOlustur();
        this.acik = false;
    }
    public void sesArttir(){
       if(ses<20 && acik==true){
           ses++;
           System.out.println("Ses seviyesi: "+ses);
       }else {
           System.out.println("Ses Maksimumda daha fazla arttıramazsın veya tv kapalı.");
       }
    }


    public void sesAzalt(){
        if(ses>0 && acik==true){
            ses--;
            System.out.print("Ses: [");
            for (int i = 0; i < ses; i++) System.out.print("|");
            for (int i = ses; i < 20; i++) System.out.print(" ");
            System.out.println("]");

        }else {
            System.out.println("Ses Minumumda daha fazla azaltılamaz veya tv kapalı.");
            System.out.print("Ses: [");
            for (int i = 0; i < ses; i++) System.out.print("|");
            for (int i = ses; i < 20; i++) System.out.print(" ");
            System.out.println("]");

        }
    }




    public void tvAc(){
        if(acik==false){
            acik = true;
            System.out.println("Tv acik");
        } else {
            System.out.println("Tv ZATEN AÇIK");
        }
    }
    public void tvKapa() {
        if(acik) {
            acik = false;
            System.out.println("TV kapatıldı. En son izlenen kanal: " +
                    Kanallar.get(aktifKanal - 1).kanalBilgisiniGoster());
        } else {
            System.out.println("TV zaten kapalı.");
        }
    }




    //ilk nesne oluşturuldugunda bunlar eklenecek.
    private void kanallariOlustur() {
     HaberKanali cnn = new HaberKanali("CNN ",1,"Genel Haber");
     Kanallar.add(cnn);
     HaberKanali bein = new HaberKanali("BeinSport ",3,"Spor Haber");
     Kanallar.add(bein);
     MüzikKanali dreamTurk=new MüzikKanali("Dream Turk ",2,"Yerli");
     Kanallar.add(dreamTurk);
     MüzikKanali numberOne=new MüzikKanali("Number one ",4,"Yabancı");
     Kanallar.add(numberOne);


    }
    public void aktifKanalGoster(){
        if(acik)
        System.out.println("Aktif Kanal: "+Kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
         else System.out.println("Önce televizyonu acınız");
    }
    public void kanalListesiniGoster() {
        if (acik) {
            System.out.println("Tüm Kanallar:");
            for (Kanal k : Kanallar) {
                System.out.println(k.kanalBilgisiniGoster());
            }
        } else {
            System.out.println("Lütfen önce televizyonu açınız.");
        }
    }
    public void kanalEkle(String ad, int no, String tur, String tip) {
        if(tip.equalsIgnoreCase("haber")) {
            Kanallar.add(new HaberKanali(ad, no, tur));
        } else if(tip.equalsIgnoreCase("muzik")) {
            Kanallar.add(new MüzikKanali(ad, no, tur));
        } else {
            System.out.println("Bilinmeyen kanal tipi.");
        }
    }





    public void kanalDegistir(int acilmasiistenenKanal){
        if(acik){
            if(acilmasiistenenKanal!=aktifKanal){
              if(acilmasiistenenKanal<=Kanallar.size() && acilmasiistenenKanal>=0){
                  aktifKanal=acilmasiistenenKanal;
                  System.out.println("Kanal: "+acilmasiistenenKanal+" Bilgi "+Kanallar.get(aktifKanal-1).kanalBilgisiniGoster());
              }else {
                  System.out.println("Geçerli bir kanal numarasi giriniz.");
              }

            }else {
                System.out.println("ZATEN "+aktifKanal+".dasınız");
            }
        }
        else {
            System.out.println("Televizyonu acınız");
        }
    }
    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }







    @Override
    public String toString() {
        return "Marka : " + marka + ", Boyut : " + boyut + "olan tv oluşturuldu...";
    }
}
