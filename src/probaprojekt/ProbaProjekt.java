package probaprojekt;

import java.util.Scanner;

public class ProbaProjekt {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        indit();
    }

    private static void indit() {
        Pakli pakli = new Pakli();
        pakli.getPakli();
        for (int i = 0; i < 3; i++) {
            pakli.kiIrat();
            //oszlopBe();
            int oszlop = oszlopBe();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }

    private static int oszlopBe() {
        int oszlop;
        do {
            System.out.print("Kérem adja meg melyik oszlopban van a választott kártya: ");
            oszlop = sc.nextInt();
            System.out.println("");
        } while (oszlop > 3 && oszlop < 1);

        return oszlop;
    }

}
