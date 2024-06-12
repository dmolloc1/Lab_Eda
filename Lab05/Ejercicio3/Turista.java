public class Turista {
    private String nombre, apellido;
    private int edad;
    private DocumentoId doc;
    public <T> Turista(String nombre,String apellido, int edad, DocumentoId<T> d) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.doc = d;
    }
    public Turista(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public <T> void setDocumento(DocumentoId<T> d) {
        this.doc = d;
    }

    public String toString() {
        return "Nombre: " + this.nombre +" - Apellido: " + this.apellido +
         " - Edad:" + this.edad + " - Documento (Tipo :" + doc.tipoDato() + "): " + doc.getDocId();
    }
}