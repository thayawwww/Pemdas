import java.util.Scanner;
public class constAss {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String s = "filkom";
        String val = (s=="filkom")?"Brawijaya": "null";
        System.out.print("Masukkan Nama: ");
        String nm = put.nextLine();
        System.out.print("Masukkan NIM: ");
        String im = put.nextLine();
        String nam = nm.equals("Athaya Ghaly Kiendra")?nm: "Input nama salah";
        String nim = im.equals("265150200111005")?im: "Input NIM salah";
        System.out.println(nam+"\n"+nim);
        System.out.println(s+" "+val);
    }   
}
