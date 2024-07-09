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

    public String inOrder() {
        return inOrderTree(this.root);
    }

    private String inOrderTree(Node<E> actual) {
        if (actual == null) {
            return "";
        } else {
            return inOrderTree(actual.getLeft()) + actual.getData() + " " + inOrderTree(actual.getRight());
        }
    }

    public static void main(String[] args) {
        ArbolBinario<Integer> a = new ArbolBinario<>();

        a.add(3);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(30);
        a.add(40);
        a.add(60);
        a.add(80);
        System.out.println(a.inOrder());
    }
}
