package com.controller;

import com.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    List<Student> studentList = new ArrayList<>(Arrays.asList(
            new Student("Abs","123","toshkent",10),
            new Student("Ab","1123","tosdsahkent",11),
            new Student("A","1223","toshkenasdaft",12),
            new Student("Aabs","3123","toshket",13),
            new Student("Abbs","1423","toshkefant",14)
    ));

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudentPage(Model model){
        model.addAttribute("students",studentList);
        return "studnet";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudentPage(){
        return "addStudnet";
    }
}
