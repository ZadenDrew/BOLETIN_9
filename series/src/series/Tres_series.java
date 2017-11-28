package series;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Tres_series {
    int elementos,serie1=2,serie2;
    public Tres_series(){
    }
    Scanner sc=new Scanner(System.in);
    public void mostrar_serie1(){
     System.out.println("Número de elementos de la serie ?:");
        elementos=sc.nextInt();
        for(int i=0;i<elementos;i++){
            serie1+=2;
            System.out.println(+serie1);
        }
    }
     public void mostrar_serie2(){
     System.out.println("Número de elementos de la serie ?:");
        elementos=sc.nextInt();
        for(int k=0;k<elementos;k++){
            if(serie2<0){
            serie2=(serie2*(-1)+1);
            }else{
            serie2=(serie2*(-1)-1);
        }  
        System.out.println(+serie2);
        }
     }
        //serie fibonacci
     public void mostrar_serie3(){
        int num1=-1,num2=1,serie3;
        System.out.println("Número de elementos de la serie ?:");
           elementos=sc.nextInt();
        for(int j=2;j<elementos;j++){
            serie3 = num2 + num1;
            System.out.print(+serie3+",");
            num1 = num2;
            num2 = serie3;
           
        }
    }

}
