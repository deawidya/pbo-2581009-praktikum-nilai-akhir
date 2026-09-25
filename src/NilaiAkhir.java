import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        // Empat bobot disimpan sebagai konstanta double, sesuai ketentuan
        // Tidak perlu kurung di sini karena tiap baris hanya berisi SATU nilai
        // literal yang langsung disimpan ke satu variabel — tidak ada operator
        // (*, +, /) yang digabung dalam satu ekspresi, jadi tidak ada urutan
        // pengerjaan (precedence) yang perlu diatur dengan kurung.
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

        // ===== Catatan percobaan versi int (bukan versi yang dipakai) =====
        // praktikum * 30 / 100 + tugas * 20 / 100 + mid * 20 / 100 + finalNilai * 30 / 100
        // dengan semua variabel bertipe int menghasilkan 78, bukan 79.1 seperti versi double.
        // Sebabnya: setiap pembagian int/int (mis. 85*30/100 = 2550/100) dibulatkan ke bawah
        // SEBELUM dijumlahkan, karena hasil pembagian antar int selalu int — pecahan tiap
        // suku sudah hilang duluan. Sama persis dengan kasus 1024 vs 1024.0 minggu lalu.
        int akhirVersiInt = (int) praktikum * 30 / 100 + (int) tugas * 20 / 100
                + (int) mid * 20 / 100 + (int) finalNilai * 30 / 100;

        // Nilai akhir dihitung dalam satu ekspresi tanpa satu pun kurung.
        // Ini valid apa adanya karena operator * (perkalian) punya precedence lebih
        // tinggi daripada + (penjumlahan), jadi Java otomatis mengerjakan setiap
        // perkalian bobot dulu, baru menjumlahkan hasilnya.
        double akhir = praktikum * BOBOT_PRAKTIKUM + tugas * BOBOT_TUGAS + mid * BOBOT_MID;
        akhir += finalNilai * BOBOT_FINAL; // komponen final ditambahkan lewat augmented assignment
        int dipotong = (int) akhir;          // memotong ke arah nol — pecahannya dibuang
        long dibulatkan = Math.round(akhir); // membulatkan ke bilangan bulat terdekat
        double selisih = akhir - dibulatkan; // tidak selalu 0 — double menyimpan pecahan secara mendekati

        boolean lulus = akhir >= 60;

        System.out.println("-------------------------------------");
        System.out.println("Nilai Akhir =" + akhir);
        System.out.println("dipotong   =  " + dipotong);
        System.out.println("dibulatkan = " + dibulatkan);
        System.out.println("versi int  = " + akhirVersiInt);

        System.out.println("-------------------------------------");
        System.out.println("===== NILAI AKHIR =====");
        System.out.println("Praktikum   : " + praktikum + "  (30%)");
        System.out.println("Tugas       : " + tugas + "  (20%)");
        System.out.println("MID         : " + mid + "  (20%)");
        System.out.println("Final       : " + finalNilai + "  (30%)");
        System.out.println("-------------------------------------");
        System.out.println("Nilai akhir       : " + akhir);
        System.out.println("Dipotong   (int)  : " + dipotong);
        System.out.println("Dibulatkan (round): " + dibulatkan);
        System.out.println("Selisih           : " + selisih);
        System.out.println("Lulus (>=60)      : " + lulus);

        scanner.close();
    }
}