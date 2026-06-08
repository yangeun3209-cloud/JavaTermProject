# Feature Implementation

## 3.1 기능 구현 현황

| 요구사항 번호 | 간단 설명      | 관련 소스                    | 구현 여부   |
| ------- | ---------- | ------------------------ | ------- |
| REQ-001 | 시간표 등록     | src/TimetableApp.java    | ✅ 완성    |
| REQ-002 | 시간표 전체 조회  | src/TimetableApp.java    | ✅ 완성    |
| REQ-003 | 요일별 조회     | src/TimetableApp.java    | ✅ 완성    |
| REQ-004 | 시간표 수정     | src/TimetableApp.java    | ✅ 완성    |
| REQ-005 | 시간표 삭제     | src/TimetableApp.java    | ✅ 완성    |
| REQ-006 | 시간순 정렬     | src/ScheduleManager.java | ✅ 완성    |
| REQ-007 | 수업 시작 전 알림 | src/TimetableApp.java    | 🔶 부분완성 |
| REQ-008 | 파일 저장      | src/ScheduleManager.java | ✅ 완성    |
| REQ-009 | 파일 불러오기    | src/ScheduleManager.java | ✅ 완성    |
| REQ-010 | 입력 예외 처리   | src/TimetableApp.java    | ✅ 완성    |
| REQ-011 | 중복 시간 검사   | src/ScheduleManager.java | ✅ 완성    |

---

## 3.2 구현 내용 설명

### REQ-001: 시간표 등록

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 과목명, 요일, 시작시간, 종료시간, 강의실 정보를 입력받아 시간표를 등록할 수 있도록 구현하였다.

### REQ-002: 시간표 전체 조회

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 등록된 모든 시간표를 목록 형태로 출력하도록 구현하였다.

### REQ-003: 요일별 조회

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 사용자가 입력한 요일에 해당하는 시간표만 출력하도록 구현하였다.

### REQ-004: 시간표 수정

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 기존 시간표를 선택하여 내용을 수정할 수 있도록 구현하였다.

### REQ-005: 시간표 삭제

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 사용자가 선택한 시간표를 삭제할 수 있도록 구현하였다.

### REQ-006: 시간순 정렬

* 구현 여부: ✅ 완성
* 관련 소스: src/ScheduleManager.java
* 설명: 등록된 시간표를 시작 시간 기준으로 정렬하여 출력하도록 구현하였다.

### REQ-007: 수업 시작 전 알림

* 구현 여부: 🔶 부분완성
* 관련 소스: src/TimetableApp.java
* 설명: 수업 알림 기능을 구현하였으나 실시간 알림 기능은 제한적으로 구현하였다.
* 미완성 사유: 콘솔 환경의 한계로 인해 백그라운드 알림 기능을 완전히 구현하지 못하였다.

### REQ-008: 파일 저장

* 구현 여부: ✅ 완성
* 관련 소스: src/ScheduleManager.java
* 설명: 시간표 데이터를 JSON 파일 형태로 저장할 수 있도록 구현하였다.

### REQ-009: 파일 불러오기

* 구현 여부: ✅ 완성
* 관련 소스: src/ScheduleManager.java
* 설명: 저장된 JSON 파일을 읽어와 시간표를 복원할 수 있도록 구현하였다.

### REQ-010: 입력 예외 처리

* 구현 여부: ✅ 완성
* 관련 소스: src/TimetableApp.java
* 설명: 잘못된 입력값에 대해 예외를 처리하고 오류 메시지를 출력하도록 구현하였다.

### REQ-011: 중복 시간 검사

* 구현 여부: ✅ 완성
* 관련 소스: src/ScheduleManager.java
* 설명: 동일한 시간에 중복된 수업이 등록되지 않도록 검사 기능을 구현하였다.
