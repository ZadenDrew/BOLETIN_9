
package num_naturais;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Naturais {
    // COMENTARIO COMMIT ADRIAN
    Naturais(){
    }
   public void cal_Naturais(){
   int i,num,positivos=0 ,negativos=0,ceros=0;
   Scanner sc = new Scanner(System.in);
        for(i=0;i<10;i++){
           System.out.println("Introduce 10 numeros para realizarsu clasificación:");
            num=sc.nextInt();
           if(num<0)
               negativos++;
           if(num>0)
                positivos++;
            if(num==0)
                ceros++;                       
         }
    System.out.println("Hay"+ negativos + "numeros negativos .");
    System.out.println("Hay"+ positivos + "numeros positivos .");
    System.out.println("Hay"+ ceros + "numeros ceros .");
   }
}

