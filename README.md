📺 Java Televizyon Simülasyonu
Bu proje, Java programlama dili kullanılarak geliştirilmiş bir Televizyon Simülasyonu uygulamasıdır. Amaç, gerçek hayattaki bir televizyonun temel işlevlerini nesne yönelimli programlama (OOP) ilkeleriyle modellemektir.

🎯 Projenin Amacı
Bu uygulama ile kullanıcı, bir televizyonu açıp kapatabilir, ses ayarlarını yapabilir, kanallar arasında geçiş yapabilir ve yeni kanallar ekleyebilir. Kod yapısı, OOP prensipleri olan kalıtım (inheritance), kapsülleme (encapsulation) ve çok biçimlilik (polymorphism) esas alınarak oluşturulmuştur.

🧱 Sınıflar ve Yapısı
🔹 Televizyon sınıfı
Televizyonun tüm işlevselliği bu sınıfta tanımlanmıştır. Sahip olduğu temel özellikler:

Marka ve boyut bilgileri

Açık/Kapalı durumu

Ses seviyesi (0-20 arası)

Aktif kanal bilgisi

Kanal listesi (ArrayList<Kanal>)

🔹 Kanal (Soyut sınıf)
Tüm kanal türlerinin temelini oluşturur. Kanal adı ve kanal numarası gibi temel bilgileri içerir.

🔹 HaberKanali ve MüzikKanali sınıfları
Kanal sınıfından türetilmiş iki farklı kanal türüdür. Kendi türlerine özgü bilgileri içerir (örn: haber türü, müzik türü).

⚙️ Kullanılan Metotlar
📌 Televizyon İşlevleri
Metot	Açıklama
tvkurVeKanallariOlustur() Televizyon açık ise belirli kanallar oluşturulur.
tvAc()	Televizyonu açar. Açık ise uyarı verir.
tvKapa()	Televizyonu kapatır. Kapatılırken en son izlenen kanalı bildirir.
sesArttir()	Ses seviyesini bir kademe artırır (max 20). TV kapalıysa işlem yapılmaz.
sesAzalt()	Ses seviyesini bir kademe azaltır (min 0). Ses göstergesi çizgilerle gösterilir.
aktifKanalGoster()	Şu an izlenmekte olan kanalı ekrana yazdırır.
kanalListesiniGoster()	Tüm mevcut kanalları listeler.
kanalEkle(ad, no, tur, tip)	Yeni kanal ekler. Kanal tipi "haber" veya "muzik" olarak belirtilebilir.
kanalDegistir(no)	Belirtilen kanal numarasına geçiş yapar. TV kapalıysa işlem yapılmaz.
