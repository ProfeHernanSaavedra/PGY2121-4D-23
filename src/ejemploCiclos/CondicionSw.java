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
public class CondicionSw {


    public static void main(String[] args) {
        
    
         Scanner leer = new Scanner(System.in); //lectura por teclado (input)
        //sw + tab
        //numeros o char
        int dia = 0;
        
        //ciclos
        //wh + tab
        System.out.println("Ingrese el número del dia de la semana: ");
        dia = leer.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Sin informacion");
        }
        System.out.println("FIN");
    }
       

    
}
