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
        mili.toMiliseconds(16, 9, 2001, 8, 0, 0);
        System.out.println(mili.toString());

        System.out.println("-----------------------");

        Calendar fifthOfFeb = Calendar.getInstance();
        fifthOfFeb.set(2001, Calendar.SEPTEMBER, 16, 8, 0, 0);
        System.out.println(fifthOfFeb.toString());
        System.out.println(fifthOfFeb.getTimeInMillis());
    }

}
