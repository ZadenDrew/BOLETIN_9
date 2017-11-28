/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.util.Scanner;

/**
 *
 * @author acabezaslopez
 */
public class Multiplicar {
    public Multiplicar(){
    }
    public void cal_Taboa(){
        int num;
    System.out.println("Introduce un numero para calcular su tabla de multiplicar :");
    Scanner sc = new Scanner(System.in);
    do{
        num=sc.nextInt();
        if(num!=0){
    for(int i=0;i<10;i++){
     System.out.println(+num+"*"+i+"="+num*i);
    } 
        }
    }while(num!=0);
     }
}
