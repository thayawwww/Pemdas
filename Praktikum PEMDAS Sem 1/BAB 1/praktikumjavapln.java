import java.util.Scanner;

public class praktikumjavapln {
    public static void main(String[] args){
        Scanner put = new Scanner(System.in);

        String nama, kelurahan;
        int awal, akhir, beban, pjj;
        System.out.print("Masukkan Nama : ");
        nama = put.nextLine();
        System.out.print("Kelurahan : ");
        kelurahan = put.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        awal = put.nextInt();
        System.out.print("Masukkan posisi awal Kwh Meter : ");
        akhir = put.nextInt();
        System.out.print("Masukkan biaya beban saat ini : ");
        beban = put.nextInt();
        System.out.print("Masukkan PPJ (dalam persen) : ");
        pjj = put.nextInt();

        int pema = akhir - awal;
        int tarif = pema * beban;
        double ppj = tarif * ((double)pjj / 100);
        double total = tarif + ppj;

        System.out.println("=============================" + "PLN Java" + "=============================");
        System.out.printf("Nama            : %s\n", nama);
        System.out.printf("Kelurahan       : %s\n", kelurahan);
        System.out.printf("Pemakaian bulan ini : %d Kwh Meter\n", pema  );
        System.out.printf("Tarif Listrik   : Rp %d,-\n", tarif );
        System.out.printf("PPJ 10 %%       : Rp %.0f,-\n", ppj );
        System.out.printf("Total Bayar     : Rp %.0f,-\n", total );
        System.out.println("==================================================================");
        put.close();
    }
}