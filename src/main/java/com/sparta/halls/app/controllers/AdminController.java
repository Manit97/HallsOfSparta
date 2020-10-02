package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Rooms;
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
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_VIEW_PUBLIC_ENQUIRIES);
    }

    @GetMapping("/viewMaintenancePosts")
    public String dummyMethod11(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(2);
        model.addAttribute("enquiries", enquiries);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_VIEW_MAINTENANCE_POSTS);
    }

    @GetMapping("/viewRoomBookings")
    public String dummyMethod12(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(3);
        model.addAttribute("enquiries", enquiries);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_VIEW_ROOM_BOOKINGS);
    }

    @GetMapping("/studentRecords")
    public String dummyMethod1(Model model) {
        model.addAttribute("student", new Student());
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_MANAGE_STUDENT_RECORDS);
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student, Model model){
        studentService.addStudent(student);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_ADD_RECORD_SUCCESS);
    }

    @PostMapping("/deleteStudent")
    public String deleteStudent(@ModelAttribute Student student, Model model){
        int studentId = student.getStudentId();
        studentService.deleteStudent(studentId);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_DELETE_RECORD_SUCCESS);
    }

//    @GetMapping("/editRoomRecords")
//    public String getRooms(Model model) {
//        model.addAttribute("student", new Student());
//        return "view/adminPages/editRoomRecords";
//    }

}
