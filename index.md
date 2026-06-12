<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>시간표 알림 프로그램</title>

<style>
body{
    font-family: Arial, sans-serif;
    max-width: 1000px;
    margin:auto;
    padding:20px;
    background:#f5f5f5;
    line-height:1.8;
}

h1{
    text-align:center;
    color:#1e3a5f;
}

h2{
    color:#1e3a5f;
    border-bottom:2px solid #ddd;
    padding-bottom:8px;
}

section{
    background:white;
    padding:25px;
    margin-bottom:25px;
    border-radius:10px;
    box-shadow:0 2px 5px rgba(0,0,0,0.1);
}

nav{
    background:white;
    padding:20px;
    border-radius:10px;
    margin-bottom:25px;
    min-height:80vh;
}

nav a{
    display:block;
    margin:10px 0;
    color:#1e3a5f;
    text-decoration:none;
    font-weight:bold;
}

nav a:hover{
    text-decoration:underline;
}

img{
    max-width:100%;
    border:1px solid #ccc;
    border-radius:10px;
}
</style>

</head>
<body>

<h1>📚 시간표 알림 프로그램</h1>

<p style="text-align:center;">
Java Swing GUI 기반 시간표 관리 프로그램<br>
팀장 : 양은찬 | 팀원 : 우민지
</p>

<nav>
<h2>📌 목차</h2>

<a href="#overview">1. 프로젝트 개요</a>
<a href="#goal">2. 개발 목표</a>
<a href="#feature">3. 주요 기능</a>
<a href="#class">4. 클래스 구조</a>
<a href="#gui">5. GUI 구현 화면</a>
<a href="#implementation">6. 핵심 구현 내용</a>
<a href="#test">7. 테스트 결과</a>
<a href="#github">8. GitHub 관리</a>
<a href="#release">9. Release</a>
<a href="#summary">10. 프로젝트 결론</a>
</nav>

<section id="overview">
<h2>1. 프로젝트 개요</h2>

<p>
시간표 알림 프로그램은 학생들이 개인 시간표를 효율적으로 관리할 수 있도록 개발한 Java Swing GUI 프로그램이다.
과목명, 요일, 시간, 강의실 정보를 등록하고 조회·수정·삭제할 수 있으며 수업 시작 전 알림 기능을 제공한다.
</p>
</section>

<section id="goal">
<h2>2. 개발 목표</h2>

<ul>
<li>개인 시간표 관리 편의성 향상</li>
<li>수업 일정 확인 지원</li>
<li>수업 시작 전 알림 기능 제공</li>
<li>Java 객체지향 프로그래밍 학습</li>
<li>파일 입출력 기능 활용</li>
</ul>
</section>

<section id="feature">
<h2>3. 주요 기능</h2>

<ul>
<li>시간표 등록</li>
<li>시간표 전체 조회</li>
<li>요일별 조회</li>
<li>시간표 수정</li>
<li>시간표 삭제</li>
<li>시간순 정렬</li>
<li>수업 알림</li>
<li>파일 저장 및 불러오기</li>
</ul>
</section>

<section id="class">
<h2>4. 클래스 구조</h2>

<ul>
<li>Main : 프로그램 실행</li>
<li>Subject : 시간표 데이터 저장</li>
<li>ScheduleManager : 시간표 관리 기능 처리</li>
<li>TimetableApp : GUI 및 이벤트 처리</li>
</ul>
</section>

<section id="gui">
<h2>5. GUI 구현 화면</h2>

<img src="image.png" alt="GUI 화면">

<p>
Java Swing을 활용하여 GUI 환경에서 시간표를 등록, 조회, 수정, 삭제할 수 있도록 구현하였다.
</p>
</section>

<section id="implementation">
<h2>6. 핵심 구현 내용</h2>

<ul>
<li>ArrayList를 활용한 시간표 관리</li>
<li>중복 시간 검사 기능 구현</li>
<li>요일별 조회 기능 구현</li>
<li>Comparator를 활용한 시간순 정렬</li>
<li>ObjectOutputStream을 이용한 파일 저장</li>
<li>ObjectInputStream을 이용한 파일 불러오기</li>
<li>예외 처리 적용</li>
</ul>
</section>

<section id="test">
<h2>7. 테스트 결과</h2>

<ul>
<li>시간표 등록 정상 동작</li>
<li>조회 및 요일별 조회 정상 동작</li>
<li>수정 및 삭제 기능 정상 동작</li>
<li>시간순 정렬 정상 동작</li>
<li>수업 알림 기능 정상 동작</li>
<li>파일 저장 및 불러오기 정상 동작</li>
</ul>
</section>

<section id="github">
<h2>8. GitHub 관리</h2>

<ul>
<li>GitHub 저장소 생성</li>
<li>프로젝트 소스 코드 관리</li>
<li>문서 작성 및 버전 관리</li>
<li>Issue 활용</li>
<li>Collaborator 협업 기능 활용</li>
</ul>
</section>

<section id="release">
<h2>9. Release</h2>

<p>
최종 버전 v1.0.0 Release를 생성하여 프로젝트를 배포하였다.
</p>

<ul>
<li>시간표 등록</li>
<li>조회</li>
<li>수정</li>
<li>삭제</li>
<li>정렬</li>
<li>파일 저장 및 불러오기</li>
</ul>
</section>

<section id="summary">
<h2>10. 프로젝트 결론</h2>

<p>
본 프로젝트를 통해 Java GUI 프로그래밍, 객체지향 설계, 파일 입출력, GitHub 활용 방법을 학습할 수 있었다.
또한 기능별 클래스를 분리하여 유지보수성과 가독성을 향상시켰으며 실제 시간표 관리 프로그램을 구현하였다.
</p>
</section>

</body>
</html>
