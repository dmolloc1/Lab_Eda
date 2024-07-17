import java.util.ArrayList;

class NodoB <T extends Comparable<T>>{
    public int t; // Grado mínimo
    public ArrayList<T> llaves;
    public ArrayList<NodoB<T>> hijos;
    public boolean hoja;

    public NodoB(int t, boolean hoja) {
        this.t = t;
        this.hoja = hoja;
        this.llaves = new ArrayList<>();
        this.hijos = new ArrayList<>();
    }

    public String toString(){
        String t = "";
        for(T  i : llaves){
            t += i + " ";
        }
        return " ( " + t + ") ";
    }
}