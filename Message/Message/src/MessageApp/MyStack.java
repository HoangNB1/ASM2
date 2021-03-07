/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageApp;

/**
 * @author Hoang
 */
public class MyStack 
{
    
        public int TopMessage;
        public final int MaxStackSize;
        public String[] message;
        
        public MyStack(int MaxStackSize)
        {
            
            this.MaxStackSize = MaxStackSize;
            this.message = new String[MaxStackSize];
            this.TopMessage = -1;
            
        }
        
        public boolean isEmpty()
        {
            
            return (this.TopMessage == -1);
            
        }
        
        public void Push(String newMessage)
        {
            
            if(this.TopMessage ==(this.MaxStackSize -1 ))
            {
                
                System.out.println("Stack full");

            }
            else
            {
                
            this.message[(++this.TopMessage)] = newMessage;
            
            }
            
        }
        public String Pop()
        {
            
            String popMessage = "";
            
            try
            {
                
                popMessage =this.message[this.TopMessage];
                this.TopMessage--;
                
            }
            catch(Exception e)
            {
                
                System.out.println("Empty");
                
            }return popMessage;
            
        }
        
        public void Clear()
        {
            
            while(!this.isEmpty())
            {
                
                this.Pop();
                
            }
            
        }
        
}
