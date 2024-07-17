import java.util.ArrayList;

public class Ejercicio3<T extends Comparable<T>> extends ArbolB<T> {
    public Ejercicio3(int orden){
        super(orden);
    }

    public String inOrden(){
        return inOrden(this.raiz);
    }

    private String inOrden(NodoB <T> actual){
        if(actual != null){
            if(actual.hoja){
                return actual.toString();
            }else{
                String text = "";
                System.out.println("Número de hijos:" + actual.hijos.size());
                text = inOrden(actual.hijos.get(0));
                int len = actual.hijos.size() - 1;
                for(int i = 0; i < len; i++){
                    text +=  actual.llaves.get(i) + inOrden(actual.hijos.get(i + 1));
                }
                return text;
            }
        }
        return "";
    }

    public String preOrden(){
        return preOrden(this.raiz);
    }

    private String preOrden(NodoB <T> actual){
        if(actual != null){
            String text = actual.llaves.toString();
            for (NodoB<T> ar : actual.hijos) {
                text += preOrden(ar);
            }
            return text;
        }
        return "";
    }

    public String posOrden(){
        return posOrden(this.raiz);
    }

    private String posOrden(NodoB <T> actual){
        if(actual != null){
            String text = "";
            for (NodoB<T> ar : actual.hijos) {
                text += posOrden(ar);
            }
            return text + actual.llaves.toString();
        }
        return "";
    }
   


    public static void main(String[] args) {
        Ejercicio3<Integer> arbol = new Ejercicio3<>(2);//2*T - 1 
        arbol.insertar(10);
        arbol.insertar(20);
        arbol.insertar(5);
        arbol.insertar(6);
        arbol.insertar(12);
        arbol.insertar(30);
        arbol.insertar(7);
        arbol.insertar(17);
        arbol.insertar(22);
        arbol.insertar(40);
        arbol.insertar(27);
        arbol.insertar(57);
        arbol.insertar(122);
        arbol.insertar(140);
        arbol.insertar(127);
        arbol.insertar(157);

        arbol.imprimir();
        //Recorrido inorder
        System.out.println(arbol.inOrden());
        System.out.println(arbol.preOrden());
        System.out.println(arbol.posOrden());


    }
}
