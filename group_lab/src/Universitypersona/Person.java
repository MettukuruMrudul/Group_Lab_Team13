/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitypersona;

/**
 *
<<<<<<< HEAD
 * @author meghana
=======
 * @author nihar
>>>>>>> e58cf2050f9344500ceb23c4bcb8a8a6b31041e4
 */
public class Person {
    
    String id;
    public Person (String id){
        
        this.id = id;
    }
    public String getPersonId(){
        return id;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
}
