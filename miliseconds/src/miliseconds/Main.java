/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package miliseconds;

import java.util.Calendar;

/**
 *
 * @author myprogrammers
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Miliseconds mili = new Miliseconds();
        mili.toMiliseconds(16, 9, 2011, 8, 0, 0);
        System.out.println(mili.toString());

        System.out.println("-----------------------");

        Calendar sixteenSept = Calendar.getInstance();
        sixteenSept.set(2011, Calendar.SEPTEMBER, 16, 8, 0, 0);
        System.out.println("Calendar in milis "+sixteenSept.getTimeInMillis());

        final Miliseconds initialMili = new Miliseconds(mili.toMiliseconds());

        System.out.println("in hours: "+mili.toHour());
        System.out.println("in hours: "+initialMili.toHour());
        mili.addDay(1);
        System.out.println("Add 1 day "+mili.toString());

        System.out.println("now  we have: "+mili.toString());

        System.out.println("in hours: "+mili.toHour());
        System.out.println("in hours: "+initialMili.toHour());

        System.out.println("difference in hours: "+mili.diff(initialMili).toHour());
    }

}
