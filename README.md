# HIS 모노레포 (Hospital Information System)

7개 마이크로서비스를 단일 Gradle Composite Build로 관리하는 모노레포입니다.

## 서비스 구성

| 서비스 | 디렉토리 | 포트 | 설명 |
|---|---|---|---|
| 인증 | `microservices/auth-service` | - | JWT 인증, OAuth2, 직원 계정 관리 |
| 직원 | `microservices/staff-service` | - | 의료진·직원 정보 관리 |
| 환자 | `microservices/patient-service` | - | 환자 등록, 동의서, 코드 관리 |
| 접수 | `microservices/reception-service` | - | 외래 접수·예약 관리 |
| 진료 | `microservices/clinical-service` | - | 진료 기록, SOAP 노트, 처방 |
| 임상지원 | `microservices/clinic-support-service` | - | 검사 실행, 간호 처치, 청구 연동 |
| 청구 | `microservices/billing-service` | - | 보험 청구, 결제(Toss) |

공통 유틸리티는 `util/` 모듈에서 관리합니다 (`ApiResponse` 등).

## 기술 스택

- **Java 17** / **Spring Boot 3.4.2**
- **Spring Security 6**, **Spring Data JPA**, **MyBatis**
- **Oracle DB**, **Redis**, **Kafka**
- **Gradle 8.x** Composite Build

## 빠른 시작

루트에서 Gradle Wrapper로 실행합니다.

```bash
# 전체 빌드
./gradlew buildAll

# 전체 테스트
./gradlew testAll

# 특정 서비스만 빌드
./gradlew patientBuild
./gradlew authBuild
./gradlew staffBuild
./gradlew receptionBuild
./gradlew clinicalBuild
./gradlew clinicSupportBuild
./gradlew billingBuild
```

## 로컬 인프라 기동

```bash
docker-compose up -d
```

Oracle DB, Redis, Kafka 등 의존 인프라를 Docker로 실행합니다.

## 프로젝트 구조

```
HIS/
├── build.gradle              # 루트 빌드 (buildAll, testAll 태스크)
├── settings.gradle           # Composite Build 설정
├── docker-compose.yml        # 로컬 인프라
├── util/                     # 공통 유틸 모듈
│   └── src/main/java/com/hms/util/
└── microservices/
    ├── auth-service/
    ├── staff-service/
    ├── patient-service/
    ├── reception-service/
    ├── clinical-service/
    ├── clinic-support-service/
    └── billing-service/
```
