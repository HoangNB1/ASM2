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
public class Function
{
    
    MyQueue Queue = new MyQueue();
    MyStack Stack = new MyStack(10);
    
        public void SendMessage()
        {
            
            System.out.println("Type 'send' after you have enter the message to send");
            System.out.println("Enter message: ");
            String newMessage= "";

            do{
                
                Scanner scanner = new Scanner(System.in);

                    newMessage = scanner.nextLine(); 

                    if(!("send").equals(newMessage))
                    {
                        
                        Queue.Enqueue(newMessage);
                        
                    }
                    
            }while(!("send").equals(newMessage)); 

            while (!Queue.isEmpty())
            {
                
                String x = Queue.Dequeue().GetMessage(); 
                Stack.Push(x); 
                
            }
            
        }
    
    
        public void DisplayMessage(){
                if(Stack.isEmpty()){
                     System.out.println("No Message"); 
                }
                else{
                    
                    System.out.println("All Message: ");
                    while (!Stack.isEmpty())
                         {
                             
                             System.out.println(Stack.Pop());
                             
                         }
                    
                }
                
        }
        
}
