/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University.Department;

import java.lang.*;
import java.util.HashMap;
import university.CourseSchedule.CourseSchedule;
/**
 *
 * @author meghana
 */
public class Calendar {
    
    HashMap<String, CourseSchedule> mastercatalog; 
    
    public Calendar(){
    mastercatalog = new HashMap<String, CourseSchedule>();    
    }
    
    public void addCourseSchedule(String semester, CourseSchedule cs){
        
        mastercatalog.put(semester, cs);
        
    }
    
    
    
}
