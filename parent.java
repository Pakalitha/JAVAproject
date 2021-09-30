/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial1;

/**
 *
 * @author dell
 */
public class parent {
    private String mymessage="construtor has been called";
    public parent(){
    System.out.println("Parent default constructor");
    }
    public parent(String mymessage){
   this();
    System.out.println(mymessage);
    }
    public String getmassage(){
    
        return "Parent Message";
    }
}
