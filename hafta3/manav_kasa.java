package hafta3;

import java.util.ArrayList;
import java.util.Scanner;




public class manav_kasa {

    public static void main(String[] args) {
    while(true){
        System.out.println("Manavcima hosgeldiniz\n***************************************************************\nSizlere en uygun fiyatlı ve en yakın lokasyonlardan hizmet veriyoruz");

        Scanner giris = new Scanner(System.in);


        int armutKasa = 200;
        int domatesKasa = 200;
        double elmaKasa = 200;
        int muzKasa = 1000; //Adet degeri




            System.out.println("Kac kilo Armut istersiniz : ");
            double armut = giris.nextDouble();

        if (armut > armutKasa){

            System.out.println("Yetersiz Stok Durumu"+armutKasa);
            3 * armut = armutKasa;
            System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\n ");
            System.out.println("Stok yenilendi: "+armutKasa);

        }
        else {
            armutKasa = armutKasa - armut;
            System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\nKalan stok" +armutKasa+ "Gr");
        }

        double armut_tl = armut * 12;










            System.out.println("Kac kilo Domates istersiniz : ");
            double domates = giris.nextDouble();
        if (domates > domatesKasa){
            System.out.println("Yetersiz Stok Durumu"+domatesKasa);
            3 * domates = domatesKasa;
            System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\n ");
            System.out.println("Stok yenilendi: "+domatesKasa);

            }
            else {
                domatesKasa = domatesKasa - domates;
                System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\nKalan stok" +domatesKasa+ "Gr");
            }

        double domates_tl = domates * 15;




            System.out.println("Kac kilo Elma istersiniz : ");
        double elma = giris.nextDouble();

            if (elma > elmaKasa){
                System.out.println("Yetersiz Stok Durumu"+elmaKasa);
                3 * elma = elmaKasa;
                System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\n ");
                System.out.println("Stok yenilendi: "+elmaKasa);

                }
                else {
                    elmaKasa = elmaKasa - elma;
                    System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\nKalan stok" +elmaKasa+ "Gr");
                }

        double elma_tl = elma * 16;


        System.out.println("Kac adet Muz istersiniz : ");
        double muz = giris.nextDouble();

        if (muz > muzKasa){

            System.out.println("Yetersiz Stok Durumu"+muzKasa);
            3 * muz = muzKasa;
            System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\n ");
            System.out.println("Stok yenilendi: "+muzKasa);

        }
        else {
            muzKasa = muzKasa - muz;
            System.out.println("Siparisiniz hazirlaniyor, afiyet olsun\nKalan stok" +muzKasa+ "Gr");
        }


        double muz_tl = muz * 0.95;




        double toplam = armut_tl + domates_tl + elma_tl + muz_tl ;

        System.out.println("Armut = " + armut_tl + "TL\nDomates = " + domates_tl + "TL\nElma = " + elma_tl + "TL\nMuz = " + muz_tl + "TL\n");

        System.out.println("Toplam Fiyat = " + toplam + "TL");
    }
    }
}

//Kendime bir not: Her şeyi düzeltmeye kalkışmanın yok ettiği


//***********************************************************************************************************************************************************************************************

// ilk oluşturmaya çalıştığım kod bloğu aşağıdadır. Şuan pek bir vaktim kalmadığı için bu şekilde paylaşıyorum. Tekrar tam haliyle düzenliyeceğim.

      /* @SuppressWarnings("ReassignedVariable")
public  class  manavci {

    class hal{
        int elma;

        int armut;
        int portakal;
         void dukkan1 (int elma, int armut, int portakal){
                while (elma<1){
                    System.out.println(elma);
                }
         void dukkan2 (int){
                null
                }
         }

        }

            public static void main(String[] args){


        Scanner manavci = new Scanner(System.in);

        hal dukkan1 = new hal;


        while(true){


            System.out.println("""
        Manavcima hosgeldiniz\n***************************************************************\nSizlere en uygun fiyatl&#x131; ve en yak&#x131;n lokasyonlardan hizmet veriyoruz
        \n
        1-Elma\n
        2-Armut\n
        3-Limon\n
        Tercihinizi giriniz:
       """);

        int islemler = manavci.nextInt();

        /* switch (islemler){

            case 1:
                System.out.println("Kac gram elma almak istersiniz: ");
                int elma = manavci.nextInt();

                int ElmakasaHacmi= 1200000000;

                if (elma>12000){

                    int a = elma - ElmakasaHacmi;
                    //Burda &ouml;nceden bir s&#x131;n&#x131;f olu&#x15F;turulacak ve stokda olmayan elma diger bir dukkandan  veya halden  temin edilecek.

                    System.out.println("Kalan stok" +a+ "Gr");
                }
                else {
                    ElmakasaHacmi = ElmakasaHacmi - elma;
                    System.out.println("Kalan stok" +ElmakasaHacmi+ "Gr");

                }

                }





















