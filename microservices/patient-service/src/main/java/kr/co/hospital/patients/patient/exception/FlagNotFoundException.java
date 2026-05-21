package kr.co.hospital.patients.patient.exception;

public class FlagNotFoundException extends RuntimeException {
    public FlagNotFoundException(Long id) {
        super("환자 상태 플래그를 찾을 수 없습니다. id=" + id);
    }
}
