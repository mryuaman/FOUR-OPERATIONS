package DortIslemSorgu;
import java.util.Scanner;

public class DortIslemSorgu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        System.out.println("İlk sayıyı giriniz:");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        double sayi2 = scanner.nextDouble();

        double sonuc = 0;

        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez!");
                    return;
                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
