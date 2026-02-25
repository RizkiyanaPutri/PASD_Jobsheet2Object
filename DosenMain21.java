public class DosenMain21 {

    public static void main(String[] args) {

        Dosen21 dsn1 = new Dosen21();
        dsn1.idDosen = "DSN001";
        dsn1.nama = "Dr. Andi Wijaya";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Artificial Intelligence");
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " tahun");
        dsn1.tampilInformasi();

        Dosen21 dsn2 = new Dosen21(
                "DSN002",
                "Dr. Siti Rahma",
                true,
                2018,
                "Sistem Informasi"
        );

        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Data Science");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " tahun");
        dsn2.tampilInformasi();
    }
}