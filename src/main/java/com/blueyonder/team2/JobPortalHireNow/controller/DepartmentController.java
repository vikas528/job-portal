package com.blueyonder.team2.JobPortalHireNow.controller;

import com.blueyonder.team2.JobPortalHireNow.model.Department;
import com.blueyonder.team2.JobPortalHireNow.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    // Get all users
//    @GetMapping
//    public List<Department> getAllDepartment() {
//        return departmentService.getAllDepartment();
//    }

    @GetMapping
    public String showAllDepartment(Model model){
        List<Department> departments = departmentService.getAllDepartment();
        model.addAttribute("departments", departments);
        return "department_list";
    }

    // Get user by ID
    @GetMapping("/{deptId}")
    public Optional<Department> getDepartmentById(@PathVariable Long deptId) {
        return departmentService.getDepartmentById(deptId);
    }

    // Update user by ID
    @PutMapping("/{deptId}")
    public Department updateDepartment(@PathVariable Long deptId, @RequestBody Department departmentDetails) {
        return departmentService.updateDepartment(deptId, departmentDetails);
    }

    // Delete all users
    @DeleteMapping
    public String deleteAllDepartment() {
        departmentService.deleteAllDepartment();
        return "All users have been deleted successfully.";
    }

    // Delete user by ID
    @DeleteMapping("/{deptId}")
    public void deleteUser(@PathVariable Long deptId) {
        departmentService.deleteDepartment(deptId);
    }
}
