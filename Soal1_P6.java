import java.util.*;

class Segitiga {
    private int alas;
    private int tinggi;

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }
}
public class Soal1_P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hitung luas segitiga...
        Segitiga segitiga = new Segitiga();

        // input field dalam segitiga
        System.out.print("Masukan alas segitiga: ");
        segitiga.setAlas(sc.nextInt());

        System.out.print("Masukan tinggi segitiga: ");
        segitiga.setTinggi(sc.nextInt());

        // tampilkan luasnya
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }
}