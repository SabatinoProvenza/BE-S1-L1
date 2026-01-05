import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1) Perimetro rettangolo
        System.out.print("Inserisci il primo lato del rettangolo: ");
        double lato1 = Double.parseDouble(sc.nextLine());

        System.out.print("Inserisci il secondo lato del rettangolo: ");
        double lato2 = Double.parseDouble(sc.nextLine());

        double perimetroR = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro rettangolo: " + perimetroR);

        // 2) Pari o dispari
        System.out.print("Inserisci un numero intero: ");
        int n = Integer.parseInt(sc.nextLine());

        int risultatoPariDispari = pariDispari(n);
        System.out.println("Risultato pariDispari (0=pari, 1=dispari): " + risultatoPariDispari);

        // 3) Area triangolo
        System.out.print("Inserisci lato a del triangolo: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.print("Inserisci lato b del triangolo: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("Inserisci lato c del triangolo: ");
        double c = Double.parseDouble(sc.nextLine());

        double area = perimetroTriangolo(a, b, c);

        if (area == -1) {
            System.out.println("numeri non validi");
        } else {
            System.out.println("Area: " + area);
        }


    }

    // Perimetro rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // 0 se pari, 1 se dispari
    public static int pariDispari(int numero) {
        return (numero % 2 == 0) ? 0 : 1;
    }


    public static double perimetroTriangolo(double a, double b, double c) {

        if (a <= 0 || b <= 0 || c <= 0) return -1;
        if (a + b <= c || a + c <= b || b + c <= a) return -1;

        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}

