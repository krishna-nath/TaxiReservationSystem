/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxireservationsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import models.Booking;

/**
 *
 * @author krishna
 */
public class ConfirmationController {
    
    private static int seq_no = 0;
    private static ArrayList<Booking> booking_list = new ArrayList<Booking>();
    
    public void show(Booking request){
        
        System.out.println("confirmation");
        System.out.println("cab type");
        
        SimpleDateFormat time_format = new SimpleDateFormat("HH:mm");
        String time = time_format.format(request.getStart_date());
        
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-DD");
        String date = date_format.format(request.getStart_date());
        
        System.out.println("Date : " + date);
        System.out.println("Time : "+ time);
        
       String reservation_no = Integer.toString(++seq_no)+"c"+date.replaceAll("-", "")+time.replaceAll(":",""); 
       System.out.println(reservation_no); 
       
       request.setBooking_id(reservation_no);
       booking_list.add(request);
        
    }
    
    
}
