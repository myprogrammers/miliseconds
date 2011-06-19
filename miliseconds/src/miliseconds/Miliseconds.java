/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package miliseconds;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author myprogrammers
 */
public class Miliseconds {

    long miliseconds;
    long toSeconds = 1000;
    long toMinute = 60*toSeconds;
    long toHours = 60*toMinute;
    long toDay = 24*toHours;
    long toWeek = 7*toDay;

    public Miliseconds()
    {
        miliseconds = 0;
    }

    public Miliseconds(long milisecs)
    {
        miliseconds = milisecs;
    }

    public long toMiliseconds() {
        return miliseconds;
    }

    public long toMiliseconds(Date date)
    {
        miliseconds = date.getTime();
        return date.getTime();
    }

    public long toMiliseconds(String strDate)
    {
        try
        {
            Date date = new Date(strDate);
            miliseconds = date.getTime();
            return date.getTime();
        }
        catch(Exception ex)
        {
            return 0;
        }

    }

    /**
     * @param day - day of the month, starts with 1,
     * @param month = month of the year, starts with 1,
     * @param year - year of the month, eg. 2001, 1991,
     * @param hours - hours of the day
     *
     */
    public long toMiliseconds(int day, int month, int year, int hours, int minute, int seconds)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day, hours, minute, seconds);
        miliseconds = calendar.getTimeInMillis();
        return calendar.getTimeInMillis();
    }

    public Calendar toCalendar()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(miliseconds);
        return calendar;
    }

    public Date toDate()
    {
        Date date = new Date();
        date.setTime(miliseconds);
        return date;
    }

    public String toString()
    {
        return ""+miliseconds;
    }

    public long plus(long additional)
    {
        miliseconds = miliseconds + additional;
        return miliseconds;
    }

    public Miliseconds diff(Miliseconds anotherMiliseconds)
    {
        return new Miliseconds(this.miliseconds - anotherMiliseconds.miliseconds);
    }

    public long addSeconds(long seconds)
    {
        return plus(seconds * toSeconds);
    }

    public long toMinute()
    {
        return this.miliseconds/toMinute;
    }

    public long addMinute(long minute)
    {
        return plus(minute * toMinute);
    }

    public long toHour()
    {
        return this.miliseconds/toHours;
    }

    public long addHour(long hour)
    {
        return plus(hour * toHours);
    }

    public long toDay()
    {
        return this.miliseconds/toDay;
    }

    public long addDay(int day)
    {
        return plus(day * toDay);
    }

    public long toWeek()
    {
        return this.miliseconds/toWeek;
    }

    public long addWeek(int week)
    {
        return plus(week * toWeek);
    }
    
}
