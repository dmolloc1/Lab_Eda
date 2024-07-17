public class tB<T extends Comparable<T>> {
    NodeB<T> root;
    int t;

    public tB (int t) {
        this.root = null;
        this.t = t;
    }

    void traverse() {
        if (root != null) {
            root.traverse();
        }
    }

    NodeB<T> search(int k) {
        return root == null ? null : root.search(k);
    }

    void insert(int k) {
        if (root == null) {
            root = new NodeB<T>(t, true);
            root.keys[0] = k;
            root.n = 1;
        } else {
            if (root.n == 2 * t - 1) {
                NodeB<T> s = new NodeB<T>(t, false);
                s.C[0] = root;
                s.splitChild(0, root);
                int i = 0;
                if (s.keys[0] < k) {
                    i++;
                }
                s.C[i].insertNonFull(k);
                root = s;
            } else {
                root.insertNonFull(k);
            }
        }
    }

    public String toString() {
        return root != null ? root.toString() : "Empty tree";
    }


    public static void main(String[] args) {
        tB<Integer> t = new tB<>(3);
        t.insert(10);
        t.insert(20);
        t.insert(5);
        t.insert(6);
        t.insert(12);
        t.insert(30);
        t.insert(7);
        t.insert(17);
        t.insert(22);
        t.insert(40);
        t.insert(27);
        t.insert(57);
        t.insert(122);
        t.insert(140);
        t.insert(127);
        t.insert(157);

        System.out.print("Traversal of the constructed tree is ");
        t.traverse();
        System.out.println();

        int key = 6;
        if (t.search(key) != null) {
            System.out.println(" | Present");
        } else {
            System.out.println(" | Not Present");
        }

        key = 15;
        if (t.search(key) != null) {
            System.out.println(" | Present");
        } else {
            System.out.println(" | Not Present");
        }

        System.out.println(t.toString());

    }
}
