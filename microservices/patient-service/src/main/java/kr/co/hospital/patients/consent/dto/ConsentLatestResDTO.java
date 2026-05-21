package kr.co.hospital.patients.consent.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Schema(description = "동의서 최신 상태")
public class ConsentLatestResDTO {
    @Schema(description = "동의서 ID")
    private Long consentId;
    @Schema(description = "동의서 유형")
    private String consentType;
    @Schema(description = "활성 여부")
    private Boolean activeYn;
    @Schema(description = "동의 일시")
    private LocalDateTime agreedAt;
    @Schema(description = "철회 일시")
    private LocalDateTime withdrawnAt;
}
