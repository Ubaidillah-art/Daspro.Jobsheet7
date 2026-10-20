import java.util.Scanner;
public class TugasParkir23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        do {
            System.out.print("Masukkan jenis kendaraan anda! (1=mobil, 2=motor): ");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis ==2) {
                System.out.print("Masukkan durasi parkir anda: ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi*3000;
                }else{
                    total += durasi*2000;
                }
            }
        } while (jenis != 0);
        System.out.println("Total pembayaran parkir sebesar: Rp. "+total);
        sc.close();
    }
}
