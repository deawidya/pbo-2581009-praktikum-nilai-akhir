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
        akhir += finalNilai * BOBOT_FINAL; // komponen final ditambahkan lewat augmented assignment

        int dipotong = (int) akhir;          // memotong ke arah nol — pecahannya dibuang
        long dibulatkan = Math.round(akhir); // membulatkan ke bilangan bulat terdekat
        double selisih = akhir - dibulatkan; // tidak selalu 0 — double menyimpan pecahan secara mendekati

        System.out.println("Nilai Akhir =" + akhir);
        System.out.println("dipotong   =  " + dipotong);
        System.out.println("dibulatkan = " + dibulatkan);

        System.out.println();
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum   : " + praktikum + "  (30%)");
        System.out.println("Tugas       : " + tugas + "  (20%)");
        System.out.println("MID         : " + mid + "  (20%)");
        System.out.println("Final       : " + finalNilai + "  (30%)");
        System.out.println("Nilai akhir       : " + akhir);
        System.out.println("Dipotong   (int)  : " + dipotong);
        System.out.println("Dibulatkan (round): " + dibulatkan);
        System.out.println("Selisih           : " + selisih);

        scanner.close();
    }
}