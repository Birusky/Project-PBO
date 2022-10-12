import java.util.Random;
import java.util.Scanner;
public class ProgramSuit {
    public static void main(String[] args) {

        while (true) {
            String[] suit = {"jempol", "telunjuk", "kelingking"};
            String komputer = suit[new Random().nextInt(suit.length)];
            String user, mulaiLagi;
            Scanner keyboard = new Scanner(System.in);

            while (true) {
                System.out.print("Masukkan pilihan kamu [jempol/telunjuk/kelingking] : ");
                user = keyboard.nextLine();
                if (user.equals("jempol") || user.equals("telunjuk") || user.equals("kelingking")) {
                    break;
                }
                System.out.println(user + " pilihan kamu tidak sesuai");
            }

            System.out.println("komputer : " + komputer);
            if (user.equals(komputer)) {
                System.out.println("wah seri nih");
            } else if (user.equals("kelingking")) {
                if (komputer.equals("jempol")) {
                    System.out.println("kamu menang, Keren bangeeet");
                } else if (komputer.equals("telunjuk")) {
                    System.out.println("kamu kalah, jangan sedih coba lagi");
                }
            } else if (user.equals("telunjuk")) {
                if (komputer.equals("kelingking")) {
                    System.out.println("kamu menang, Keren bangeeet");
                } else if (komputer.equals("jempol")) {
                    System.out.println("kamu kalah, jangan sedih coba lagi");
                }
            } else if (user.equals("jempol")) {
                if (komputer.equals("telunjuk")) {
                    System.out.println("kamu menang, Keren bangeeet");
                } else if (komputer.equals("kelingking")) {
                    System.out.println("kamu kalah, jangan sedih coba lagi");
                }
            }
            System.out.print("Ingin suit dengan komputer lagi? [y/n] : ");
            mulaiLagi = keyboard.nextLine();
            if (mulaiLagi.equals("n")) {
                System.out.println("Terima kasih sudah bermain game suit bersama komputer");
                break;
            }
        }
    }
}