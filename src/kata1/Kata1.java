/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1{
    public static void main(String[] args){
        Calendar date = GregorianCalendar.getInstance();
        date.set(1996,9,8);
        Person person = new Person("Samu", date);
        System.out.println(person.getName()+ " tiene  " + person.getAge());
    }
    
}

