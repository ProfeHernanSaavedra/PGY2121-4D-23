package ejemploCiclos;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC3
 */
public class CicloMientras {
    
    private Scanner leer;

    public CicloMientras() {
        
        leer = new Scanner(System.in);
    }
    
    public void mientras()
    {
        
        int opcion = 0;
        //while -> wh + tab
        while (opcion != 4) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 1");
                    break;
                case 2:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 2");
                    break;
                case 3:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 3");
                    break;
                
                default:
                    System.out.println("Opcion no valida");
            } 
        }
        System.out.println("FIN");
    }  
    
    public void repetir()
    {
        //do + tab
        int opcion = 0;
        do {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 1");
                    break;
                case 2:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 2");
                    break;
                case 3:
                    //llamar a un método o algo que quieran programar
                    System.out.println("Esta es la opcion 3");
                    break;
                
                default:
                    System.out.println("Opcion no valida");
            } 
            
            
        } while (opcion != 4);
                
        System.out.println("FIN");
    }
    
    public void para()
    {
        //for + tab
        int termino = 0;
        System.out.println("Hasta donde parar??");
        termino = leer.nextInt();
        for (int i = 0; i < termino; i++) {
            System.out.println("hola");
        }
        
    }
    
}
