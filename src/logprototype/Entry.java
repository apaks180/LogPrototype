/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logprototype;

/**
 *
 * @author Reilly Noonan Grant
 * Assignment #22?
 * Creating a prototype in java of the web based application that me and 
 * Aaron Spak plan to build. This is one of the most basic units designed to 
 * store all the information one entry in a logbook
 */
public class Entry {
    private double miles;
    private double sleep;
    private String notes;
    private int hours;
    private int minutes;
    private int seconds;
    //private Date date; Waiting on Spaks Date class
    
    public Entry(double miles,double sleep,String notes,int hours,int minutes,int seconds){
        this.miles=miles;
        this.sleep=sleep;
        this.notes=notes;
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public void editMiles(double miles){this.miles=miles;}
    public void editSleep(double sleep){this.sleep=sleep;}
    public void editNotes(String notes){this.notes=notes;}
    public void editHours(int hours){this.hours=hours;}
    public void editMinutes(int minutes){this.minutes=minutes;}
    public void editSeconds(int seconds){this.seconds= seconds;}
    
    public double getMiles(){return miles;}
    public double getSleep(){return sleep;}
    public String getNotes(){return notes;}
    public int getHours(){return hours;}
    public int getMinutes(){return minutes;}
    public int getSeconds(){return seconds;}
}
