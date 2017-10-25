/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author rabyah
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    
 ;
    public static void main(String[] args) {
        //create movie object so you can call select movie function
        Movie movie = new Movie();
        movie.selectMovie();
        
        //create tickets function
        Tickets tickets = new Tickets();
        tickets.ticketNumber();
        
        //tell customers the movie they bought tickets for and the total cost
        tickets.isItWed();
        movie.movieSelected();
        tickets.price();
    }
    
}
