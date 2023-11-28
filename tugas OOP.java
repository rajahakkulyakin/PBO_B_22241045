public class Lingkaran {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    public void tampilInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Lingkaran lingkaranKu = new Lingkaran(5);
        lingkaranKu.tampilInfo();
    }
}