package hafta2;

import java.util.Scanner;

//Tam olarak tamamlayadım. OOP mantığını nasıl kullanılacağını anladım fakat uygulamaya tam dökemedim.
class login{
    String kullaniciAdi;
    String sirketAdi;

}

public class aracKiralama {

    public static void main(String[] args) {
        int gunlukCarpan, AylikCarpan, YillikCarpan, a, b, c;
        Scanner input = new Scanner(System.in);

        login bireyselGiris = new login();

        bireyselGiris.kullaniciAdi = System.out.println("Kullanici adi belirleyin: ");
        String bireyselGiris = input.nextInt();




        login kurumsalGiris = new login();

        kurumsalGiris.sirketAdi = System.out.println("Kullanici adi belirleyin: ");
        String kurumsalGiris = input.nextInt();










        while (true) {
            System.out.println("Korkmaz RentCar'a Hosgeldiniz\n1-Gunluk kiralama\n2-Aylik kiralama\n3-Yillik kiralama\nLutfen kiralama suresini seciniz: ");
            int tercih = input.nextInt();

            switch (tercih) {
                case 1:

                    System.out.println("Gunluk kiralama ile yalnızca hatchback arac kiralayabilirsiniz");

                    System.out.println("Lutfen kiralamak istediginiz gun sayisini giriniz: ");
                    int gun = input.nextInt();
                    if (gun > 30) {
                        System.out.println("Bu secenk ile aylik kiralama yapamazsiniz!!. Lutfen 1 aydan kisa bir secim yapiniz");
                    } else {
                        gunlukCarpan = 20;
                        a = gunlukCarpan * gun;
                        System.out.println("Tercih ettiginiz zaman diliminde ödenecek tutar " + a + "'dolardir ");

                    }

                    break;


                case 2:
                    int girisTercihi = input.nextInt();
                    switch (girisTercihi) {
//                               System.out.println("Lutfen giris tercihinizi belirtiniz: \n 1-bir");
//                          }
//                         if(bireyselGiris){
//                             System.out.println("yalnizca hatchback arac kiralayabilirsiniz");
//                         }
//                          else {
//                             System.out.println("lutfen arac tercihinizi yapiniz: ");
//                         }


                    }


            }


        }


    }
}

