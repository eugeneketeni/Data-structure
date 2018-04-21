/*

Eugene Keteni
ITSC 2214
Programming Assignment 1.

*/


public class LinkedQueueList
{

    //Customer references
    private Customer firstN, lastN;

    //Pointers set to null
    public void QueueLinkedList()
    {
        firstN = null;
        lastN = null;
    }

    //New customer becomes last if the queue is not empty
    public void enqueue (Customer c)
    {
        if (isEmpty())
        {
            firstN = c;
        }
        else
        {
            lastN.setNext(c);
        }
        lastN = c;

    }


    //First in line customer becomes the current customer if list is not empty.
    public Customer dequeue()
    {
       if ( isEmpty() )
       {
           return null;
       }

        Customer c = firstN;

        if (firstN == lastN)
        {
            lastN = null;
        }

        firstN = firstN.getNext();

        return c;

    }


    //If first is null the list becomes empty
    public boolean isEmpty()
    {
        return firstN == null;
    }

}
