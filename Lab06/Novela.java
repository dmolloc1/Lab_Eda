public class Novela extends Libro {
    private String tipo;

    public Novela(String t, String a, double p, String g) {
        super(t, a, p);
        this.tipo = g;
    }

    public Novela(String t, String a, String g) {
        super(t, a);
        this.tipo = g;
    }

    public Novela(String t, String a, double p) {
        super(t, a, p);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String g) {
        this.tipo = g;
    }

    public String toString(){
        return super.toString() + " / Tipo : " + this.tipo;
    }    
}