import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Değişkenleri Oluştur mesut
        double armut, elma, domates, muz, patlican;



        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç Kilo Armut Aldınız: ");
        armut = inp.nextDouble();

        System.out.print("Kaç Kilo Elma Aldınız:");
        elma = inp.nextDouble();

        System.out.print("Kaç Kilo Domates Aldınız: ");
        domates = inp.nextDouble();

        System.out.print("Kaç Kilo Muz Aldınız: ");
        muz = inp.nextDouble();

        System.out.print("Kaç Kilo Patlican Aldınız: ");
        patlican = inp.nextDouble();


        double toplam = ((armut * 2.14)+(elma * 3.67 )+(domates * 1.11)+(muz * 0.95 )+(patlican * 5.00 ) );


        System.out.println("Toplam Borcunuz: " + toplam + "TL");

    }
}