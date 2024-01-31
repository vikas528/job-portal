package com.blueyonder.team2.JobPortalHireNow.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private Integer employeeId;
    private String employeeName;
    private String dateOfBirth;
    private float salary;

    //has a relation
    private Address address;
}
