package ejemploCiclos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC3
 */
public class ProbandoCiclos {
    public static void main(String[] args) {
        
        CicloMientras cm = new CicloMientras();
        System.out.println("******* CON MIENTRAS******");
        cm.mientras();
        System.out.println("*******AHORA REPETIR******");
        cm.repetir();
        System.out.println("******* AHORA PARA*******");
        cm.para();
        
    }
    
}
