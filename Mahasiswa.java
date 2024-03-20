class Mahasiswa {
    String nim;
    String nama;

    Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    void printInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
    }
}

class Mahasiswa1 extends Mahasiswa {
    Mahasiswa1(String nim, String nama) {
        super(nim, nama);
    }

    void printInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Mahasiswa 1");
    }
}

class Mahasiswa2 extends Mahasiswa {
    Mahasiswa2(String nim, String nama) {
        super(nim, nama);
    }

    void printInfo() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Mahasiswa 2");
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("12345", "Supian");
        Mahasiswa mahasiswa2 = new Mahasiswa("67890", "Sauri");

        mahasiswa1.printInfo();
        mahasiswa2.printInfo();
    }
}