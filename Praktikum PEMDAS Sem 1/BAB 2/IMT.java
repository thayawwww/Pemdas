import java.util.Scanner;
public class IMT {
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);
        float bb, tb, imt; 
        System.out.print("Berat badan (kg)    : ");
        bb = put.nextFloat();
        System.out.print("Tinggi badan (m)    : ");
        tb = put.nextFloat();
        imt = bb/(tb*tb);
        
        if (imt<=18.5)
            System.out.printf("IMT = %.2f  Termasuk kurus", imt);
        else if (imt > 18.5 && imt<=25)
            System.out.printf("IMT = %.2f  Termasuk normal", imt);
        else if (imt > 25 && imt<=30)
            System.out.printf("IMT = %.2f  Termasuk gemuk", imt);
        else {
            System.out.printf("IMT = %.2f  Termasuk kegemukan", imt);
        }
        put.close();
    }
}