/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

public class Kata1{
    public static void main(String[] args){
        Person person = new Person("Samu", new Date(96,04,15));
        System.out.println(person.getName()+ " tiene  " + person.getAge());
    }
    
}

