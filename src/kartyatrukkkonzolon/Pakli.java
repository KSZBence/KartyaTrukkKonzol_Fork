
package kartyatrukkkonzolon;

public class Pakli {
    private Lap[] pakli = new Lap[22];

    public Pakli() {
        
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
    
    public void kirak(){
        
    }
    
    public String[] kever(String oszlop[]){
        return oszlop;
    }
    
    public void ezVolt(){
        
    }
    
}
