/**
 * 
 * PROFESSOR: DANIEL JUGAN
 * @Author : EUGENE KETENI
 * DATE: 03/26/2017
 * 
 */

import java.util.Random;
public class Driver {
    public static void main(String[] args) {
        //create the queue object
        PriorityQueue queue = new PriorityQueue();

        int LenghtOfQueue = 0;
        int maxLength = 0;
        int randomNum;
        int numOfServiced = 0;

        //for loop stimulate 60 minutes of activity
        for (int x = 0; x < 60; x++) {
            //25% chance of customer walking in
            randomNum = new Random().nextInt(4);

            //check if customer walks in
            if (randomNum == 2) {
                //customer added to queue
                queue.add(new PriorityCustomer());

                //Queue lenght updated
                LenghtOfQueue++;

                System.out.println("New customer added!  Queue length is now " + LenghtOfQueue);
            }

            //max line lenght updated
            if (LenghtOfQueue > maxLength) {
                maxLength = LenghtOfQueue;
            }


            //customer at the front of the queue been serviced updated
            if (!queue.isEmpty()) {

                if (queue.peek().getServiceTime() == 0) {
                    //customer removed from the queue
                    queue.remove();

                    //number of customer serviced updated
                    numOfServiced++;

                    //decrement queue lenght
                    LenghtOfQueue--;


                    System.out.println("Customer serviced and removed from the queue.  Queue length is now " + LenghtOfQueue);

                } else {
                    queue.peek().decServiceTime();
                }

            }

            System.out.println("---------------------------------------------------");

        }

   /**
   *  Dispays outputs for activity in the store
   **/
       
        System.out.println("Total number of customers serviced : " + numOfServiced);


        System.out.println("The maximum line length : " + maxLength);
    }

}