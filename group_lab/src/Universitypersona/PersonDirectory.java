/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitypersona;

import Universitypersona.Person;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author meghana
=======
 * @author nihar
>>>>>>> e58cf2050f9344500ceb23c4bcb8a8a6b31041e4
 */
public class PersonDirectory {
    
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
          
       personlist = new ArrayList();

    }

    public Person newPerson(String id) {

        Person p = new Person(id);
        personlist.add(p);
        return p;
    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
