import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio04 {
    static ArrayList<Integer> sol = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(torresDeHanoi(num));
        //Formula recursiva f(n) =  2F(n - 1) + 1

    }

    public static int torresDeHanoi(int n){
        if(n == 1){
            return 1;
        }
        return  1 + 2 *torresDeHanoi(n - 1);
    }
}
