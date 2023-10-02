package probaprojekt;

import java.util.Scanner;

public class ProbaProjekt {

    public static void main(String[] args) {
        indit();
    }

    private static void indit() {
        Pakli pakli = new Pakli();
        pakli.getPakli();
        for (int i = 0; i < 3; i++) {
            pakli.kiIrat();
            int oszlop = oszlopBe();
            pakli.kever(oszlop);
        }
    }

    private static int oszlopBe() {
        Scanner sc = new Scanner(System.in);
        int oszlop;

        do {
            System.out.print("Kérem adja meg melyik oszlopban van a választott kártya");
            oszlop = sc.nextInt();
            System.out.println("");
        } while (oszlop > 3 && oszlop < 1);

        return oszlop;
    }

}
