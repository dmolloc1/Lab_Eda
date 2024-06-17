public class LibroDeTextoUnsa extends LibroDeTexto {
    private String facultad;
    public LibroDeTextoUnsa(String t, String a, double p, String c, String f) {
        super(t, a, p, c);
        this.facultad = f;
    }
    public LibroDeTextoUnsa(String t, String a, String c, String f) {
        super(t, a, c);
        this.facultad = f;
    }
    
    public String getFacultad() {
        return this.facultad;
    }

    public void setFacultad(String f) {
        this.facultad = f;
    }

    public String toString(){
        return super.toString() + " / Facultad: " + this.facultad;
    }

}
