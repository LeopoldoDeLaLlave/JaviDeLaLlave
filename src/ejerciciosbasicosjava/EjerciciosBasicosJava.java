
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
    
    
    public int multa(int velocidad, boolean birthday){
        
        if(birthday){//Si es mi cumple el guardia me quita 5 de velocidad
            velocidad = velocidad-5;
        }
        
        if(velocidad<=60){
            return 0;
        } else if(velocidad <=80){
        
            return 1;
            
    }
        
     return 2;
        
    }
    
    
    
    
    public static void main(String[] args) {
        
       EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
       
        System.out.println(ejercicios.multa(60, false));
        
        System.out.println(ejercicios.multa(65, false));
        
       System.out.println(ejercicios.multa(60, true));

    }
    
}
