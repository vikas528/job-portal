package com.blueyonder.team2.JobPortalHireNow.repository;

import com.blueyonder.team2.JobPortalHireNow.model.master.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
