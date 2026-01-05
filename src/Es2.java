import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa");
        String firstString = sc.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String secondString = sc.nextLine();
        System.out.println("Inserisci la terza stringa");
        String thirdString = sc.nextLine();
        System.out.println(concatString(firstString, secondString, thirdString));
    }

    public static String concatString(String a, String b, String c) {
        return a + " " + b + " " + c + " " + c + " " + b + " " + a;
    }

}
