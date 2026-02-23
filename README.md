# PASD Jobsheet 2 Object

## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method

## 2.1.2 Verifikasi Hasil Percobaan

<img width="464" height="125" alt="image" src="https://github.com/user-attachments/assets/291620c6-11c4-47a2-811f-4c145aec9e83" />

## 2.1.3 Pertanyaan

## 1. Sebutkan dua karakteristik class atau object!

Karakteristik pertama adalah atribut, yaitu data yang dimiliki oleh object dan yang kedua adalah method, yaitu tindakan atau perilaku yang bisa dilakukan object.

---

## 2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!

Ada 4 atribut, yaitu:
- String nama
- String nim
- String kelas
- double ipk

---

## 3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!

Ada 4 method, yaitu:
- void tampilkanInformasi()
- void ubahKelas(String kelasBaru)
- void updateIPK(double ipkBaru)
- String nilaiKinerja()

---

## 4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

Tambahkan:

```java
if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
    ipk = ipkBaru;
} else {
    System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
}
```
## 5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

Method nilaiKerja() menentukan kategori kinerja berdasarkan rentang IPK menggunakan struktur if-else if-else, lalu method mengembalikan sebuah String hasil = nilaiKinerja(); berupa kategori kinerja mahasiswa (kinerja sangat baik/baik/cukup/kurang).
