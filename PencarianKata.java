import java.util.Scanner;

public class PencarianKata {
    public static void main(String[] args) {
    String kalimat = "kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
    String kata;
    Scanner keyboard = new Scanner(System.in);

    boolean isFound;
    do {
        System.out.print("Masukan kata: ");
        kata = keyboard.nextLine();
        if (kalimat.contains(kata)) {
            System.out.println("Kata ditemukan");
            isFound = true;
        } else {
            System.out.println("Kata tidak ditemukan");
            isFound = false;
        }
    } while (!isFound);
    }
}