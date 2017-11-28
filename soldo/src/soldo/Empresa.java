package soldo;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Empresa {
     public void mostrarSoldo(){
         Scanner scan = new Scanner(System.in);
        int soldo, i=0, j=0;
        
        do{
            System.out.println("Introduce el sueldo del empleado:");
            soldo = scan.nextInt();
            if (1000<=soldo || 1750<=soldo){
                i++;
            }
            else if (soldo<1000 && soldo>0){
                j++;
            }
            else{
                System.out.println("Error en la cantidad");
            }
        } while (soldo != 0);
        System.out.println("Trabajadores que ganan entre 1000 y 1750€: "+i);
        System.out.println("Porcentaje de trabajadores que ganan menos de 1000: "+(j*100)/(i+j)+"%");

     }
}
