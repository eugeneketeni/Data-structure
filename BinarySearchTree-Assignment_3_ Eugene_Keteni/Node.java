/**
 * Eugene Keteni
 *Programming assignment 3
 */

public class Node {
    private int freq;
    private String word;
    private Node left, right;

    //constructor method for node
    public Node (String newW ) {
        word = newW;
        left = null;
        right = null;
        freq = 0;
    }
    

    //Node is added to the tree
    public void add (Node n){
        //increment frequency if word already exist
        if (n.getWord().compareTo(word)==0)
        {
            freq++;
        }

        if(n.getWord().compareTo(word) <= 0){    //left
            if(left == null){            
                left = n;
            }else{
                left.add (n);              //recursive call on the child - left
            }
        }else{                           //right
            if(right == null){
                right = n;
            }else{
                right.add (n);
            }
        }

    }

    //search for both left and right for the word we looking for
    public Node search (String s){
        if(s.equals(word) ){              //if match is found
            return this;
        }

        if(s.compareTo(word) <= 0){               //left side
            if(left != null){
                return left.search (s);   

            }else{
                return null;              //value  not in the tree
            }
        }else{                           //right side
            if(right != null){
                return right.search (s);
            }else{
                return null;
            }
        }




    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    //getter for word
    public String getWord(){
        return word;
    }

    //getter for left child
    public Node getLeft() {
        return left;
    }

    //getter for right child
    public Node getRight() {
        return right;
    }






}
