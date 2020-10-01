package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Student;
import com.sparta.halls.app.services.EnquiriesService;
import com.sparta.halls.app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AdminController {

    private EnquiriesService enquiriesService;
    private StudentService studentService;

    @Autowired
    public AdminController(EnquiriesService enquiriesService, StudentService studentService) {
        this.enquiriesService = enquiriesService;
        this.studentService = studentService;
    }

    @GetMapping("/viewPublicEnquiries")
    public String dummyMethod10(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(1);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewPublicEnquiries";
    }

    @GetMapping("/viewMaintenancePosts")
    public String dummyMethod11(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(2);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewMaintenancePosts";
    }

    @GetMapping("/viewRoomBookings")
    public String dummyMethod12(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(3);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewRoomBookings";
    }

    @GetMapping("/studentRecords")
    public String dummyMethod1(Model model) {
        model.addAttribute("student", new Student());
        return "view/adminPages/studentRecords";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student, Model model){
        studentService.addStudent(student);
        return "view/adminPages/updateSuccess";
    }

    @PostMapping("/deleteStudent")
    public String deleteStudent(@ModelAttribute Student student, Model model){
        int studentId = student.getStudentId();
        studentService.deleteStudent(studentId);
        return "view/adminPages/updateSuccess";
    }

}
