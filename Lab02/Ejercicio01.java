import java.util.*;
public class Ejercicio1{
    static int cant, n ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(invertir(num));
    }
    //método que devuelve la suma de los elementos desde n hasta 1
    //ejemplo: n = 4 -> 4+3+2+1=10
    public static int invertir(int num){
        if (num < 10){
            return num;
        }else{
            cant = 0;
            n = num;
            while(n > 9){
                n = n / 10;
                cant++;
                System.out.println(cant + "  n es " + n );
            }
            return (num % 10)* (int)Math.pow(10, cant) + invertir(num / 10);
        }
    }
    
}