/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxireservationsystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import models.Vehicle;

/**
 *
 * @author krishna
 */
public class VehiclesController {
    
    
    public void showVehicles() throws Exception
    {
        
        
        int choice = 0;  
        Scanner input = new Scanner(System.in);
        System.out.println("1. mercedez\n2. porshe\n3. hummer\n4. exit");
        choice = input.nextInt();
       if(choice != 0) { 
        Vehicle taxi = getVehicleInfo(choice);       
        new BookingController(taxi).show(); 
            
       }      
            
        
    }        

    private Vehicle getVehicleInfo(int n) throws IOException {
        
        String vehicle_info = Files.readAllLines(Paths.get("vehicle_info")).get(n-1);
        Vehicle taxi =  new Vehicle();
        String[] parts = vehicle_info.split(":");
        taxi.setType(parts[0]);
        taxi.setNumber(parts[1]);
        taxi.setAvailable_from(parts[2]);
        taxi.setAvailable_to(parts[3]);
        taxi.setDaily_from(parts[4]);
        taxi.setDaily_to(parts[5]);
        return taxi;
        
    }
    
    
}
