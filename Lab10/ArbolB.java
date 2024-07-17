
public class ArbolB <T extends Comparable<T>> {
    protected NodoB<T> raiz;
    protected int t; // Grado mínimo

    public ArbolB(int t) {
        this.raiz = null;
        this.t = t;
    }

    // Función para buscar una llave en el árbol
    public NodoB <T> buscar(T k) {
        return (raiz == null) ? null : buscarRecursivo(raiz, k);
    }

    private NodoB <T> buscarRecursivo(NodoB <T> nodo, T k) {
        int i = 0;
        while (i < nodo.llaves.size() && k.compareTo(nodo.llaves.get(i)) > 0 ) {
            i++;
        }
        if (i < nodo.llaves.size() && k.equals(nodo.llaves.get(i))) {
            return nodo;
        }
        return (nodo.hoja) ? null : buscarRecursivo(nodo.hijos.get(i), k);
    }

    // Función para insertar una llave en el árbol B
    public void insertar(T k) {
        if (raiz == null) {
            raiz = new NodoB<>(t, true);
            raiz.llaves.add(k);
        } else {
            if (raiz.llaves.size() == 2 * t - 1) {
                NodoB <T> s = new NodoB<>(t, false);
                s.hijos.add(raiz);
                dividirHijo(s, 0, raiz);
                insertarNoLleno(s, k);
                raiz = s;
            } else {
                insertarNoLleno(raiz, k);
            }
        }
    }

    private void insertarNoLleno(NodoB <T> nodo, T k) {
        int i = nodo.llaves.size() - 1;
        if (nodo.hoja) {
            nodo.llaves.add(null);
            while (i >= 0 && nodo.llaves.get(i).compareTo(k) > 0) {
                nodo.llaves.set(i + 1, nodo.llaves.get(i));
                i--;
            }
            nodo.llaves.set(i + 1, k);
        } else {
            while (i >= 0 && nodo.llaves.get(i).compareTo(k) > 0) {
                i--;
            }
            i++;
            if (nodo.hijos.get(i).llaves.size() == 2 * t - 1) {
                dividirHijo(nodo, i, nodo.hijos.get(i));
                if (nodo.llaves.get(i). compareTo(k) < 0) {
                    i++;
                }
            }
            insertarNoLleno(nodo.hijos.get(i), k);
        }
    }

    private void dividirHijo(NodoB <T> nodo, int i, NodoB <T> y) {
        NodoB <T> z = new NodoB<>(t, y.hoja);
        for (int j = 0; j < t - 1; j++) {
            z.llaves.add(y.llaves.remove(t));
        }
        if (!y.hoja) {
            for (int j = 0; j < t; j++) {
                z.hijos.add(y.hijos.remove(t));
            }
        }
        nodo.hijos.add(i + 1, z);
        nodo.llaves.add(i, y.llaves.remove(t - 1));
    }

    // Función para imprimir el árbol B (uso de prueba)
    public void imprimir() {
        imprimirRecursivo(raiz, 0);
    }

    private void imprimirRecursivo(NodoB <T> nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Nivel " + nivel + " " + nodo.llaves);
            for (NodoB <T> hijo : nodo.hijos) {
                imprimirRecursivo(hijo, nivel + 1);
            }
        }
    }

    public static void main(String[] args) {
        ArbolB<Integer> arbol = new ArbolB<>(2); //t*2 - 1
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
    }
}
