# 6. Source Directory

## 1. 프로젝트 디렉토리 구조

시간표 알림 프로그램은 Java 콘솔 기반 프로젝트로 개발하였다.

### src 디렉토리 구조

```text
src/
├─ Main.java
├─ Subject.java
├─ ScheduleManager.java
└─ TimetableApp.java
```

---

## 2. 파일 구성

### Main.java

프로그램의 시작점(main 메서드) 역할을 수행한다.

주요 기능

* 프로그램 실행
* TimetableApp 객체 생성
* 메뉴 화면 호출

---

### Subject.java

시간표 정보를 저장하는 데이터 클래스이다.

저장 정보

* 과목명
* 요일
* 시작 시간
* 종료 시간
* 강의실

---

### ScheduleManager.java

시간표 데이터를 관리하는 클래스이다.

주요 기능

* 시간표 등록
* 전체 조회
* 요일별 조회
* 수정
* 삭제
* 시간순 정렬
* 수업 알림
* 파일 저장
* 파일 불러오기
* 중복 시간 검사

---

### TimetableApp.java

사용자 메뉴를 제공하고 프로그램 실행을 담당하는 클래스이다.

메뉴 구성

1. 시간표 등록
2. 시간표 전체 조회
3. 요일별 조회
4. 시간표 수정
5. 시간표 삭제
6. 시간순 정렬
7. 수업 알림
8. 파일 저장
9. 파일 불러오기
10. 종료

---

## 3. 디렉토리 구성 목적

프로젝트를 기능별 클래스로 분리하여 가독성과 유지보수성을 향상시켰다.

* Main : 프로그램 시작
* Subject : 데이터 저장
* ScheduleManager : 데이터 관리
* TimetableApp : 사용자 인터페이스

각 클래스가 하나의 역할만 담당하도록 설계하였다.

---

## 4. GitHub 업로드 과정

프로젝트 작성 후 GitHub 저장소에 업로드하였다.

1. 파일 작성
2. Git Add 수행
3. Commit 생성
4. GitHub Push 진행

사용 명령어

```bash
git add .
git commit -m "feat: 시간표 알림 프로그램 구현"
git push origin main
```

---

## 5. 작성 규칙

프로젝트 작성 시 다음 규칙을 적용하였다.

* 1파일 1클래스 원칙 적용
* 클래스명 PascalCase 사용
* 변수명 및 메서드명 camelCase 사용
* 기능별 클래스 분리
* 예외처리 적용

---

## 6. 최종 디렉토리 구조

```text
JavaTermProject
│
├─ README.md
│
├─ docs
│ ├─ project-overview.md
│ ├─ requirement-analysis.md
│ ├─ feature-implementation.md
│ ├─ testing-optimization.md
│ ├─ summary.md
│ └─ ai-prompts.md
│
└─ src
    ├─ Main.java
    ├─ Subject.java
    ├─ ScheduleManager.java
    └─ TimetableApp.java
```

위와 같은 구조로 프로젝트를 구성하여 관리하였다.
