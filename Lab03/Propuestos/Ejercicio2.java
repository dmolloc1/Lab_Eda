public class Ejercicio2{
    public static void main(String[] args) {
        int[] arr = {11, 22, 4, 74, 5, 16, 700, 8, 10, 1000, 0};
        System.out.println("El número menor del array es : " + minimo(arr, 0, arr.length - 1));
        System.out.println("El número mayor del array es : " + maximo(arr, 0, arr.length - 1));
    }
    public static int minimo(int[] arr, int inicio, int fin){
        if(inicio == fin){
            return arr[inicio];
        }else{
            int medio = (inicio + fin) / 2;
            int p1 = minimo(arr, inicio, medio);
            int p2 = minimo(arr, medio + 1, fin);
        
            return Math.min(p1, p2);
       
        }
    }
    public static int maximo(int[] arr, int inicio, int fin){
        if(inicio == fin){
            return arr[inicio];
        }else{
            int medio = (inicio + fin) / 2;
            int p1 = maximo(arr, inicio, medio);
            int p2 = maximo(arr, medio + 1, fin);
        
            return Math.max(p1, p2);
       
        }
    }
}