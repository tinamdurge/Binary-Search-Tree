public class UC_1 {
    Node root;
    public static void main(String[] args) {
        System.out.println("Welcome to binary search program");
      UC_1 binarysearchtree = new UC_1();
        binarysearchtree.insertion(56);
        binarysearchtree.insertion(30);
        binarysearchtree.insertion(70);
        binarysearchtree.display(binarysearchtree.root);

    }

    public void insertion(int data) {
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;

        if (root == null)
            root = node;
        else {
            Node parrent = root;
            Node current = root;
            while (current != null) {
                parrent = current;
                if (node.data > current.data) {
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
            if (node.data > parrent.data) {
                parrent.right = node;
            } else {
                parrent.left = node;
            }
        }
    }

    public void display(Node node) {

        if (node.left != null) {
            display(node.left);
        }
        System.out.println(node.data);
        if (node.right != null) {
            display(node.right);
        }

    }
}
