import java.util.*;
public class Ejercicio1{
    static int cant, n ;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(invertir(num));
    }

    public static int invertir(int num){
        if (num < 10){
            return num;
        }else{
            //cant representa la cantidad de numeros despus del primero es decir la cantidad de numero de n - 1
            cant = 0;
            n = num;
            while(n > 9){
                n = n / 10;
                cant++;
            }
            return (num % 10)* (int)Math.pow(10, cant) + invertir(num / 10);
        }
    }
    
}