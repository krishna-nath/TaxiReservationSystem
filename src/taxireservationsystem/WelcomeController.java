/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxireservationsystem;

import java.util.Scanner;

/**
 *
 * @author krishna
 */
public class WelcomeController {
    
    
    public void show() throws Exception{
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Book a cab\n2. Cancel a reservation \n3. Exit");
        choice  = input.nextInt();
        switch (choice)
        {
            case 1 : new VehiclesController().showVehicles();        
                
                
                 break;
            case 2 :  break;
            case 3 :  break;             
            
            
            
        }    
    }
    
}
