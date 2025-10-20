/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University.Persona.Faculty;

import university.CourseSchedule.CourseOffer;


/**
 *
<<<<<<< HEAD
 * @author meghana
=======
 * @author nihar
>>>>>>> e58cf2050f9344500ceb23c4bcb8a8a6b31041e4
 */
public class FacultyAssignment {
    double tracerating;
    CourseOffer courseoffer;
    FacultyProfile facultyprofile;
    public FacultyAssignment(FacultyProfile fp, CourseOffer co){
        courseoffer = co;
        facultyprofile = fp;
    }

       public double getRating(){
        
        return tracerating;
    }
       public void seProfRating(double r){
           
           tracerating = r;
       }
    public FacultyProfile getFacultyProfile(){
        return facultyprofile;
    }
    
}
