/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.t02.p01;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJT02P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de pagos de horas extra por trabajador");
        //Variables
        int cate, he;
        double sue, pago;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduzca categoría");
       
        cate= kb.nextInt();
        if (cate>8||cate<1){
            System.out.println("No se puede realizar el cálculo del pago");
        }
        
        switch (cate){
            case 1:
                System.out.println("Introduzca sueldo");
                sue = mensajePedirDatos();
                System.out.println("Introduzca horas extras");
                he= kb.nextInt();
                pago= (sue + he*30);
                System.out.println("Paga = $" + pago);
                break;
            case 2:
                System.out.println("Introduzca sueldo");
                sue = mensajePedirDatos();
                System.out.println("Introduzca horas extras");
                he= kb.nextInt();
                pago= (sue + he*38);
                System.out.println("Paga = $" + pago);
                break;
            case 3:
                System.out.println("Introduzca sueldo");
                sue = mensajePedirDatos();
                System.out.println("Introduzca horas extras");
                he= kb.nextInt();
                pago= (sue + he*50);
                System.out.println("Paga = $" + pago);
                break;
            case 4:
                System.out.println("Introduzca sueldo");
                sue = mensajePedirDatos();
                System.out.println("Introduzca horas extras");
                he= kb.nextInt();
                pago= (sue + he*70);
                System.out.println("Paga = $" + pago);
                break;
        }
        
        
    }
    static double mensajePedirDatos(){
        double sue;
        Scanner kb = new Scanner (System.in);
        sue= kb.nextDouble();
        return sue;
                
    }
}
