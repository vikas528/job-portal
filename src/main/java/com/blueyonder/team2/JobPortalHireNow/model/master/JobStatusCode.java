package com.blueyonder.team2.JobPortalHireNow.model.master;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "job_status_code")
public class JobStatusCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobStatusCd;
    private String statusDesc;
}
