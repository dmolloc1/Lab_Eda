public class Test {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 20.50);

        LibroDeTexto libroTexto = new LibroDeTexto("Historia Universal", "M. Johnson", 55.00, "Historia");
        LibroDeTextoUnsa libroTextoUNSA = new LibroDeTextoUnsa("Química Orgánica", "L. Peterson", 65.00, "Química", "Facultad de Ciencias Químicas");
        
        Novela novela = new Novela("Brave New World", "Aldous Huxley", 17.00, "Distopía");
        
        NovelaRomantica novelaRomantica = new NovelaRomantica("Anna Karenina", "Leo Tolstoy", 24.99);
        NovelaPoliciaca novelaPoliciaca = new NovelaPoliciaca("La Chica del Tren", "Paula Hawkins", 26.00);
        NovelaRealista novelaRealista = new NovelaRealista("La Casa de los Espíritus", "Isabel Allende", 32.50);
        NovelaCienciaFiccion novelaCienciaFiccion = new NovelaCienciaFiccion("Neuromancer", "William Gibson", 29.99);
        NovelaAventuras novelaAventuras = new NovelaAventuras("El Hobbit", "J.R.R. Tolkien", 21.99);

        System.out.println(libro);
        System.out.println(libroTexto);
        System.out.println(libroTextoUNSA);
        System.out.println(novela);

        //Novelas
        System.out.println(novelaRomantica);
        System.out.println(novelaPoliciaca);
        System.out.println(novelaRealista);
        System.out.println(novelaCienciaFiccion);
        System.out.println(novelaAventuras);
    }
}
