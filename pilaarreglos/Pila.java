package pilaarreglos;
import java.util.*;
public class Pila {
    Scanner entrada=new Scanner(System.in);
    String pila[]=new String [5];
    int contador=-1;
    
    public int insertar(){
        if(contador>=pila.length-1){
             System.out.println("No hay espacio");
        }else{
            contador++;
            System.out.println("Palabra a insertar");
            pila[contador]=entrada.next();  
            
        }
        return contador;
    }
    
    public void mostrar(){
        if(contador==-1){
            System.out.println("No hay datos");
        }else{
            System.out.println("Datos de la pila");
            for(int i=0;i<pila.length;i++)
            System.out.println(pila[i]);
        }
    }
    
    public int eliminar(){
        if(contador==-1){
            System.out.println("No hay datos");
        }else{
            pila[contador]=null;
            contador--;
        }
        return contador;
    }
}
