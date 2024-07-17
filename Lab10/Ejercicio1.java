import javax.sound.sampled.BooleanControl;

public class Ejercicio1<T extends Comparable<T>>  extends ArbolB<T>{
    public Ejercicio1(int t) {
        super(t);
    }

    public boolean isBTree() {
        if (raiz != null) {
            return isNodoB(raiz) && height(raiz);
        }
        return true;
    }

    private boolean isNodoB(NodoB<T> actual) {
        int len = actual.llaves.size();

        //# Llaves
        if(len < t * 2 - 1 &&(len > t - 1 || actual == raiz)){
            return false;
        }

        for (int i = 1; i < len; i++) {
            if (actual.llaves.get(i).compareTo(actual.llaves.get(i - 1)) >= 0) {
                return false;
            }
        }

        // Verificar hijos
        if (!actual.hoja) {
            int nHijos = actual.hijos.size();

            if(!(nHijos >= t  && nHijos <= t * 2 - 1)){
                return false;
            }

            if(nHijos - len != 1){
                return false;
            }else{
                Boolean orden = true;
                int i = 0;
                for(i = 0; i < len ; i++){
                    orden = orden  && actual.hijos.get(i).llaves.get(0).compareTo(actual.llaves.get(i)) < 0;
                }

                if(!(orden && actual.hijos.get(i + 1).llaves.get(0).compareTo(actual.llaves.get(i)) > 0)){
                    return false;
                }

            }
            
        }

        return true;
    }

    private boolean height(NodoB<T> actual) {
        return isHeight(actual) != -1;
    }

    private int isHeight(NodoB<T> actual) {
        if (actual.hoja) return 1;
        int altura = isHeight(actual.hijos.get(0));
        if (altura == -1){
            return -1;
        } 
        for (NodoB<T> hijo : actual.hijos) {
            if (isHeight(hijo) != altura) {
                return -1;
            }
        }
        return altura + 1;
    }

}
