import java.util.Scanner;

public class Soal3_P6 {
    private int lamaInternet;
    private int lamaPengetikan;
    private int lamaGameOnline;

    private int Scan;
    private int PrintWarna;
    private int PrintHitamPutih;
    private int TehBotol;

    public void setInputdata(int lamaInternet, int lamaPengetikan, int lamaGameOnline,
                             int Scan, int PrintWarna, int PrintHitamPutih, int TehBotol) {
        this.lamaInternet = lamaInternet;
        this.lamaPengetikan = lamaPengetikan;
        this.lamaGameOnline = lamaGameOnline;
        this.Scan =Scan;
        this.PrintWarna = PrintWarna;
        this.PrintHitamPutih = PrintHitamPutih;
        this.TehBotol = TehBotol;
    }

    public double getBiayaTotal() {
        double biayaKomputer = ((this.lamaInternet / 60) * (double)4000) +
                ((this.lamaPengetikan / 60) * (double)2000) +
                ((this.lamaGameOnline / 60) * (double)5000);

        System.out.println(biayaKomputer);
        double biayaFasilitasLain = (this.Scan * 1000) +
                (this.PrintWarna * 500) +
                (this.PrintHitamPutih * 300) +
                (this.TehBotol * 3000);

        return biayaFasilitasLain + biayaKomputer;
    }
}

class Main1 {
    public static void main(String[] args) {
        System.out.println("--- Soal 3 Warnet ---");
        Soal3_P6 warnet = new Soal3_P6();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan lama penggunaan internet\t: ");
        int Internet = input.nextInt();

        System.out.print("Masukan lama pengetikan\t: ");
        int Pengetikan = input.nextInt();

        System.out.print("Masukan lama bermain game online\t: ");
        int GameOnline = input.nextInt();

        System.out.print("\nMasukan banyak file yang di scan\t: ");
        int Scan = input.nextInt();

        System.out.print("Masukan banyak print warna\t: ");
        int PrintWarna = input.nextInt();

        System.out.print("Masukan banyak print hitam putih\t: ");
        int PrintHitamPutih = input.nextInt();

        System.out.print("Masukan jummlah teh botol yang dibeli\t: ");
        int TehBotol = input.nextInt();

        warnet.setInputdata(Internet, Pengetikan, GameOnline, Scan, PrintWarna, PrintHitamPutih, TehBotol);

        System.out.println("Total Biaya Keseluruhan : Rp " +warnet.getBiayaTotal());
    }
}