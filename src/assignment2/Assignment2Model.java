/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author thor1
 */
public class Assignment2Model 
{
    public String excerciseI(String inputText)
    {
        String topButtom = " * * *";
        for (int i = 0; i < inputText.length()/2; i++) 
        {
            topButtom += " *";
            
        }
        if ((inputText.length()% 2) != 0)
        {
            topButtom += " *" ;
        } 
        
        return topButtom + "\n" + "* " + inputText + " *\n" + topButtom;
    }
    
    public String excerciseII(String inputText)
    {
        return inputText;
    }
    
    public String excerciseIII()
    {
        return "Thorbjørn S. Damkljær\nHundegade 10.01\n6760 Ribe"; 
    }
    
    public String excerciseIV()
    {
        return "7*1 = "+7*1+"\n"+"7*2 = "+7*2+"\n"+"7*3 = "+7*3+"\n"+"7*4 = "+7*4+"\n"+"7*5 = "+7*5+"\n"+"7*6 = "+7*6+"\n"+"7*7 = "+7*7+"\n"+"7*7 = "+7*7+"\n"+"7*8 = "+7*8+"\n"
                +"7*9 = "+7*9+"\n"+"7*10 = "+7*10;
    }
    
    public String excerciseV(int inputText)
    {
        String a = "";
        for (int i = 0; i < 10; i++) 
        {
            a += inputText + " * " + (1+i) + "=" + inputText*(1+i) + "\n";
        }
        return a;
    }
    
    public String excerciseVI(String inputText)
    {
        return inputText;
    }
    
    public String excerciseVII(String inputText)
    {
        return inputText;
    }
    
    public String excerciseIIX(String inputText)
    {
        return inputText;
    }
    
    public String excerciseIX(String inputText)
    {
        return inputText;
    }
    
    public String excerciseX(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXI(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXII(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXIIV(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXIV(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXV(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXVI(String inputText)
    {
        return inputText;
    }
    
    public String excerciseXVII(String inputText)
    {
        return inputText;
    }
}
