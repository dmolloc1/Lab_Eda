import java.util.HashMap;

public class Ejercicio1 {
    static HashMap<Integer, Integer> sol;
    public static int minSaltos(int[] arr) {
        HashMap<Integer, Integer> solNormal = new HashMap<>();
        HashMap<Integer, Integer> solReves = new HashMap<>();
        int result = minSaltos(arr, 0, true, solNormal, solReves);
        return result == -1 ? -1 : result;
    }

    private static int minSaltos(int[] arr, int actual, boolean mundoDelReves, HashMap<Integer, Integer> solNormal, HashMap<Integer, Integer> solReves) {
        
        if (actual >= arr.length) {
            return mundoDelReves ? 0 : -1;
        } 
        if(mundoDelReves){
            sol = solNormal;
        }else{
            sol = solReves;
        }

        if (sol.containsKey(actual)) return sol.get(actual);

        if (arr[actual] == 0) return mundoDelReves ? minSaltos(arr, actual, false, solNormal, solReves) : -1;

        int minSaltos = -1;
        for (int i = 1; i <= arr[actual]; i++) {
            int s = minSaltos(arr, actual + i, mundoDelReves, solNormal, solReves);
            if (s != -1) {
                if (minSaltos == -1) {
                    minSaltos = s + 1;
                } else {
                    minSaltos = Math.min(minSaltos, s + 1);
                }
            }
        }

        sol.put(actual, minSaltos);

        return minSaltos;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,2,0,2,3,2,4,3,3,4}; 
        int res = minSaltos(arr);
        if (res != -1) {
            System.out.println("Saltos mínimos: " + res);
        } else {
            System.out.println("No tiene solucion");
        }
    }
}
