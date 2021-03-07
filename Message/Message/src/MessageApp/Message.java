/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageApp;

/**
 * @author Hoang
 */
public class Message 
{
    private String Message;
    private Message MessageNext;
    
    public Message(String message)
    {
        
        this.Message = message;
        this.MessageNext = null;
        
    }
    public String GetMessage()
    {
        
        return Message;
        
    }
    public Message GetMessageNext()
    {
        
        return MessageNext;
        
    }
    public void SetMesage(String message)
    {
        
        this.Message= message;
        
    }
    public void SetMessegeNext(Message messageNext)
    {
        
        this.MessageNext = messageNext;
        
    }
}
