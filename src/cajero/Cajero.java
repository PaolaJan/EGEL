package cajeroegel;
import java.util.Scanner;
import java.awt.Label;
import javax.swing.*;
import java.awt.Frame;

/**
 *
 * @author janne
 */
public class CajeroEGEL {
 
public static void main(String[] args) {
        int saldo = 1000, retirar, deposito;
        int intento, pin = 123456789, veces=1;
        Scanner s = new Scanner(System.in);
        
        do{
        System.out.print("Ingresa la contraseña: ");
        intento=s.nextInt();
        
        if(intento==pin){
            System.out.println("¡Acceso correcto!");
            System.out.println("¡Bienvenido!");
            
            while(true)
        {
            System.out.println("\nCAJERO\n");
            System.out.println("-----------------------------------");
            System.out.println("1.RETIRAR SALDO");
            System.out.println("2.DEPOSITAR SALDO");
            System.out.println("3.VERIFICAR SALDO");
            System.out.println("4.SALIR");
            System.out.println("------------------------------------\n");
            System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA RETIRAR:");
                retirar = s.nextInt();
                if(saldo >= retirar)
                {
                    saldo = saldo - retirar;
                    System.out.println("\nDINERO RETIRADO EXITOSAMENTE");
                }
                else
                {
                    System.out.println("\nNO TIENE FONDOS SUFICIENTES");
                }
 
                System.out.println("");
                break;
 
                case 2:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                deposito = s.nextInt();
                saldo = saldo + deposito;
                System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
 
                break;
 
                case 3:
                System.out.println("SALDO : "+saldo);
 
                break;
 
                case 4:
                System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                System.exit(0);
            }
        }
           

        }else if (intento !=pin && veces<3){
            System.out.println("¡Contraseña incorrecta!");
            veces = veces+1; // incremento el numero de intentos    
             
        }else if  (veces==3){
            System.out.println("¡Acceso restringido");
            System.out.println("Cerrando el sistema");
            
            System.exit(0);
        }   
        }while(intento!=pin);
    }    
}
 
