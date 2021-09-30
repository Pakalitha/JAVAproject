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
public class child extends parent {
    public child(){
    System.out.println("child default constructor");
    }
    @Override
    public String getmassage(){
    
    return super.getmassage()+ " and Child message";
    }
    
}
