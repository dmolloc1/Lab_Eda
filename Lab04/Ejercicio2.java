import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {

        int maxPropAFavorecer = 4;
        int sumaMaxPorRiesgo = 2;
        int nProp = 8; 
        int[][] prop_riesgo = {
            {-1, 1, 0, 0, 0},
            {1, -1, 0, 0, 0},
            {0, 0, 1, -1, 0},
            {0, 0, -1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 1, -1, 0, 0},
            {-1, 0, 0, 1, -1},
            {1, 0, -1, 0, 1}
        };

        int[] solucionOptima = getSolucionOptima(nProp, maxPropAFavorecer, sumaMaxPorRiesgo, prop_riesgo);
        
        for (int i = 0; i < solucionOptima.length; i++) {
            if (solucionOptima[i] == 1) {
                System.out.println("Propiedad " + i);
            }
        }
    }

    public static int[] getSolucionOptima(int nProp, int maxPropAFavorecer, int sumaMaxPorRiesgo, int[][] prop_riesgo) {
        int[][][] arr = new int[nProp + 1][maxPropAFavorecer + 1][sumaMaxPorRiesgo + 1];
        boolean[][][] sol = new boolean[nProp + 1][maxPropAFavorecer + 1][sumaMaxPorRiesgo + 1];

        getSolucionParcialCasoBase(arr, nProp, maxPropAFavorecer, sumaMaxPorRiesgo);

        for (int i = 1; i <= nProp; i++) {
            for (int j = 1; j <= maxPropAFavorecer; j++) {
                for (int k = 1; k <= sumaMaxPorRiesgo; k++) {
                    getSolucionParcialPorAlternativa(arr, sol, prop_riesgo, i, j, k);
                }
            }
        }
        return getSolucionReconstruidaCasoRecursivo(arr, sol, nProp, maxPropAFavorecer, sumaMaxPorRiesgo);
    }

    public static void getSolucionParcialCasoBase(int[][][] arr, int nProp, int maxPropAFavorecer, int sumaMaxPorRiesgo) {
        for (int i = 0; i <= nProp; i++) {
            for (int j = 0; j <= maxPropAFavorecer; j++) {
                for (int k = 0; k <= sumaMaxPorRiesgo; k++) {
                    arr[i][j][k] = Integer.MAX_VALUE / 2; 
                }
            }
        }
        arr[0][0][0] = 0; 
    }

    public static void getSolucionParcialPorAlternativa(int[][][] arr, boolean[][][] sol, int[][] prop_riesgo, int i, int j, int k) {

        arr[i][j][k] = arr[i - 1][j][k];

        if (j > 0 && k >= prop_riesgo[i - 1][0]) {
            int value = arr[i - 1][j - 1][k - prop_riesgo[i - 1][0]] + prop_riesgo[i - 1][0];
            if (value < arr[i][j][k]) {
                arr[i][j][k] = value;
                sol[i][j][k] = true;
            }
        }
    }

    public static int[] getSolucionReconstruidaCasoRecursivo(int[][][] arr, boolean[][][] mat, int nProp, int maxPropAFavorecer, int sumaMaxPorRiesgo) {
        int[] sol = new int[nProp];
        int i = nProp;
        int j = maxPropAFavorecer;
        int k = sumaMaxPorRiesgo;

        while (i > 0 && j > 0 && k > 0) {
            if (mat[i][j][k]) {
                sol[i - 1] = 1;
                k -= arr[i - 1][j - 1][k - arr[i][j][k]];
                j--;
            }
            i--;
        }

        return sol;
    }
}

