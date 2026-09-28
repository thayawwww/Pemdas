import java.util.Scanner;
    public class bangundatar{
        public static void main(String[] args){
        Scanner put = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");

        int pil;
        float a,b,r;

        System.out.print("pilihan anda: ");
        pil = put.nextInt();
         if(pil>3 || pil<1){
            System.out.println("Data tak ditemukan, program dihentikan ...");
            put.close();
            return;
         }
        

        switch (pil){
            case 1:
                System.out.print("Masukkan a: ");
                a = put.nextFloat();
                System.out.print("Masukkan b: ");
                b = put.nextFloat();               
                System.out.printf("%-30s: %.0f cm\n", "Keliling persegi panjang", (2*a+2*b));
                System.out.printf("%-30s: %.0f cm2\n", "luas persegi panjang", (a*b));
                break;
            case 2:
                System.out.print("Masukkan r: ");
                r = put.nextFloat();
                System.out.printf("%-30s: %.0f cm\n", "Keliling lingkaran", (2*3.14*r));
                System.out.printf("%-30s: %.0f cm2\n", "luas lingkaran", (3.14*r*r));
                break;
            case 3:
                System.out.print("Masukkan a: ");
                a = put.nextFloat();
                System.out.print("Masukkan b: ");
                b = put.nextFloat();
                System.out.print("Masukkan r: ");
                r = put.nextFloat();
                System.out.printf("%-30s: %.0f cm\n", "Keliling segitiga", (a+b+r));
                System.out.printf("%-30s: %.0f cm2\n", "luas segitiga", (a*b*0.5));
                break;
            default:
                System.out.println("");

        }
        put.close();
    }

        
    }