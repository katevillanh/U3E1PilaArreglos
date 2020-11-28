package pilaarreglos;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
        Pila obj = new Pila();
        Scanner entrada=new Scanner(System.in);
        int opc;
        boolean c=true;
      
        
        do{
            System.out.println("-----------------------------");
            System.out.println("Menú de pilas con arreglos");
            System.out.println("1.Insertar Dato");
            System.out.println("2.Mostrar");
            System.out.println("3.Eliminar");
            System.out.println("4.Salir");
            opc = entrada.nextInt();
            System.out.println("-----------------------------");
            
            switch(opc){
                case 1:
                    obj.insertar();
                    break;
                case 2:
                    obj.mostrar();
                    break;
                case 3:
                    obj.eliminar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (c==true);
    }
}
