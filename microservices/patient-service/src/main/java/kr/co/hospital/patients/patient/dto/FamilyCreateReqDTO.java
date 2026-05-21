package kr.co.hospital.patients.patient.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@Schema(description = "가족 기본정보 등록")
public class FamilyCreateReqDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "관계(아버지, 어머니 등)", required = true)
    private String relation;
    @Schema(description = "가족명", required = true)
    private String familyName;
    @Schema(description = "가족 연락처")
    private String familyPhone;
    @Schema(description = "생년월일")
    private LocalDate birthDate;
    @Schema(description = "기본 연락처 여부")
    private Boolean isPrimary;
}
