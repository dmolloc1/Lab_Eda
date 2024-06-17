
public class Libro{
    private String titulo, autor;
    private Double precio;

    public Libro(String t , String a){
        this.titulo = t;
        this.autor = a;
    }
    public Libro(String t, String a, double p){
        this.titulo = t;
        this.autor = a;
        this.precio = p;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        if (this.precio != null) {
            return "Titulo: " + this.titulo + " / Autor: " + this.autor + " Precio: " + this.precio;
        }
        return "Titulo: " + this.titulo + " / Autor: " + this.autor;

    }
}