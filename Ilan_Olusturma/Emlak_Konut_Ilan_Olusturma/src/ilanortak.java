import java.util.Scanner;

public class ilanortak {

    String ilanBasligi;
    String ilanAciklamasi;
    String sehir1;
    String ilce;
    Boolean sahibinden;
    String sahibindenMi;

    Scanner input=new Scanner(System.in);

    String[] sehirler ={"Adana","Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin",
            "Aydın", "Balıkesir","Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale",
            "Çankırı", "Çorum","Denizli","Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum ", "Eskişehir",
            "Gaziantep", "Giresun","Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir",
            "Kars", "Kastamonu", "Kayseri","Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya ", "Malatya",
            "Manisa", "Kahramanmaraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya",
            "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon  ", "Tunceli", "Şanlıurfa", "Uşak",
            "Van", "Yozgat", "Zonguldak", "Aksaray", "Bayburt ", "Karaman", "Kırıkkale", "Batman", "Şırnak",
            "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük ", "Kilis", "Osmaniye ", "Düzce"};
    public void ilanBasligi()
    {
        System.out.print("İlan Başlığı Giriniz=");
        ilanBasligi=input.nextLine();
    }
    public void ilanAciklama(){
        System.out.print("İlan Açıklaması Giriniz=");
        ilanAciklamasi=input.nextLine();
    }
    public void ilce(){
        System.out.print("İlçe Giriniz=");
        ilce=input.nextLine();
    }
    public String sahibinden(String a){
        System.out.print("Sahibinden mi (Evet/Hayır)=");
        a = input.nextLine().toUpperCase();
        if (a.equals("EVET")) {
            sahibinden = true;
            sahibindenMi="Evet";
        } else if (a.equals("HAYIR")) {
            sahibinden = false;
            sahibindenMi="Hayır";
        } else {
            System.out.println("Lütfen Evet ya da Hayır Değerlerinden 1 tanesini Giriniz!");
            sahibinden(a);
        }
        return a;

    }
    public void sehir(){
        boolean a = false;
        System.out.print("Şehir Giriniz=");
        sehir1=input.nextLine();
        for (int i = 0; i < sehirler.length ; i++) { //Değer ataması için for kullanıyoruz sayilar[i] = (int)(Math.random()*1000); //Tüm elemanlarına 0-999 arasında değerler atıyoruz } int max = 0; //başlangıç değerleri

            for (String sehir : sehirler) {
                sehir=sehir.toUpperCase();
                sehir1=sehir1.toUpperCase();
                if(sehir.equals(sehir1)) {
                    a=true;
                    break;
                }
            }

        }
        if (a==true){

        }
        else {
            System.out.println("Lütfen Geçerli Bir Şehir İsmi Giriniz!!");
            sehir();
        }


    }

}

