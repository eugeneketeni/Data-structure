/**
 * Eugene Keteni
 *Programming assignement 3
 */
public class BinarySearchTree {

    private Node root;
    private int size;

    //constructor for the tree
    public BinarySearchTree () {
        root = null;
        size = 0;
    }

    //inserts word into tree
    public void insert (String t){

        if(root == null){     //if tree is empty
            root = new Node(t);
        }else{
            root.add (new Node(t));
        }
    }

    
    public Node search (String n){
        if(root == null) { 
          System.out.println("Not found");
            return null;

        }else{
            if (root.search(n) != null)
                System.out.println(root.search(n).getWord() + "found " + root.getFreq() + " times(s)");
            return root.search(n);

        }


    }


    //print contents of tree before sorted automatically
    public void printPreOrder(){
        if (root == null){
            System.out.print("Tree is empty");
        }else{

            printPreOrderRecur(root);

        }
        System.out.println();
    }


    //recursive helper method to print words before sorted out automatically
    public void printPreOrderRecur(Node currentN) {
        if (currentN != null){

            System.out.print(currentN.getWord() + ", ");
            printPreOrderRecur(currentN.getLeft());
            printPreOrderRecur(currentN.getRight());
        }


    }

    //content of tree printed out after been sorted
    public void printInOrder() {
        if (root == null){
            System.out.print("Tree is empty");
        }else{

            printInOrderRec(root);

        }
        System.out.println();
    }

    //A recursive helper method to help print the words after they are sorted alphabetically
    private void printInOrderRec(Node currentR) {
        if (currentR != null){
            printInOrderRec(currentR.getLeft());
            System.out.print(currentR.getWord() + ", ");
            printInOrderRec(currentR.getRight());
        }


    }


    //postorder way printing roots
    public void printPostOrder() {
        if (root == null){
            System.out.print("Tree is empty");
        }else{

            printPostOrderRecur(root);

        }
        System.out.println();
    }

    //Recursive helper method to print words after postordering
    private void printPostOrderRecur(Node currentRo) {
        if (currentRo != null){
            printPostOrderRecur(currentRo.getLeft());
            printPreOrderRecur(currentRo.getRight());
            System.out.print(currentRo.getWord() + ", ");
        }

    }


}
