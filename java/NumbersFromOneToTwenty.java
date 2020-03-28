import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{
    static void usbdevice(int i)
    {
                    boolean both = false;
                    boolean printed = false;
            
            if(i%3==0 && i%5==0)
            {
                both=true;
                System.out.println("UsbDevice");
                printed=true;
                
            }
             
                
            if(i%3==0 && both==false)
            {
                
                System.out.println("Usb");
                printed=true;
            }
                
            
            if(i%5==0 && both==false)
            {
                System.out.println("Device");
                printed=true;
            }
                
            if(!printed)
                System.out.println(i); 

        
    }
    public static void main(String[] args)
    {
        /*

        int sampleInput;
        int result = -404;
        sampleInput = sc.nextInt();
            
        //write your Logic here


        //OUTPUT [uncomment & modify if required]
        System.out.println(result);*/
        
        /*Scanner sc=new Scanner(System.in);
        
        String n = sc.nextLine();
        
        int number = Integer.parseInt(n);*/
        
        for(int i=1;i<=20;i++)
        {
            usbdevice(i);
        }
        
        
    
    }
}