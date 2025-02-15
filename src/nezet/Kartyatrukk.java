/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.util.Scanner;
import modell.Pakli;

public class Kartyatrukk {
    private Pakli pakli;
    private Scanner sc = new Scanner(System.in);
    

    public Kartyatrukk() {
        this.pakli = new Pakli();
        indit();
    }
    
    public void indit() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.pakli.kirak());;
            int oszlop = melyik();
            this.pakli.kever(oszlop);
        }
        
        System.out.println(this.pakli.ezVolt());;   
    }
    
    public int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
        
    }
}
