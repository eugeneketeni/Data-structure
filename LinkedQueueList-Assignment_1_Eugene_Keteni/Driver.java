/*
Eugene Keteni
ITSC 2214
Programming Assignment 1.

*/


import java.util.Random;

public class Driver {

    public static void main(String[] args)
    {
        //queue object created
        LinkedQueueList lineLenght = new LinkedQueueList();

        //Varibale that stores the service time
        int ServicedTime = 0;

       //Stores queue length
        int x = 0;

        //Stores the Maximum line length of the stimulation
        int maximumLineLength = 0;

        //for loop that stimulates 60 minutes of activity
        for (int i = 1; i <= 60; i++)
        {
            //Create a 25% chance of customer showing up
            int customerShowsUp = new Random().nextInt(5);

            Customer c = new Customer();

            //If statements that check to see if a customer shows up
            if (customerShowsUp == 2)
            {
                //Customer added to line length
                lineLenght.enqueue(c);

                
                x++;

         
                if (x > maximumLineLength)
                {
                    maximumLineLength = x;
                }


                //Displays the queue length if a customer is added to the queue
                System.out.println("New customer added!  Queue length is now " + x);


                //update the customer serviced
                c.decServiceTime();
            }

            System.out.println();

           
            if (c.getServiceTime() == 0)
            {
                //customer removed from the queue if serviced
                lineLenght.dequeue();

               
                x--;

             
                if (x > maximumLineLength)
                {
                    maximumLineLength = x;
                }

                
                ServicedTime++;

              
                System.out.println("Customer serviced and removed from the queue. Queue length is now " + x );
            }

                       System.out.println("---------------------------------------------------");


        }

         System.out.println("********************************************************************");

         System.out.println("Total number of customers serviced:  " + ServicedTime);
       
         System.out.println("Maximum line length during the simulation: " + maximumLineLength);
        
         System.out.println("********************************************************************");

    }
}
