/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
        
/**
 *
 * @author rabyah
 */
public class DayOfWeek {
    
    private String date;
    //get current date
    public void Date() {
        //specify format of date
        //EEEE gives day of the week
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        //convert the current date into a String
        date = sdf.format(new Date());
        System.out.println(date);
    }
}
