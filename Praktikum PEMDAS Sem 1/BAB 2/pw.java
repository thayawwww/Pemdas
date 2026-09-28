import java.util.Scanner;
public class pw {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        System.out.print("buat nama: ");
        String nm = put.nextLine();
        System.out.print("buat password: ");
        String pw = put.nextLine();
        System.out.print("masukkan nama: ");
        String nms = put.nextLine();
        System.out.print("masukkan password: ");
        String pws = put.nextLine();
        String val = (nms.equals(nm)) && (pws.equals(pw))?"Nama: Athaya Ghaly Kendra\nNIM: 265150200111005": "data tak ditemukan";
        System.out.println(val);
    }
}
