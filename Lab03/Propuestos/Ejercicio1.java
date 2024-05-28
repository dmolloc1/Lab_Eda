public class Ejercicio1{
    public static void main(String[] args) {
        int[] arr1 = {11, 2, 4, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {11, 2, 4, 4, 5, 6, 7, 8, 10};
        System.out.println(compararArrays(arr1, arr2, 0, arr1.length - 1));
    }
    public static boolean compararArrays(int[] arr1, int[] arr2, int inicio, int fin){
        if(arr1.length != arr2.length){
            System.out.println("Los arrays no son de igual longitud");
            return false;
        }
        if(inicio == fin){
            return arr1[inicio] == arr2[inicio];
        }else{
            int medio = (inicio + fin) / 2;
            boolean p1 = compararArrays(arr1, arr2, inicio, medio);
            boolean p2 = compararArrays(arr1, arr2, medio + 1, fin );
        
            return p1 && p2;
       
        }
    }
}