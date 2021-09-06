
package javaapplication46;


public class technology {
    String name;
    long roll,num;
    char group;
    
    void setInformation(String n,char ch,int r,int ph){
        name=n;
        group=ch;
        roll=r;
        num=ph;
        
    }
    void displayInformation(){
        
         System.out.println( "Name:" +name);
        System.out.println("Roll:"+roll);
        System.out.println("Group:"+group);
        System.out.println("Phone:"+num);
        
        
    }
    
        
    }
    

