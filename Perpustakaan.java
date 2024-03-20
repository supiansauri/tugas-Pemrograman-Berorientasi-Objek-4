public class Perpustakaan {
    String nama;
    int jumlahBuku;

    public Perpustakaan(String nama, int jumlahBuku) {
        this.nama = nama;
        this.jumlahBuku = jumlahBuku;
    }

    public void printInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Jumlah Buku: " + this.jumlahBuku);
    }
}

public class PerpustakaanSekolah extends Perpustakaan {
    int jumlahBukuDipinjam;

    public PerpustakaanSekolah(String nama, int jumlahBuku, int jumlahBukuDipinjam) {
        super(nama, jumlahBuku);
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Buku Dipinjam: " + this.jumlahBukuDipinjam);
    }
}

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan1 = new Perpustakaan("Perpustakaan Sekolah 1", 1000);
        Perpustakaan perpustakaan2 = new PerpustakaanSekolah("Perpustakaan Sekolah 2", 800, 500);

        perpustakaan1.printInfo();
        perpustakaan2.printInfo();
    }
}