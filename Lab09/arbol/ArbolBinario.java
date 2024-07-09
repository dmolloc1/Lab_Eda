package arbol;
import java.util.LinkedList;

public class ArbolBinario<E extends Comparable<E>> {
    protected Node<E> root;

    public ArbolBinario() {
        this.root = null;
    }

    public void add(E data) {
        Node<E> nod = new Node<>(data);
        if (this.root == null) {
            this.root = nod;
        } else {
            LinkedList<Node<E>> cola = new LinkedList<>();
            cola.add(this.root);

            while (!cola.isEmpty()) {
                Node<E> temp = cola.poll();

                if (temp.getLeft() == null) {
                    temp.setLeft(nod);
                    break;
                } else {
                    cola.add(temp.getLeft());
                }

                if (temp.getRight() == null) {
                    temp.setRight(nod);
                    break;
                } else {
                    cola.add(temp.getRight());
                }
            }
        }
    }

        
    
}
