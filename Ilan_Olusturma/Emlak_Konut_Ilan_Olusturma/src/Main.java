import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte ilanTipi;
        String a="EVET";

        do {
            System.out.println("İlan Oluşturma Sayfasına Hoş Geldiniz Emlak için 1'i, Vasıta için 2'yi, İlan oluşturmadan Çıkmak için Farklı Bir  Rakamı Tuşlayabilirsiniz");
            System.out.print("Hangi Tür ilan girmek istiyorsunuz=");
             ilanTipi = input.nextByte();
            if (ilanTipi == 1) {
                Emlak emlak = new Emlak();
                emlak.ilanBasligi();
                emlak.ilanAciklama();
                emlak.odaSayisi();
                emlak.alan();
                emlak.siteIcı(a);
                emlak.kat();
                emlak.banyoSayi();
                emlak.sehir();
                emlak.ilce();
                emlak.sahibinden(a);

                System.out.println("-----------------------------------");
                System.out.println("İlan Başlığı: "+emlak.ilanBasligi);
                System.out.println("İlan Açıklaması: "+emlak.ilanAciklamasi);
                System.out.println("Oda Sayısı: "+emlak.odaSayisi);
                System.out.println("Alan(m2): "+emlak.alan);
                System.out.println("Kat: "+emlak.kat);
                System.out.println("Site İçerisinde mi: "+emlak.siteIcerisindeMi);
                System.out.println("Banyo Sayısı: "+emlak.banyoSayisi);
                System.out.println("Şehir: "+emlak.sehir1);
                System.out.println("İlçe: "+emlak.ilce);
                System.out.println("Sahibinden mi: "+emlak.sahibindenMi);


            } else if (ilanTipi == 2) {
                Vasita vasita = new Vasita();
                vasita.ilanBasligi();
                vasita.ilanAciklama();
                vasita.sehir();
                vasita.ilce();
                vasita.vitesTipi();
                vasita.renk();
                vasita.kazali(a);
                vasita.sahibinden(a);

                System.out.println("-----------------------------------");
                System.out.println("İlan Başlığı: "+vasita.ilanBasligi);
                System.out.println("İlan Açıklaması: "+vasita.ilanAciklamasi);
                System.out.println("Aracın Bulunduğu Şehir: "+vasita.sehir1);
                System.out.println("Aracın Bulunduğu ilçe: "+vasita.ilce);
                System.out.println("Aracın Vites Tipi: "+vasita.vitesTipi);
                System.out.println("Aracın Rengi: "+vasita.renk);
                System.out.println("Araç Kazalı Mı: "+vasita.kazaliMi);
                System.out.println("Araç Sahibinden Mi: "+vasita.sahibindenMi);
            }

        }while(ilanTipi==1 || ilanTipi==2);

    }
}
