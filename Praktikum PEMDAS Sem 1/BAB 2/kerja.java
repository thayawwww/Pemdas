import java.util.Scanner;
public class kerja {
    public static void main(String[] args) {
     Scanner put = new Scanner(System.in);
        float u = 0;
        float l = 0;
        float d = 0;
        float total = 0;
        int jam;
        System.out.print("Jam Kerja    : ");
        jam = put.nextInt();
        if(jam >= 50 && jam <= 60){
            u = jam*5000;
            l = 0;
            d = 0;
            total = u;
        } else if (jam > 60){
            u = 60*5000;
            l = (jam-60)*6000;
            d = 0;
            total = u + l;
        } else if (jam < 50 && jam > 0){
            u = jam*5000;
            l = 0;
            d = (50-jam)*1000;
            total = u - d;
        } else {
            System.out.println("Invalid");
        }
        System.out.printf("Upah     = Rp. %.0f", u);
        System.out.printf("\nlembur   = Rp. %.0f", l);
        System.out.printf("\nDenda    = Rp. %.0f", d);
        System.out.print("\n--------------------------");
        System.out.printf("\nTotal    = Rp. %.0f", total);
        put.close();
    }
}
