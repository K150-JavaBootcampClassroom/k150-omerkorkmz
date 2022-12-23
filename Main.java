package random;
import java.util.Random;
import java.util.Scanner;

//0 ile 500 aralığında olan sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
//50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
public class Main {
    public static void main(String[] args) {
        int sayac = 0, i = 0;
        int uretilenSayi = 0;

        Random r = new Random();

        while (i<1){
            uretilenSayi = r.nextInt(500);

            if(50 <uretilenSayi & uretilenSayi < 101){

                break;
            }
            sayac = sayac+1;
        }
        System.out.println(sayac+": Seferde  "+uretilenSayi);
    }
}















