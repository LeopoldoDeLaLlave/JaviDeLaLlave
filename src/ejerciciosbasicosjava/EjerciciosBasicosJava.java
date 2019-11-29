
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
    
    
    public boolean muyVanidoso(int num){
        
     if((num%11 == 0)|| ((num-1)%11 ==0)){
         return true;
     }
        return false;
    }
    
    
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        
        if((matinal && !madre) || dormido){
            return false;
        }
        return true;
    }
    
    
    public boolean menorPor10(int a, int b, int c){
        
       if(Math.abs(a-b) >= 10 || Math.abs(a-c) >=10 || Math.abs(a-c)>=10){
           return true;
       }
       return false;
    }
    
    
    public boolean digitoIgual(int a, int b){
        
       if((a/10 == b/10) ||(a%10 == b%10) || (a/10 == b%10) || (a%10 == b/10)){
           
           return true;
       }
       
       return false;
    }
    
    
    public boolean multiploMultiple(int a){
        
      if(a>0){
          if((a%3==0 && a%5 != 0) ||(a%5==0 && a%3 != 0) ){
              return true;
          }
      }
      return false;
    }
    
    
    public boolean menos20(int a){
        
        if(a>0){
            if(((a+1)%20 == 0) || ((a+2)%20 == 0)){
                return true;
            }
        }
        return false;
    }
    
    
    
    public int loteria(int a, int b, int c){
        
       if(a==b && a==c && b==c){
           if(a==2){
               return 10;
           }
           return 5;
       }
       
       if(b != a && c != a){
           return 1;
       }
       return 0;
    }
    
    
    public int withouDoubles(int a, int b, boolean noDoubles){
        
        if(noDoubles && a==b){
            return (a+b+1);
        }
        
        return (a+b);
    }
 
    
    
    
    public static void main(String[] args) {
        
       EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
       
        System.out.println(ejercicios.withouDoubles(2,3,true));
        System.out.println(ejercicios.withouDoubles(3,3,true));
        System.out.println(ejercicios.withouDoubles(3,3,false));
        System.out.println(ejercicios.withouDoubles(2,3,false));
        System.out.println(ejercicios.withouDoubles(5,5,true));
        System.out.println(ejercicios.withouDoubles(6,6,true));

    }
    
}
