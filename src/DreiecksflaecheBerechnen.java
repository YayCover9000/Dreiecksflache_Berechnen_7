import java.util.Scanner;
public class DreiecksflaecheBerechnen {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOK = true;
        long flaeche;
        long hoehe = 0;
        long grundseite = 0;

        // Scanner Grundseite und Check
        System.out.println("Grundseite ganze Zahl: ");
        grundseite = scanner.nextInt();
        if (grundseite < 47000 || grundseite > 300000000) {
            System.out.println("Eingabefehler");
            isOK = false;
        } else {
            System.out.println("Höhe ganze Zahl: ");
            hoehe = scanner.nextInt();
            if (hoehe < 47000 || hoehe > 300000000) {
                System.out.println("Eingabefehler");
                isOK = false;
            }
        }
        if (isOK) {
            flaeche = ((grundseite * hoehe) / 2);
            System.out.println("Flaeche: " + flaeche);
            scanner.close();
        }
        scanner.close();
    }
}
