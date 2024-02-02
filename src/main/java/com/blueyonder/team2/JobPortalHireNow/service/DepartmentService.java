package com.blueyonder.team2.JobPortalHireNow.service;

import com.blueyonder.team2.JobPortalHireNow.model.master.Department;
import com.blueyonder.team2.JobPortalHireNow.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public void createDepartment(Department department){
        departmentRepository.save(department);
    }
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long deptId){
        return departmentRepository.findById(deptId);
    }

    public Department updateDepartment(Long deptId, Department departmentDetails){
        Optional<Department> department = departmentRepository.findById(deptId);
        if (department.isPresent()) {
            Department existingDepartment = department.get();
            existingDepartment.setDeptName(departmentDetails.getDeptName());
            return departmentRepository.save(existingDepartment);
        }
        return null;
    }

    public void deleteAllDepartment(){
        departmentRepository.deleteAll();
    }

    public void deleteDepartment(Long deptId){
        departmentRepository.deleteById(deptId);
    }
}
