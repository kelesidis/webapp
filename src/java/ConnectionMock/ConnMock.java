/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionMock;

/**
 *
 * @author Admin
 */
public class ConnMock {
    private String name, pass, rank;
    public ConnMock(){
    name = "test";
    pass = "1234";
    rank = "Moderator";
    }
    
    public String getName(){
    
        return name;
    
    }
    
    
    public String getPass(){
    
        return pass;
    
    }

    public String getRank(){
    
        return rank;
    
    }
    
    
}
