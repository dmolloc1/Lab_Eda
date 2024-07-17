public class Ejercicio2<T extends Comparable<T>>  extends ArbolB<T>{
    public Ejercicio2(int t) {
        super(t);
    }

    public ArbolB<T> fusionar(ArbolB<T> a, ArbolB<T> b){
        ArbolB<T> c = new ArbolB<>((a.t + b.t) / 2 + 1);//El orden del nuevo arbol sera el promedio de los ordenes de los otros dos más uno
        fusionarTree(a.raiz, c);
        fusionarTree(b.raiz, c);
        return c;
    }

    private void fusionarTree(NodoB <T> actual,ArbolB<T> arbol){
        if(actual != null){
            for(T key : actual.llaves){
                arbol.insertar(key);
            }
            for (NodoB<T> ar : actual.hijos) {
                fusionarTree(ar, arbol);
            }
        }
    }
    public static void main(String[] args) {
        ArbolB<Integer> a = new ArbolB<>(2);
        ArbolB<Integer> b = new ArbolB<>(2);

        a.insertar(10);
        a.insertar(20);
        a.insertar(5);
        a.insertar(6);
        a.insertar(12);
        a.insertar(30);
        a.insertar(7);

        System.out.println("Arbol A : ");
        a.imprimir();
        
        b.insertar(17);
        b.insertar(22);
        b.insertar(40);
        b.insertar(27);
        b.insertar(57);
        b.insertar(122);
        b.insertar(140);
        b.insertar(127);
        b.insertar(157);

        System.out.println("Arbol B : ");
        b.imprimir();

        Ejercicio2<Integer> arbolFusion = new Ejercicio2<>(2);

        System.out.println("Arbol AB : ");
        arbolFusion.fusionar(a, b).imprimir();

    }
}
