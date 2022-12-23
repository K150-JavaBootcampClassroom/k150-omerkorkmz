package hafta1;

import java.util.Scanner;


public class odev1 {

    public static void main(String[]args) {

        Scanner omer = new Scanner(System.in);

        int bakiye = 50000;


        System.out.println("BankATM'ye hosgeldiniz");





        System.out.println("Bakiye sorgulamak icin 1 nolu tusu tercih ediniz");
        System.out.println("Para cekeme islemleri  icin 2 nolu tusu tercih ediniz");
        System.out.println("Para yatırma islemleri icin 3 nolu tusu tercih ediniz");
        System.out.println("Cıkıs yapmak icin 4 nolu tusu tercih ediniz");


        while (true) {
            System.out.println("Lütfen işleminizi giriniz");
            int islemler = omer.nextInt();
            switch (islemler) {

                case 1:
                    System.out.println("Guncel bakiyeniz:" +bakiye+"TL'dir. ");

                    break;
                case 2:
                    System.out.println("Cekmek istediginiz miktari giriniz: ");
                    int paraCek = omer.nextInt();

                    if (paraCek < bakiye)
                    {
                        bakiye -= paraCek;
                        System.out.println("İsleminizi gerceklestiriyoruz: "+bakiye+" kalan bakiyeniz ");
                    }
                    else
                    {
                        System.out.println("Bakiyenizden yuksek bir miktar giridiniz");
                    }

                    break;

                case 3:
                    System.out.println("Yatirmak istediginiz miktari girin: ");
                    int paraYatir = omer.nextInt();
                    bakiye += paraYatir;
                    System.out.println("Guncel bakiyeniz: " +bakiye+ "'dir ");
                    break;


                case 4:
                    System.out.println("BankATM yi tercih ettiginiz icin tesekkur ederiz");


            }
        }

    }








}