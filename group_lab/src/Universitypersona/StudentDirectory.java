/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitypersona;

import University.Department.Department;
import java.util.ArrayList;

/**
 *
<<<<<<< HEAD
 * @author meghana
=======
 * @author nihar
>>>>>>> e58cf2050f9344500ceb23c4bcb8a8a6b31041e4
 */
public class StudentDirectory {

    Department department;
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
