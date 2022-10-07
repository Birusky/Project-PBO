import java.util.Scanner;

public class Soal2_P6 {
    private int jam;
    private int menit;
    private int detik;



    public void inputdata(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Jam : ");
        this.jam = input.nextInt();

        System.out.println("Masukan menit : ");
        this.menit = input.nextInt();

        System.out.println("Masukan detik : ");
        this.detik = input.nextInt();

    }

    public void lamapercakapan(){
        System.out.println("lama percakapan "+this.jam +"Jam "+this.menit +"Menit "+this.detik+"detik");
    }

    public double biaya(){
        int lamapercakapan = this.jam*3600 + this.jam*60 + this.jam*60 + this.detik;
        double pulsa = lamapercakapan/5;
        double biaya = pulsa * 150;
        return biaya;

    }

    public static void main(String[] args) {
        Soal2_P6 pc = new Soal2_P6();
        pc.inputdata();
        pc.lamapercakapan();
        System.out.println("Biaya Percakapan : "+pc.biaya());
    }
}