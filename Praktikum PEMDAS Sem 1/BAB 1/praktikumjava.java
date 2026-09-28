import java.util.Scanner;

    public class praktikumjava {
        public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        int op1, op2;
        System.out.print("masukkan operator pertama : ");
        op1 = put.nextInt();
        System.out.print("masukkan operator kedua : ");
        op2 = put.nextInt();

        int hasil1 = op1 + op2;
        System.out.println("hasil penjumlahannya : " + hasil1);

            int  hasil2 = op1-op2;
        System.out.println("hasil pengurangannya : " + hasil2);

            int  hasil3 = op1*op2;
        System.out.println("hasil penkalian      : " + hasil3);
        
            double  hasil4 = (double)op1/op2;
        System.out.println("hasil pembagian      : " + hasil4);


        
        put.close();
    }
}