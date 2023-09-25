
package modell;

import java.util.Scanner;

public class Pakli {
    private Lap[] pakli = new Lap[22];
    private static final Scanner sc = new Scanner(System.in);

    public Pakli() {
        feltolt();
    }
    
    public void feltolt(){
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++) {
                this.pakli[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }
    }
    
    public String kirak(){
        String kirakas = "";
        for (int i = 1; i < pakli.length; i++) {
            kirakas += "%-8s".formatted( pakli[i].getLeiras());
            if (i % 3 == 0) {
                kirakas += "\n";
            }
        }
        return kirakas;
    }
    
    public void kever(int oszlop){
        Lap[] ujPakli = new Lap[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        this.pakli = ujPakli;
    }
    
    public String ezVolt(){
        return "A választott lap: %s".formatted(pakli[11].getLeiras()) ;
    }
    
}
