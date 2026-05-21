package com.app.medical_support.nursingtreatment.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(schema = "CHJ", name = "TREATMENT_RESULT")
@Getter
@Setter
@NoArgsConstructor
public class TreatmentResultEntity {

    @Id
    @Column(name = "TREATMENT_RESULT_ID")
    private String treatmentResultId;

    @Column(name = "PROCEDURE_RESULT_ID")
    private String procedureResultId;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PROGRESS_STATUS")
    private String progressStatus;

    @Column(name = "TREATMENT_AT")
    private LocalDateTime treatmentAt;

    @Column(name = "NURSING_ID")
    private String nursingId;

    @Column(name = "NURSE_NAME")
    private String nurseName;

    @Column(name = "DETAIL")
    private String detail;

    @Column(name = "PATIENT_ID")
    private Long patientId;

    @Column(name = "PATIENT_NAME")
    private String patientName;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;
}
