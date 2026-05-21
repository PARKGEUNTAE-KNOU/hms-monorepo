package com.app.medical_support.diagnosticresult.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(schema = "CHJ", name = "SPECIMEN_EXAM_RESULT")
@Getter
@Setter
@NoArgsConstructor
public class SpecimenTestResultEntity {

    @Id
    @Column(name = "SPECIMEN_EXAM_RESULT_ID")
    private String specimenExamResultId;

    @Column(name = "SPECIMEN_EXAM_ID")
    private String specimenExamId;

    @Column(name = "RESULT_ITEM_CODE")
    private String resultItemCode;

    @Column(name = "RESULT_SUMMARY")
    private String resultSummary;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "REFERENCE_RANGE")
    private String referenceRange;

    @Column(name = "JUDGEMENT")
    private String judgement;

    @Column(name = "CONFIRMED_AT")
    private LocalDateTime confirmedAt;

    @Column(name = "RESULT_MANAGER_ID")
    private String resultManagerId;

    @Column(name = "RESULT_MANAGER_NAME")
    private String resultManagerName;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PROGRESS_STATUS")
    private String progressStatus;

    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "COMPLETED_AT")
    private LocalDateTime completedAt;
}
