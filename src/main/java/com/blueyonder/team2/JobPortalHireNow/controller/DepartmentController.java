package com.blueyonder.team2.JobPortalHireNow.controller;

import com.blueyonder.team2.JobPortalHireNow.model.master.Department;
import com.blueyonder.team2.JobPortalHireNow.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Controller
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService departmentService;

//    @PostMapping
//    public Department createDepartment(@RequestBody Department department, Model model) {
//        return departmentService.createDepartment(department);
//    }

    @PostMapping
    public String addDepartment(@ModelAttribute("department") Department department, Model model){
        departmentService.createDepartment(department);
        return "redirect:/departments";
    }
//     Get all users
//    @GetMapping
//    public List<Department> getAllDepartment() {
//        return departmentService.getAllDepartment();
//    }

    @GetMapping
    public String getAllDepartment(Model model){
        List<Department> departments = departmentService.getAllDepartment();
        model.addAttribute("departments", departments);
        return "department_list";
    }

    // Get user by ID
//    @GetMapping("/{deptId}")
//    public Optional<Department> getDepartmentById(@PathVariable Long deptId) {
//        return departmentService.getDepartmentById(deptId);
//    }

    @GetMapping("/{deptId}")
    public String getDepartment(@PathVariable Long deptId, Model model){
//        Optional<Department> department = departmentService.getDepartmentById(deptId);
//        if(department.isEmpty()) return "error";
//        model.addAttribute("departments", department);
        return "department_list";
    }

    // Update user by ID
    @PutMapping("/{deptId}")
    public Department updateDepartment(@PathVariable Long deptId, @RequestBody Department departmentDetails) {
        return departmentService.updateDepartment(deptId, departmentDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllDepartment(Model model) {
        departmentService.deleteAllDepartment();
        return "All users have been deleted successfully.";
    }

    // Delete user by ID
    @DeleteMapping("/{deptId}")
    public String deleteUser(@PathVariable Long deptId) {
        departmentService.deleteDepartment(deptId);
        return "account";
    }
}
