/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
import java.util.Scanner;
/**
 *
 * @author rabyah
 */
//inherit class DayOfWeek so we know whether it is Wednesday or not
public class Tickets extends DayOfWeek {
    //define ticket prices as variable
    private int standard = 8;
    private int oap = 6;
    private int student = 6;
    private int child = 4;
    
    //define number of each type of ticket customer may wish to buy
    private int standardTickets;
    private int oapTickets;
    private int studentTickets;
    private int childTickets;
    
    //allow user input
    Scanner scan = new Scanner(System.in);
    
    //ask how many of each type of tickets they wish to purchase
    public void ticketNumber() {
        System.out.println("How many Standard tickets would you like to purchase?");
        standardTickets = scan.nextInt();
        
        System.out.println("How many OAP tickets would you like to purchase?");
        oapTickets = scan.nextInt();
        
        System.out.println("How many Student tickets would you like to purchase?");
        studentTickets = scan.nextInt();
        
        System.out.println("How many Child tickets would you like to purchase?");
        childTickets = scan.nextInt();
    }
    
    public void isItWed() {
        String date = "Wednesday";
        //convert string to boolean
        boolean bdate = Boolean.parseBoolean(date);
        System.out.println(bdate);
        
        //if it is wednesday the ticket prices change to the following values
        if(bdate == true) {
            standard = 6;
            oap = 4;
            student = 4;
            child = 2;
            
            System.out.println("You save £2 off each ticket!!");
        }
        else {
            System.out.println("Come back on Wednesday and watch movies at a discounted price!");
        }
    }
    
    //calculate total price of tickets
    public void price() {
        int totStandard = standard * standardTickets;
        int totOap = oap * oapTickets;
        int totStudent = student * studentTickets;
        int totChild = child * childTickets;
        
        int total = totStandard + totOap + totStudent + totChild;
        
        System.out.println("The total cost of your tickets is £" + total);
    }
}
