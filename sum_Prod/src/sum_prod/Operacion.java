package sum_prod;

/**
 *
 * @author acabezaslopez
 */
public class Operacion {
    double suma=0,producto=1;
    public Operacion(){
    }
    public void calcula(){
    for(double i=10;i<90;i++){
       suma = suma+i;
       producto = producto*i;
      
    }
    System.out.println("La suma es :"+suma+"\nEl producto es :"+producto);
}
}


