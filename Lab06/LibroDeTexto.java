public class LibroDeTexto extends Libro{
    private String curso ;

    public LibroDeTexto(String t, String a, String c) {
        super(t, a);
        this.curso = c;
    }

    public LibroDeTexto(String t, String a, double p, String c) {
        super(t, a, p);
        this.curso = c;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
    public String toString(){
        return super.toString() + " / Curso: " + this.curso;
    }
     
}