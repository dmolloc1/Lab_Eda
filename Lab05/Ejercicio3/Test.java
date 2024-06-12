public class Test {
    public static void main(String[] args) {
        Registro r = new Registro();
        DocumentoId<Integer> doc1 = new DocumentoId<Integer>(23443);
        Turista t1 = new Turista("Juan", "Quispe", 30,doc1 );
        
        DocumentoId<String> doc2 = new DocumentoId<String>("23dfs4S3");
        Turista t2 = new Turista("Samuel", "Quispe", 46,doc2 );
        
        r.addRegistro(t1);
        r.addRegistro(t2);
        System.out.println(r.toString());
    }
}
