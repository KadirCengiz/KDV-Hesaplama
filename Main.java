import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;

        Scanner input=new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        tutar= input.nextDouble();

        //kdvTutar = tutar*kdvOrani;
        kdvTutar=(tutar<=1000? tutar*0.18:tutar*0.08);
        kdvliTutar =tutar+kdvTutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV Tutar: "+kdvTutar);
        System.out.println("KDV'li Tutar: "+kdvliTutar);
    }
}