public class Ejercicio2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(multiplicarArray(0, arr.length - 1, arr));
    }
    public static int multiplicarArray(int inicio, int fin, int[] arr){

        if(inicio == fin){
            return arr[inicio];
        }else{
       
            int mitad = (inicio + fin)/2;
        
            int p1 = multiplicarArray(inicio, mitad, arr);
            int p2 = multiplicarArray(mitad + 1, fin, arr);
        
            return p1 * p2;
    
        }
    }
}