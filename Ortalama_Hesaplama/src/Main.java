import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int mat,fizik,kimya,tarih,resim,bedenEgtimi;

        //Scanner Tanımlama
        Scanner girdi= new Scanner(System.in);

        //Not değerleerini alma

        System.out.print("Matematik noutunuzu Girin: ");
        mat=girdi.nextInt();


        System.out.print("Fizik noutunuzu Girin: ");
        fizik=girdi.nextInt();

        System.out.print("Kimya noutunuzu Girin: ");
        kimya=girdi.nextInt();


        System.out.print("Tarih noutunuzu Girin: ");
        tarih=girdi.nextInt();


        System.out.print("Resim noutunuzu Girin: ");
        resim=girdi.nextInt();

        System.out.print("Beden Eğtimi noutunuzu Girin: ");
        bedenEgtimi=girdi.nextInt();

        //Girilen değeri hesaplama
        int ortalama =(mat+fizik+kimya+tarih+resim+bedenEgtimi)/6;

        //Geçip geçedeğini kullanıcıya bildirme

        System.out.print(ortalama>= 60 ?"Tebrikler Geçtiniz " :" Maalesef kaldınız");


    }
}