package ejercicio2;
public class Test {
    public static void main(String[] args) {
        ArbolBinario<Integer> arr = new ArbolBinario<Integer>();
        arr.insert(2);
        System.out.println(arr.toLevels());

    }
}
