package kr.co.hospital.patients.patient.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "환자 자동 식별 요청")
public class PatientIdentifyReqDTO {
    @Schema(description = "환자명")
    private String name;
    @Schema(description = "생년월일(YYYY-MM-DD)")
    private String birthDate;
    @Schema(description = "연락처")
    private String phone;
}
