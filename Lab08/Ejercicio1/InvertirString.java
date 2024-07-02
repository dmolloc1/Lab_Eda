package Ejercicio1;
public class InvertirString {
    private Pila<String> pila;

    public InvertirString(){
        this.pila = new Pila<String>();
    }

    public String invertir(String a){

        for(String c:a.split("")){
            pila.push(c);
        }
        return pila.mostrar();
    }
    public static void main(String[] args) {
        InvertirString app = new InvertirString();
        String text = "Este es el string a invertir";
        System.out.println("\nOriginal: " + text +"\nInvertido: " + app.invertir(text));
    }

}
