/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cinema;

import cinema.Cinema;
import java.util.Scanner;

/**
 *
 * @author rabyah
 */
public class Movie {
    //create array listing movies on show
    static String[] movieList = {"1:Kingsmen", "2:Kung Fu Panda", "3:Iron Man", "4:Toy Story"};
    int movieCode;
    //allow user input within this class
    private Scanner scan = new Scanner(System.in);
    
    //create method so user can select which movie they wish to see
    public void selectMovie() {
        System.out.println("Enter the movie code for the movie you would like to see.");
        //print list of movies
        for(String movie: movieList) {
            System.out.println(movie);
        }
        
        //get user input
        movieCode = scan.nextInt();
        //index for array and substring start at 0
        System.out.println("You selected the movie " + movieList[movieCode - 1].substring(2));
    }
    
    public void movieSelected() {
        System.out.println("You selected the movie " + movieList[movieCode - 1].substring(2));
    }
}
