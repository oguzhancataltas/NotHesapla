import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notuzunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double toplam = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        String sonuc = toplam > 60 ? "Geçtiniz":"Kaldınız";
        System.out.print(sonuc + " Notunuz : " + toplam);


    }
}
