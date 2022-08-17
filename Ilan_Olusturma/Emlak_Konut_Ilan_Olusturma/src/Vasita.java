import java.awt.*;
import java.util.Scanner;

public class Vasita extends ilanortak {

    String vitesTipi;
    String renk;
    String kazaliMi;

    Boolean kazali;

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

    Scanner input = new Scanner(System.in);

    public void vitesTipi() {
        System.out.print("Aracın Vites Tipini Giriniz:");
        vitesTipi = input.nextLine();
    }

    public void renk() {
        System.out.print("Aracın Rengini Giriniz:");
        renk = input.nextLine();
    }

    public String kazali(String a) {
        System.out.print("Araç Kazalı mı? (Evet/Hayır)");
        a = input.nextLine().toUpperCase();
        if (a.equals("EVET")) {
            kazali = true;
            kazaliMi="Evet";
        } else if (a.equals("HAYIR")) {
            kazali = false;
            kazaliMi="Hayır";
        } else {
            System.out.println("Lütfen Evet ya da Hayır Değerlerinden 1 tanesini Giriniz!");
            kazali(a);
        }
       return a;


    }

}

