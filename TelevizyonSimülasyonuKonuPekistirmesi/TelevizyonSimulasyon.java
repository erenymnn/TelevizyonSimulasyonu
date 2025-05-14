package TelevizyonSimülasyonuKonuPekistirmesi;

import Televizyonn.Televizyon;

import java.util.Scanner;

public class TelevizyonSimulasyon {
    static Scanner tara = new Scanner(System.in);
    static Televizyon tv;
    public static void main(String[] args) {

        menuGoster();
        boolean cikis=false;

        while(cikis==false){
            System.out.println("Seciminiz : {Menüyü görmek için 8i tuşlayın.}");
            int secim=tara.nextInt();
            switch(secim){
                case 1:
                  tvkurVeKanallariOlustur();
                  break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesArttir();
                    break;
                case 4:
                    sesAzalt();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 7:
                    tvKapa();
                    break;
                case 8:
                    menuGoster();
                    break;
                case 9:
                    if(tv != null){
                        tv.kanalListesiniGoster();
                    } else {
                        System.out.println("Önce TV'yi kurun.");
                    }
                    break;
                case 10:
                    if(tv != null){
                        tara.nextLine(); // dummy line
                        System.out.println("Kanal adı:");
                        String ad = tara.nextLine();
                        System.out.println("Kanal numarası:");
                        int no = tara.nextInt();
                        tara.nextLine();
                        System.out.println("Kanal türü (Yerli/Yabancı vb.):");
                        String tur = tara.nextLine();
                        System.out.println("Kanal tipi (haber/muzik):");
                        String tip = tara.nextLine();
                        tv.kanalEkle(ad, no, tur, tip);
                    } else {
                        System.out.println("Önce TV'yi kurun.");
                    }
                    break;


                case 0:
                    System.out.println("Sistemden çıkılıyor.");
                    cikis=true;
                    break;
                    default:
                        System.out.println("0 - 8 arasında bir değer giriniz..");
                         break;
            }
        }
    }

    private static void kanalBilgisiniGoster() {
        if(tv!=null){
           tv.aktifKanalGoster();
        }else {
            System.out.println("Önce tvyi kurun ve kanallari degistirin");
        }

    }

    private static void kanalDegistir(){
        if(tv!=null){
            System.out.println("Hangi kanala gitmek istersiniz?\n");
            int acilmasiistenenkanal=tara.nextInt();
            tv.kanalDegistir(acilmasiistenenkanal);
        }else {
            System.out.println("Önce tvyi kurun ve kanallari degistirin");
        }
}
    private static void sesArttir() {
        if(tv != null){
            tv.sesArttir();
        }else {
            System.out.println("Önce Tvyi Kurun Ve Kanallari Olusturun.");
        }
    }
    private static void sesAzalt() {
        if(tv != null){
            tv.sesAzalt();
        }else {
            System.out.println("Önce Tvyi Kurun ve Kanallari Olusturun.");
        }
    }

    private static void tvKapa() {
        if(tv != null){
            tv.tvKapa();
        }else {
            System.out.println("Önce TV'yi Kurun ve kanallari olusturun ");
        }
    }

    private static void tvAc() {
        if(tv != null){ // tv var mı demek yani tv kurulu mu
            tv.tvAc();
        }else {
            System.out.println("Önce TV'yi Kurun ve kanallari olusturun ");
        }
    }

    private static void tvkurVeKanallariOlustur() {

        if(tv==null){
            tara.nextLine();//bu satırı yapmazsak taranextline bize televizyon marka ve boyutu değer almadan 2 sini aynı anda sorar.
            System.out.println("Televizyonun markasını giriniz");
            String marka=tara.nextLine();
            System.out.println("Televizyonun Boyutunu giriniz");
            String boyut=tara.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        }
        else {  System.out.println("Zaten bir tv oluşturdunuzz.");
            System.out.println(tv);}




    }

    private static void menuGoster() {
        System.out.println("****************Menü*******************");
        System.out.println(  "0 -- Çıkış\n"+
                             "1 -- Televizyonu Kur\n" +
                             "2 -- Televizyonu Aç\n"+
                             "3 -- Sesini Arttır\n"+
                             "4 -- Sesi Azalt\n"+
                             "5 -- Kanal Değiştir\n"+
                             "6 -- Kanal Bilgisini Goster\n"+
                             "7 -- Televizyon Kapat \n"+
                             "8 -- Menuyu Tekrar Goster\n");

    }
}
