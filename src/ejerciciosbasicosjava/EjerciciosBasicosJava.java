
package ejerciciosbasicosjava;

/**
 *
 * @author Javier de la Llave
 */
public class EjerciciosBasicosJava {
    
    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        if(numBellotas>=40 && numBellotas <= 60 && !finDeSemana){
            return true;
        } else if(numBellotas>=40 && finDeSemana){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
    public static void main(String[] args) {
        
       
        
        
       

    }
    
}
