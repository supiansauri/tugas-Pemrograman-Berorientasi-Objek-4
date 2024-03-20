public class Hewan {
    protected String jenisHewan;

    public Hewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }

    public String getJenisHewan() {
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan) {
        this.jenisHewan = jenisHewan;
    }
}

public class Kucing extends Hewan {
    public Kucing(String jenisKucing) {
        super(jenisKucing);
    }

    @Override
    public String toString() {
        return "Kucing: " + super.getJenisHewan();
    }
}

public class Anjing extends Hewan {
    public Anjing(String jenisAnjing) {
        super(jenisAnjing);
    }

    @Override
    public String toString() {
        return "Anjing: " + super.getJenisHewan();
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Kucing Eksotis");
        Hewan hewan2 = new Anjing("Anjing Bull");

        System.out.println(hewan1);
        System.out.println(hewan2);
    }
}