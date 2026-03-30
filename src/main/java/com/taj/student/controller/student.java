package com.taj.student.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class student {


    //GetStudents

    @GetMapping("/students")
    public String getStudents(){
        return "GET STUDENTS";
    }



    //SaveStudents
    @PostMapping("/saveStudent")
    public String saveStudents(){
        return "SAVESTUDENTS";
    }


    //UpdateStudents
     @PutMapping("/updateStudent")
    public String updateStudents(){
        return "UPDATESTUDENTS";
     }


    //DeleteStudents
    @DeleteMapping("/deleteStudent")
    public String deleteStudents(){
        return "DELETESTUDENTS";
     }


    
}