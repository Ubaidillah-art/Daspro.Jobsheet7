import java.util.Scanner;
public class TugasTiket23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket, hargaTiket = 50000, diskon = 0, totalHarga = 0, totalTiket = 0, harga;
        String namaPelanggan;
        
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("\nTransaksi dibatalkan");
                break;
            }
            System.out.print("Berapa jumlah tiket yang dibeli? ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid, Masukkan lagi yang valid");
                continue;
            }
            if (tiket > 10) {
                diskon = (int) ((tiket * hargaTiket) * 0.15);
            }else if (tiket > 4) {
                diskon = (int) ((tiket * hargaTiket) * 0.10);
            }
            harga = tiket * hargaTiket - diskon;
            totalTiket += tiket;
            totalHarga += harga;
            System.out.println("Total yang harus dibayar: Rp "+harga);
            sc.nextLine();
        } while (true);
        System.out.println("Transaksi hari ini selesai.");
        System.out.println("Jumlah tiket yang terjual hari ini: "+totalTiket);
        System.out.println("Total hasil penjualan tiket hari ini: Rp "+totalHarga);
        sc.close();
    }
}
