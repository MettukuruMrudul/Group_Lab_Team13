/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University.workareas;

import Universitypersona.Person;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author meghana
 */
public class Workarea {
    
    Person person; //owner
    ArrayList<WorkRequest> inQueue;
    ArrayList<WorkRequest> outQueue;
    
    public Workarea(Person p){
        
        person = p;
        inQueue = new ArrayList();
        outQueue = new ArrayList();
        
        
    }
    
    public void addInQuestRequest(WorkRequest wr){
        inQueue.add(wr);
    }

}
