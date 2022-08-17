import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Emlak extends ilanortak {

    String odaSayisi;
    int alan;

    @Override
    public void ilanBasligi() {
        super.ilanBasligi();
    }

    @Override
    public void ilanAciklama() {
        super.ilanAciklama();
    }

    @Override
    public void ilce() {
        super.ilce();
    }


    @Override
    public String sahibinden(String a) {
        return super.sahibinden(a);
    }

    @Override
    public void sehir() {
        super.sehir();
    }

    int kat;
    Boolean siteIcerisinde;
    String siteIcerisindeMi;
    int banyoSayisi;

    Scanner input=new Scanner(System.in);

    public void odaSayisi(){
        System.out.print("Oda Sayısını Giriniz=");
        odaSayisi=input.nextLine();
    }
    public void alan(){
        try {
            System.out.print("Alan(m2) Değerini Giriniz=");
            alan=input.nextInt();
            input.nextLine();
        }
        catch (Exception e) {
            input.nextLine();
            System.out.println("Hata oluştu.. Lütfen Bu alana sadece sayıysal değer giriniz..."+e);
            alan();
        }

    }

    public String siteIcı(String a){
        System.out.print("Site İçerisinde mi (Evet/Hayır)=");
        a=input.nextLine().toUpperCase();
        if (a.equals("EVET")){
            siteIcerisinde=true;
            siteIcerisindeMi="Evet";
        } else if (a.equals("HAYIR")) {
           siteIcerisinde=false;
           siteIcerisindeMi="Hayır";
        }
        else {
            System.out.println("ütfen Evet ya da Hayır Değerlerinden 1 tanesini Giriniz!");
            siteIcı(a);
        }
        return a;
    }
    public void kat(){
        try {
            System.out.print("Kat Sayısını Giriniz=");
            kat = input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e)
        {
            input.nextLine();
            System.out.println("Hata oluştu.. Lütfen Bu alana sadece sayıysal değer giriniz..."+e);
            kat();
        }

    }
    public void banyoSayi(){
        try {

            System.out.print("Banyo Sayısınız Giriniz=");
            banyoSayisi=input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e)
        {
            input.nextLine();
            System.out.println("Hata oluştu.. Lütfen Bu alana sadece sayıysal değer giriniz..."+e);
            banyoSayi();
        }
    }




}
