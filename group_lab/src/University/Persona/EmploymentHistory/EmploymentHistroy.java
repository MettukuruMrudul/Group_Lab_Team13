/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University.Persona.EmploymentHistory;

import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author meghana
=======
 * @author nihar
>>>>>>> e58cf2050f9344500ceb23c4bcb8a8a6b31041e4
 */
public class EmploymentHistroy {
    ArrayList<Employment> employments;
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    public Employment newEmployment(String job){
        Employment ne = new Employment(job);
        employments.add(ne);
        return ne;
    }
    
}
