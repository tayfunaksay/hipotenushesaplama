import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hipotenüs Hesaplama Programı");

        double kenar1, kenar2, hip;

        System.out.println("Birinci Kenarın Uzunluğunu Giriniz: ");
        Scanner inp = new Scanner(System.in);
        kenar1 = inp.nextDouble();
        System.out.println("İkinci Kenarın Uzunluğunu Giriniz: ");
        kenar2 = inp.nextDouble();

        hip=sqrt(kenar1*kenar1 + kenar2*kenar2);

        System.out.println("Hipotenüs Değeri : " + hip);
    }
}
