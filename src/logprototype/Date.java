/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logprototype;


import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author 151spaka
 */
public class Date {
    private int month;
    private int year;
    private int day;
    private int dayOfWeek;//Sunday=1, monday=2, etc.
//    private static final int JANUARY_DAYS = 31;
//    private static final int FEBRUARY_DAYS = 28;
//    private static final int FEBRUARY_DAYS_LEAP_YEAR = 29;
//    private static final int MARCH_DAYS = 31;
//    private static final int APRIL_DAYS = 30;
//    private static final int MAY_DAYS = 31;
//    private static final int JUNE_DAYS = 30;
//    private static final int JULY_DAYS = 31;
//    private static final int AUGUST_DAYS = 31;
//    private static final int SEPTEMBER_DAYS = 30;
//    private static final int OCTOBER_DAYS = 31;
//    private static final int NOVEMBER_DAYS = 30;
//    private static final int DECEMBER_DAYS = 31;
    private Map<Integer,Integer> daysInMonth = new TreeMap<Integer,Integer>();
    
    public Date(int m, int d, int y){
        daysInMonth.put(1,31);
        daysInMonth.put(2,28);
        daysInMonth.put(3,31);
        daysInMonth.put(4,30);
        daysInMonth.put(5,31);
        daysInMonth.put(6,30);
        daysInMonth.put(7,31);
        daysInMonth.put(8,31);
        daysInMonth.put(9,30);
        daysInMonth.put(10,31);
        daysInMonth.put(11,30);
        daysInMonth.put(12,31);
        daysInMonth.put(13,29);
        if(y<0) year=2013;
        switch(m){
            case 4: case 6: case 9: case 11:
                month = m;
                if(day>30||day<1){
                    day = 1;
                }
                else day = d;
                break;
            case 2:
                month = m;
                if((year%4==0&&year%100!=0)||year%400==0){
                    if(day>29||day<1){
                        day=1;
                    }
                    else day = d;
                }
                else{
                    if(day>28||day<1){
                        day=1;
                    }
                    else day = d;
                }
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                month = m;
                if(day>31||day<1){
                    day = 1;
                }
                else day = d;
                break;
           default:
               month =1;
               if(day>31||day<1){
                    day = 1;
                }
                else day = d;
                break;
        }
        //The day of week on 11/6/13 is WEDNESDAY, aka 4
        //11/6/13 is day 310 of the year
        final int CURRENT_DAY_CONSTANT =310;
        final int CURRENT_DAYOFWEEK_CONSTANT=4;
        int numDaysInYear = 0;
        if((year%4==0&&year%100!=0)||year%400==0)
            numDaysInYear=365;
        else
            numDaysInYear=366;
        if(year>2013){
            
        }
        else if(year==2013){
            if(month>11){
                dayOfWeek=(numDaysInYear-(335+day));
            }
            else if(month==11){
                
            }
            else{
                
            }
        }
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public int getDayOfWeek(){
        return dayOfWeek;
    }
}

