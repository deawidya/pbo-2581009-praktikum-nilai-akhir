import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        // Empat bobot disimpan sebagai konstanta double, sesuai ketentuan
        final double BOBOT_PRAKTIKUM = 0.30;
        final double BOBOT_TUGAS = 0.20;
        final double BOBOT_MID = 0.20;
        final double BOBOT_FINAL = 0.30;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai praktikum : ");
        double praktikum = scanner.nextDouble();
        System.out.print("Nilai tugas     : ");
        double tugas = scanner.nextDouble();
        System.out.print("Nilai MID       : ");
        double mid = scanner.nextDouble();
        System.out.print("Nilai final     : ");
        double finalNilai = scanner.nextDouble();

        // Nilai akhir dihitung dalam satu ekspresi tanpa satu pun kurung.
        // Ini valid apa adanya karena operator * (perkalian) punya precedence lebih
        // tinggi daripada + (penjumlahan), jadi Java otomatis mengerjakan setiap
        // perkalian bobot dulu, baru menjumlahkan hasilnya.
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;

        System.out.println("Nilai Akhir =" + akhir);

        scanner.close();
    }
}