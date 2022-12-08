package Giris;

import java.util.Scanner;

public class SinifGecmeDurum {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        int toplam = 0, sayi = 0 ;
        Scanner input = new Scanner(System.in);

        System.out.print("Mat : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100){
            toplam += mat;
            sayi++;
        }
        System.out.print("Fizik : ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100){
            toplam += fizik;
            sayi++;
        }
        System.out.print("Turkce : ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100){
            toplam += turkce;
            sayi++;
        }
        System.out.print("Kimya : ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100){
            toplam += kimya;
            sayi++;
        }
        System.out.print("Muzik");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100){
            toplam += muzik;
            sayi++;
        }

        double avarage = toplam / sayi;
        System.out.println("Ortalamaniz : "+toplam);
        if (avarage <= 55){
            System.out.println("Sinifta kaldiniz");
        }
        else {
            System.out.println("Tebrikler, gectin");
        }
    }
}
