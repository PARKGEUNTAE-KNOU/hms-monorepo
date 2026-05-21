package kr.co.hospital.patients.code.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "동의서 유형 요청")
public class ConsentTypeReq {
    @Schema(description = "코드", example = "PRIVACY")
    private String code;

    @Schema(description = "표시명", example = "개인정보 수집/이용")
    private String name;

    @Schema(description = "정렬순서", example = "1")
    private Integer sortOrder;

    @Schema(description = "활성여부", example = "true")
    private Boolean isActive;
}
