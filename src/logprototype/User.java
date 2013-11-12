/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logprototype;

/**
 *
 * @author reilly Noonan Grant
 * Assignment #22?
 * Creating a prototype in java of the web based application that me and 
 * Aaron Spak plan to build. This is the User interface of this prototype
 */
public class User {
    private String password;
    private String userName;
    
    /**
     * Constructs a User with the given username and Password
     * @param password the password of the user
     * @param userName the username of the user
     */
    public User(String password, String userName){
        this.password=password;
        this.userName=userName;
    }
    
    /**
     * sets the UserName to the given string
     * @param uN 
     */
    public void setUserName(String uN){
        userName=uN;
    }
    
    /**
     * Sets the password to the given string
     * @param p the given string to set the password to
     */
    public void setPassword(String p){
        password = p;
    }
    
    /**
     * return the users user name
     * @return the users user name 
     */
    public String getUserName(){
        return userName;
    }
    
    /**
     * returns the users password
     * @return the users password
     */
    public String getPassword(){
        return password;
    }
}
