/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageApp;
import java.util.Scanner;
/**
 * @author Hoang
 */
public class Main {
    
    public static void main(String[] args)
    {
        
        Function function = new Function();
        int choice = 0;
        while (choice != 3)
        {
            
            System.out.println("Choose your function");
            System.out.println("1. Send Message ");
            System.out.println("2. Display Message ");
            System.out.println("3. Quit");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            try
            {
                
                choice = scanner.nextInt();
                
            }catch (Exception e)
            {
                
                System.out.println("Input again");
                
            }
            switch (choice)
        {
            
            case 1:
            {
                
                function.SendMessage();
                break;
                
            }
            case 2:
            {
                
                function.DisplayMessage();
                break;
                
            }
            case 3:
            {
                
                System.exit(0);
                break;
                
            }
            
            default:
            {
                
                System.out.println("Please choose the correct function");
                System.out.println("");
                break;
                
            }
            
        }
            
        
        }
        
    }
    
}
