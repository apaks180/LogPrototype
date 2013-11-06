/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logprototype;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Reilly Noonan Grant
 * Assignment #21?
 * Creating a prototype in java of the web based application that me and 
 * Aaron Spak plan to build. This is the User interface of this prototype
 */
public class LogPrototype extends Applet implements ActionListener{
    /*Tester buttons used to move between views before more advanced functions
     are implemented (such as specialized accounts)*/
    private Button[] testHelperButtons = new Button[]{new Button("login sheet"),
                    new Button("signup sheet"),new Button("enter sheet"),
                    new Button("review sheet"),new Button("calculation sheet")};
    
     /*Button for login screen */
    //private Button loginButton = new Button("login");
    /*Text Fields for Login Screen  */
    //private TextField userNameField = new TextField(10);
    //private TextField passwordField = new TextField(10);
    /*these are the Labels of the Login screen */
    //private Label userNameLabel = new Label("UserName:");
    //private Label passwordLabel = new Label("Password:");
    /*This is the arrangement of Components that allows for easy management 
     * of the applet*/
    
    private Component[] loginSheet = new Component[]{new Label("UserName:"),
        new TextField(10),new Label("Password:"),new TextField(10),
        new Button("login")};
    private Component[] signupSheet= new Component[]{new Label("UserName:"),
        new TextField(10),new Label("Email:"),new TextField(10),
        new Label("Password:"),new TextField(10),
        new Label("Confirm Password:"),new TextField(10),
        new Button("Create Account")};
    private Component[] enterSheet = new Component[]{};
    private Component[] reviewSheet= new Component[]{};
    private Component[] calculationSheet = new Component[]{};
    private Component[][] master= new Component[][]{loginSheet,signupSheet,enterSheet,
                                        reviewSheet,calculationSheet};
    /*Used to move between sheets easily*/
    private int sheetIndex=0;
    /**
     * Adds everything that is visible on the Applet to the Applet
     */
    @Override
    public void init(){
        for(Button b:testHelperButtons){add(b);b.addActionListener(this);}
        for(Component[] cA:master){
            for(Component c:cA){
                add(c);//adds all components to the applet
                c.setVisible(false);//sets all components in the applet to not
                //be visible
                c.setEnabled(false);
            }
        }
        
        switchIndex(0);//sets the login screen to be visible
        
        //Make things pretty
        this.setBackground(Color.red);
        this.resize(300 , 200);
    }
    
    /**
     * Gives instructions for how to respond to various ActionEvents
     * @param e the ActionEvent to respond to
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        for(int i=0; i< testHelperButtons.length;i++){
             if(source==testHelperButtons[i]){
                  switchIndex(i);
               }
        }
    }
    
    /**
     * switches the displayed components to the selected index
     * @param i the index to switch to
     */
    private void switchIndex(int i){
        for(Component c:master[sheetIndex]){
            c.setVisible(false);
            c.setEnabled(false);
        }
        sheetIndex=i;
        for(Component c:master[sheetIndex]){
            c.setVisible(true);
            c.setEnabled(true);
        }
    }
    
}
