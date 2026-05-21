package kr.co.hospital.patients.consent.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Schema(description = "동의 철회 이력")
public class ConsentWithdrawHistoryResDTO {
    @Schema(description = "이력 ID")
    private Long historyId;
    @Schema(description = "동의서 ID")
    private Long consentId;
    @Schema(description = "동의서 유형")
    private String consentType;
    @Schema(description = "철회 일시")
    private LocalDateTime withdrawnAt;
    @Schema(description = "처리자")
    private String changedBy;
    @Schema(description = "생성 일시")
    private LocalDateTime createdAt;
}
