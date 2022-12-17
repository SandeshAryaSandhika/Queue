/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuetest;

/**
 *
 * @author Sandesh
 */
public class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee PeterParker = new Employee("Peter", "Parker", 123);
        Employee BillyJoe = new Employee("Billy", "Joe", 4567);
        Employee SamSmith = new Employee("Sam", "Smith", 22);
        Employee EnidSinclair = new Employee("Enid", "Sinclair", 3245);
        Employee WednesdayAdam = new Employee("Wednesday", "Adam", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(PeterParker);
        queue.add(BillyJoe);
        queue.add(SamSmith);
        queue.add(EnidSinclair);
        queue.add(WednesdayAdam);
        
        System.out.println("Add to Queue \n");
        queue.printQueue();

        queue.remove();
        queue.remove();
        System.out.println("Remove 2 Data from Queue \n");
        queue.printQueue();

        System.out.println("Peek Data From Queue \n");
        System.out.println(queue.peek());
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();

        queue.add(EnidSinclair);

        System.out.println("Print Queue \n");
        queue.printQueue();
    }
    
}
