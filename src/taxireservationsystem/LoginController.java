/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxireservationsystem;

import models.User;
import java.util.Scanner;

public class LoginController {   
    
    
    public User saveUser()
    {
          
        
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
          user.setName(input.nextLine());
        System.out.println("Enter your email");
          user.setEmail(input.nextLine());        
        System.out.println("Enter your password");
          user.setPassword(input.nextLine());
        
        return user;
    }        

   
    
    
    
    
    
}
