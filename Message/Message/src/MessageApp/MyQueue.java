/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageApp;

/**
 * @author Hoang
 */
public class MyQueue 
{
    
        public Message TopMessage;
        public Message BottomMessage;

        public MyQueue()
        {
            
                this.TopMessage= null;
                this.BottomMessage = null;
                
        }

        public boolean isEmpty()
        {
            
                return (this.TopMessage==null);
                
        }


        public Message Dequeue()
        {
            
                if (isEmpty())
                {
                    
                    System.out.println("Empty");
                    return null;
                    
                }else
                {
                    
                    Message temp = this.TopMessage;
                    this.TopMessage = this.TopMessage.GetMessageNext();
                    temp.SetMessegeNext(null);
                    return temp;
                    
                }
                
        }
        
        public void Enqueue(String message)
        {
            
                Message newMessage = new Message(message);
                if(this.isEmpty())
                {
                    this.TopMessage = newMessage;
                    this.BottomMessage = newMessage;
                    
                }else
                {
                    
                    this.BottomMessage.SetMessegeNext(newMessage);
                    this.BottomMessage = newMessage;
                    
                }
                
        }
        
        public void Clear()
        {
            
                if (this.isEmpty())
                {
                    
                    System.out.println("Empty");
                    
                }
                else 
                {
                    
                    while(!this.isEmpty())
                        
                {
                    
                    this.Dequeue();
                    
                }
                    
                }
                
         }
             
}
