/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Rectangulo {
 public Rectangulo(){
 }
 public void cal_Area(){
 double l,b,area;
  Scanner sc = new Scanner (System.in);
  do{
      System.out.println("Introduce valor del lado :");
     l=sc.nextDouble();
     if(l<0)
          System.out.println("Es negativo,introduce un valor positivo .");
    }while(l<0);
  do{
       System.out.println("Introduce valor de la altura :");
     b=sc.nextDouble();
     if(b<0)
          System.out.println("Es negativo,introduce un valor positivo .");
    }while(b<0);
     area=l*b;
     System.out.println("El área del rectántugo es :"+area);
 }
}
