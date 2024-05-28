public class Ejercicio3 {
    public static void main(String[] args) {
        int[] arr = {11, 12, 23, 14, 15, 26, 17, 8};
        System.out.println(media(0, arr.length - 1, arr));
    }
    public static double media(int inicio, int fin, int[] arr){

        if(inicio == fin){
            return arr[inicio];
        }else{
       
            int mitad = (inicio + fin)/2;
        
            double p1 = media(inicio, mitad, arr);
            double p2 = media(mitad + 1, fin, arr);
        
            return (p1 + p2)/2;
       
        }
    }
}
