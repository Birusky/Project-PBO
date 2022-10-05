//Buat program untuk menghitung luas segitiga dan luas lingkaran menggunakan OOP, dimana inputan dari keyboard.
//Tampilan, fungsi2 bebas.

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

class Lingkaran {
    private int r;
    public void setJariJari(int jariJari) {
        this.r = jariJari;
    }

    public double hitungLuas() {
        return Math.PI * r * r;
    }
}

public class TugasP5_Soal2{
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

        // hitung luas lingkaran...
        Lingkaran lingkaran = new Lingkaran();

        // input field dalam lingkaran
        System.out.print("\nMasukan jari-jari lingkaran: ");
        lingkaran.setJariJari(sc.nextInt());

        // tampilkan luasnya... 
        System.out.printf("Luas lingkaran: %.2f\n", lingkaran.hitungLuas());
        sc.close();
    }
}