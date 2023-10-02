package probaprojekt;

public class Pakli {

    private String[] pakli;

//    public Pakli() {
//        this.pakli = pakli;
//    }

    private void osszerak() {
        String[] szin = {"P", "M", "Z", "S"};
        String[] szam = {"A", "K", "D", "J", "10", "9", "8"};

//        for (String string : szin) {
//            for (int szamDb = 0; szamDb < szam.length; szamDb++) {
//                pakli[szamDb] = szin+ "_" + szam[szamDb];
//            }
//
//        }
        for (int szinDb = 0; szinDb < szin.length; szinDb++) {
            for (int szamDb = 0; szamDb < szam.length; szamDb++) {
                pakli[szamDb] = szin[szinDb] + "_" + szam[szamDb];
                
            }
            
        }

    }
    public void kiIrat(){
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
        }
    }

    public void setPakli(String[] pakli) {
        this.pakli = pakli;
    }

    public String[] getPakli() {
        return pakli;
    }

    public void kever(int oszlop) {
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    pakli[i - 7] = pakli[20 - (i - 1) * 3];
                    pakli[i - 14] = pakli[19 - (i - 1) * 3];
                    pakli[i - 21] = pakli[21 - (i - 1) * 3];

                }

                break;
            case 2:
                for (int i = 0; i < 7; i++) {
                    pakli[i - 7] = pakli[21 - (i - 1) * 3];
                    pakli[i - 14] = pakli[20 - (i - 1) * 3];
                    pakli[i - 21] = pakli[19 - (i - 1) * 3];

                }

                break;
            case 3:
                for (int i = 0; i < 7; i++) {
                    pakli[i - 7] = pakli[20 - (i - 1) * 3];
                    pakli[i - 14] = pakli[21 - (i - 1) * 3];
                    pakli[i - 21] = pakli[19 - (i - 1) * 3];

                }
                break;

        }

    }

    public void ezVolt() {
        System.out.println("Ez volt a gondolt lap" + pakli[11]);
    }
}
