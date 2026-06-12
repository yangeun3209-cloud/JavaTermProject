<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>시간표 알림 프로그램</title>

<style>
body{
    font-family:"Malgun Gothic", Arial, sans-serif;
    margin:0;
    background:#f5f6fa;
    color:#111827;
    line-height:1.8;
}

.container{
    max-width:900px;
    margin:auto;
    padding:40px 24px;
}

h1{
    font-size:44px;
    margin-bottom:10px;
}

.subtitle{
    font-size:20px;
    color:#6b7280;
    margin-bottom:40px;
}

.menu-card{
    display:flex;
    justify-content:space-between;
    align-items:center;
    background:white;
    padding:24px 32px;
    margin-bottom:20px;
    border-radius:18px;
    box-shadow:0 4px 12px rgba(0,0,0,0.08);
    color:#111827;
    font-size:26px;
    font-weight:bold;
    cursor:pointer;
}

.menu-card span{
    color:#9ca3af;
    font-size:32px;
}

.section{
    display:none;
    background:white;
    padding:35px;
    border-radius:16px;
    box-shadow:0 4px 12px rgba(0,0,0,0.08);
}

.section h2{
    color:#1e3a5f;
    border-bottom:2px solid #ddd;
    padding-bottom:10px;
}

table{
    width:100%;
    border-collapse:collapse;
}

th, td{
    border:1px solid #ccc;
    padding:12px;
    text-align:center;
}

th{
    background:#f0f0f0;
}

img{
    max-width:100%;
    border:1px solid #ccc;
    border-radius:10px;
}

.back{
    display:inline-block;
    margin-top:25px;
    color:#1e3a5f;
    font-weight:bold;
    cursor:pointer;
}
</style>
</head>

<body>

<div class="container">

<div id="menu">
<h1>📚 시간표 알림 프로그램</h1>
<p class="subtitle">Java Swing GUI 기반 시간표 관리 프로그램<br>팀장 : 양은찬 | 팀원 : 우민지</p>

<h2>📌 목차</h2>

<div class="menu-card" onclick="showSection('overview')">프로젝트 개요 <span>→</span></div>
<div class="menu-card" onclick="showSection('goal')">개발 목표 <span>→</span></div>
<div class="menu-card" onclick="showSection('features')">주요 기능 <span>→</span></div>
<div class="menu-card" onclick="showSection('structure')">클래스 구조 <span>→</span></div>
<div class="menu-card" onclick="showSection('gui')">GUI 구현 화면 <span>→</span></div>
<div class="menu-card" onclick="showSection('implementation')">핵심 구현 내용 <span>→</span></div>
<div class="menu-card" onclick="showSection('test')">테스트 결과 <span>→</span></div>
<div class="menu-card" onclick="showSection('github')">GitHub 관리 <span>→</span></div>
<div class="menu-card" onclick="showSection('release')">Release <span>→</span></div>
<div class="menu-card" onclick="showSection('conclusion')">프로젝트 결론 <span>→</span></div>
</div>

<div id="overview" class="section">
<h2>프로젝트 개요</h2>
<p>
시간표 알림 프로그램은 학생들이 개인 시간표를 효율적으로 관리할 수 있도록 개발한 Java Swing GUI 프로그램이다.
과목명, 요일, 시간, 강의실 정보를 등록하고 조회·수정·삭제할 수 있으며 수업 시작 전 알림 기능을 제공한다.
</p>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="goal" class="section">
<h2>개발 목표</h2>
<ul>
<li>개인 시간표 관리 편의성 향상</li>
<li>수업 일정 확인 지원</li>
<li>수업 시작 전 알림 기능 제공</li>
<li>Java 객체지향 프로그래밍 학습</li>
<li>파일 입출력 기능 활용</li>
</ul>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="features" class="section">
<h2>주요 기능</h2>
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
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="structure" class="section">
<h2>클래스 구조</h2>
<table>
<tr>
<th>클래스</th>
<th>역할</th>
</tr>
<tr>
<td>Main</td>
<td>프로그램 실행 시작</td>
</tr>
<tr>
<td>Subject</td>
<td>시간표 데이터 저장</td>
</tr>
<tr>
<td>ScheduleManager</td>
<td>시간표 등록, 조회, 수정, 삭제, 정렬, 파일 관리 처리</td>
</tr>
<tr>
<td>TimetableApp</td>
<td>GUI 화면 구성 및 사용자 이벤트 처리</td>
</tr>
</table>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="gui" class="section">
<h2>GUI 구현 화면</h2>
<p>
Java Swing을 활용하여 GUI 기반 시간표 관리 프로그램을 구현하였다.
사용자는 입력창과 버튼을 통해 시간표를 등록, 조회, 수정, 삭제할 수 있다.
</p>
<img src="image.png" alt="시간표 알림 프로그램 GUI">
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="implementation" class="section">
<h2>핵심 구현 내용</h2>
<ul>
<li>ArrayList를 활용한 시간표 데이터 관리</li>
<li>중복 시간 검사 기능 구현</li>
<li>요일별 조회 기능 구현</li>
<li>Comparator를 활용한 시간순 정렬</li>
<li>ObjectOutputStream을 이용한 파일 저장</li>
<li>ObjectInputStream을 이용한 파일 불러오기</li>
<li>예외 처리 및 입력 검증 적용</li>
</ul>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="test" class="section">
<h2>테스트 결과</h2>
<ul>
<li>시간표 등록 정상 동작</li>
<li>전체 조회 정상 동작</li>
<li>요일별 조회 정상 동작</li>
<li>수정 및 삭제 정상 동작</li>
<li>시간순 정렬 정상 동작</li>
<li>수업 알림 정상 동작</li>
<li>파일 저장 및 불러오기 정상 동작</li>
</ul>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="github" class="section">
<h2>GitHub 관리</h2>
<ul>
<li>GitHub 저장소를 활용한 프로젝트 관리</li>
<li>README 및 docs 문서 작성</li>
<li>Issue를 활용한 작업 관리</li>
<li>Commit 기록 관리</li>
<li>GitHub Pages를 활용한 발표 페이지 제작</li>
</ul>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="release" class="section">
<h2>Release</h2>
<p>
최종 버전 v1.0.0 Release를 생성하여 프로젝트를 배포하였다.
</p>
<ul>
<li>시간표 등록</li>
<li>전체 조회</li>
<li>요일별 조회</li>
<li>수정 및 삭제</li>
<li>시간순 정렬</li>
<li>수업 알림</li>
<li>파일 저장 및 불러오기</li>
</ul>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

<div id="conclusion" class="section">
<h2>프로젝트 결론</h2>
<p>
본 프로젝트를 통해 Java GUI 프로그래밍, 객체지향 설계, 파일 입출력, 예외 처리,
GitHub 활용 방법을 학습할 수 있었다.
</p>
<p>
또한 기능별 클래스를 분리하여 유지보수성과 가독성을 향상시켰으며
사용자가 쉽게 시간표를 관리할 수 있는 프로그램을 완성하였다.
</p>
<div class="back" onclick="showMenu()">← 목차로 돌아가기</div>
</div>

</div>

<script>
function hideAllSections(){
    const sections = document.querySelectorAll(".section");
    sections.forEach(section => section.style.display = "none");
}

function showSection(id){
    document.getElementById("menu").style.display = "none";
    hideAllSections();
    document.getElementById(id).style.display = "block";
    window.scrollTo(0, 0);
}

function showMenu(){
    hideAllSections();
    document.getElementById("menu").style.display = "block";
    window.scrollTo(0, 0);
}
</script>

</body>
</html>
