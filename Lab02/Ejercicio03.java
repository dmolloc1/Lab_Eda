import java.util.Scanner;

public class Ejercicio03 {
    static int len ;
    static boolean palidromo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        len = str.length() - 1;
        if(esPalindromo(str, len, 0)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }

    public static Boolean esPalindromo(String str, int fin, int inicio){
        if(Math.abs(fin - inicio) <= 1 ){
            return true;
        }
        if(str.charAt(inicio) == str.charAt(fin)){
            return true && esPalindromo(str, fin - 1, inicio + 1);
        }
        return false;
    }
}