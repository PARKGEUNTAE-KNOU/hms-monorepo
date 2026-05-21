package kr.co.hospital.patients.patient.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(description = "환자 자동 식별 응답")
public class PatientIdentifyResDTO {
    @Schema(description = "매치 레벨(STRONG, MEDIUM, WEAK)")
    private String matchLevel;
    @Schema(description = "환자 정보")
    private PatientResDTO patient;
}
