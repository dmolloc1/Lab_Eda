public class DocumentoId <T>{
    private T id;
    private String tipo;
    public DocumentoId(T dato){
        this.id = dato;
    }

    public T getDocId(){
        return this.id;
    }

    public String tipoDato(){
        if(this.id instanceof Integer){
            this.tipo = "Integer";
        }else if(this.id instanceof String){
            this.tipo = "Alfanúmerico";
        }else {this.tipo = "NA";}

        return this.tipo;
    }
}