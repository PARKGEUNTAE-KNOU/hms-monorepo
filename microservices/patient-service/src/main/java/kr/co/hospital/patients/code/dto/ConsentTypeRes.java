package kr.co.hospital.patients.code.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "동의서 유형 응답")
public class ConsentTypeRes {
    @Schema(description = "ID")
    private Long id;
    @Schema(description = "코드")
    private String code;
    @Schema(description = "표시명")
    private String name;
    @Schema(description = "정렬순서")
    private Integer sortOrder;
    @Schema(description = "활성여부")
    private Boolean isActive;
}
