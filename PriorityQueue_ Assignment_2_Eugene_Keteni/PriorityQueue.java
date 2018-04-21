/**
 * 
 * PROFESSOR: DANIEL JUGAN
 * @Author : EUGENE KETENI
 * DATE: 03/26/2017
 * 
 */
public class PriorityQueue {

    private PriorityCustomer[] heap;
    private int size = 0;

    public PriorityQueue() {
        heap = new PriorityCustomer[100];
        size = 0;
    }

    public void add(PriorityCustomer p) {

        int index = size + 1; // new value added to index
        heap[index] = p; //value added at that position

        while (index > 1) {
            int BigIn = index / 2; // big index divided by 2

            int SmallV = p.getPriority();

            int BigV = heap[BigIn].getPriority();


            if (BigV < SmallV) {

                index = BigIn; //update index equals Big index


            } else {

                break;
            }
        }

        size++; //increment size

    }


    public PriorityCustomer remove() {
        PriorityCustomer rValue = heap[1]; // root value stored to return at the end
        PriorityCustomer p = heap[size]; // Last value stored in heap p
        heap[1] = p; //p moved to root
        heap[size] = null; // node deleted at last position

        int index = 1;

        while (index * 2 < size) {
            int leftIn = index * 2;
            int rightIn = leftIn + 1;

            int leftV = heap[leftIn].getPriority();
            int rightV = -1000000;

            if (rightIn < size) {
                rightV = heap[rightIn].getPriority();
            }

            PriorityCustomer maxCh;
            int maxIn; //find max index
            if (leftV >= rightV) {
                maxCh = heap[leftIn];
                maxIn = leftIn;
            } else {
                maxCh = heap[rightIn];
                maxIn = rightIn;
            }

            if (p.getPriority() < maxCh.getPriority()) { //if the value is less than the maximum child, swap
                heap[index] = maxCh; //swap max child
                heap[maxIn] = p;
                index = maxIn; // index equals the maximum index
            } else {
                break;
            }

        }

        size--; //decrement size

        return rValue; //return to previous root
    }

    //check if there is any customer in the queue
    public boolean isEmpty() {
        return heap[1] == null;
    }

    //return customer to the front of the queue
    public PriorityCustomer peek() {
        return heap[1];
    }
}