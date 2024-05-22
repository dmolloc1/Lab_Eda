import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
    static ArrayList<String> registro;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Número de pasos para su resolucion
        System.out.println("Para resolver la torre de "+ num + " son " + pasosTorresDeHanoi(num) + " pasos");

        //Formula recursiva f(n) =  2F(n - 1) + 1
        registro = new ArrayList<>();
        torresDeHanoi(num, '1', '2', '3');
        for(String s: registro){
            System.out.println(s);
        }

    }
    //Metodo recursivo para saber el numero de movimientos necesarios para resolver el problema
    public static int pasosTorresDeHanoi(int n){
        if(n == 1){
            return 1;
        }
        return  1 + 2 * pasosTorresDeHanoi(n - 1);
    }

    
    // Metodo recursivo que almacena los pasos de la solucion en un arraylist
    public static void torresDeHanoi(int discos, char origen, char auxiliar, char destino) {
        if (discos == 1) {
            registro.add("Se movió el disco 1 de " + origen + " a " + destino);
            return;
        }
        torresDeHanoi(discos - 1, origen, destino, auxiliar);
        registro.add("Se movió el disco " + discos + " de " + origen + " a " + destino);
        torresDeHanoi(discos - 1, auxiliar, origen, destino);
    }

}
