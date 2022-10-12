import java.util.Scanner;
public class InputAngka {
    public static void main(String args[]){
        int nilai;
        Scanner keyboard = new Scanner (System.in);
        do{
            System.out.println("Masukkan anilai dari 0-10 :");
            nilai = keyboard.nextInt();

            if (nilai <= 10 && nilai >= 0) {
                System.out.println("nilai yang anda masukkan yaitu: "+nilai);
                break;
            }else{
                System.out.println("Inputan anda salah, silahkan input dengan benar");
            }
        }while(true);

    }

}