/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxireservationsystem;


import models.Booking;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Vehicle;


/**
 *
 * @author krishna
 */
public class BookingController {
    
    private final Vehicle taxi;

    public BookingController(Vehicle taxi) {
        
        this.taxi = taxi;
        
    }    
    
    
    public void show() throws ParseException, Exception {
        Booking request = new Booking();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start date ");
         String start_date = input.nextLine();
        System.out.println("Enter start time "); 
         String start_time = input.nextLine(); 
         
        System.out.println("Enter end date ");
         String end_date = input.nextLine();
        System.out.println("Enter end time "); 
         String end_time = input.nextLine(); 
        
         request.setStart_date(changeDate(start_date, start_time));
         request.setEnd_date(changeDate(end_date, end_time)); 
         
         request.setVehicle_no(taxi.getNumber());
         
         System.out.println(request.getStart_date());
         
        System.out.println("press 2 to go to previous screen");
        if(input.nextInt() == 2)  
        {
            new VehiclesController().showVehicles();
            
        }
                
        else{        
         
         setPlace(request);
         if(input.nextInt() == 2){
              
            show();
        }
          else { 
         new ConfirmationController().show(request);
          }
        }   
      
        
        
        
    }
    
    
    private Date changeDate(String date, String time) throws Exception{       
        String date_time = date +'T'+ time;
         System.out.println("########## "+date_time+ "############" );
        DateFormat inputDateFormatter = new SimpleDateFormat(
           "yyyy-MM-dd'T'HH:mm");          
            Date date_format = inputDateFormatter.parse(date_time);      
            
            System.out.println("########## "+date_format+ "############" );
            
            return date_format;
        
        
    }

    private void setPlace(Booking request) {
        Scanner input = new Scanner(System.in);
        System.out.println("Book a cab - from and to");
        System.out.println("From");
          request.setFrom_place(input.nextLine());
        System.out.println("To");
          request.setTo_place(input.nextLine());  
        System.out.println("press 2 to go back to previous screen");       
        
    }

  
            
    
    
    
}
