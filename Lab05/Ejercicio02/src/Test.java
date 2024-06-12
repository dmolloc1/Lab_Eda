public class Test {
    public static void main(String[] args) {
        ArbolBinario<Integer> arr = new ArbolBinario<Integer>();
   
        for(int i = 1; i <= 100; i++){
            arr.insert(i);
        }
        System.out.println(arr.toString());

    }
}
