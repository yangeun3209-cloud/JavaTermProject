<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>시간표 알림 프로그램</title>

<style>
body{
    font-family: Arial, sans-serif;
    max-width: 1000px;
    margin: auto;
    padding: 20px;
    background-color: #f5f5f5;
    line-height: 1.8;
}

h1{
    text-align:center;
    color:#1e3a5f;
}

h2{
    color:#1e3a5f;
    border-bottom:2px solid #ddd;
    padding-bottom:5px;
}

section{
    background:white;
    padding:20px;
    margin-bottom:20px;
    border-radius:10px;
    box-shadow:0 2px 5px rgba(0,0,0,0.1);
}

table{
    width:100%;
    border-collapse:collapse;
}

table, th, td{
    border:1px solid #ccc;
}

th, td{
    padding:10px;
    text-align:center;
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

<section>
<h2>1. 프로젝트 개요</h2>
<p>
시간표 알림 프로그램은 학생들이 수업 정보를 효율적으로 관리할 수 있도록 개발한 Java Swing GUI 프로그램이다.
과목명, 요일, 시간, 강의실 정보를 등록하여 관리할 수 있으며 조회·수정·삭제 기능을 제공한다.
</p>
</section>

<section>
<h2>2. 개발 목표</h2>
<ul>
<li>개인 시간표 관리 편의성 향상</li>
<li>수업 일정 확인 지원</li>
<li>수업 시작 전 알림 기능 제공</li>
<li>Java 객체지향 프로그래밍 학습</li>
<li>파일 입출력 기능 활용</li>
</ul>
</section>

<section>
<h2>3. 주요 기능</h2>
<ul>
<li>시간표 등록</li>
<li>시간표 전체 조회</li>
<li>요일별 조회</li>
<li>시간표 수정</li>
<li>시간표 삭제</li>
<li>시간순 정렬</li>
<li>수업 알림</li>
<li>파일 저장</li>
<li>파일 불러오기</li>
<li>입력 예외 처리</li>
</ul>
</section>

<section>
<h2>4. 클래스 구조</h2>

<table>
<tr>
<th>클래스</th>
<th>역할</th>
</tr>

<tr>
<td>Main</td>
<td>프로그램 시작</td>
</tr>

<tr>
<td>Subject</td>
<td>시간표 데이터 저장</td>
</tr>

<tr>
<td>ScheduleManager</td>
<td>시간표 관리 기능 처리</td>
</tr>

<tr>
<td>TimetableApp</td>
<td>GUI 및 사용자 입력 처리</td>
</tr>
</table>

</section>

<section>
<h2>5. GUI 구현 화면</h2>

<p>실제 프로그램 실행 화면</p>

<img src="image.png" alt="GUI 화면">

</section>

<section>
<h2>6. 핵심 구현 내용</h2>

<ul>
<li>시간표 등록 및 관리 기능 구현</li>
<li>요일별 조회 기능 구현</li>
<li>시간표 수정 및 삭제 기능 구현</li>
<li>시간순 정렬 기능 구현</li>
<li>수업 알림 기능 구현</li>
<li>파일 저장 및 불러오기 기능 구현</li>
<li>예외 처리 및 입력 검증 적용</li>
</ul>

</section>

<section>
<h2>7. 테스트 결과</h2>

<table>

<tr>
<th>기능</th>
<th>결과</th>
</tr>

<tr>
<td>시간표 등록</td>
<td>정상</td>
</tr>

<tr>
<td>전체 조회</td>
<td>정상</td>
</tr>

<tr>
<td>요일별 조회</td>
<td>정상</td>
</tr>

<tr>
<td>수정</td>
<td>정상</td>
</tr>

<tr>
<td>삭제</td>
<td>정상</td>
</tr>

<tr>
<td>시간순 정렬</td>
<td>정상</td>
</tr>

<tr>
<td>수업 알림</td>
<td>정상</td>
</tr>

<tr>
<td>파일 저장</td>
<td>정상</td>
</tr>

<tr>
<td>파일 불러오기</td>
<td>정상</td>
</tr>

</table>

</section>

<section>
<h2>8. GitHub 관리</h2>

<ul>
<li>GitHub 저장소를 활용한 프로젝트 관리</li>
<li>Commit 기록 관리</li>
<li>Issues 활용</li>
<li>프로젝트 문서 관리</li>
<li>팀원 간 협업</li>
</ul>

</section>

<section>
<h2>9. Release</h2>

<p><strong>Version : v1.0.0</strong></p>

<ul>
<li>시간표 등록</li>
<li>전체 조회</li>
<li>요일별 조회</li>
<li>수정 및 삭제</li>
<li>시간순 정렬</li>
<li>수업 알림</li>
<li>파일 저장</li>
<li>파일 불러오기</li>
</ul>

</section>

<section>
<h2>10. 프로젝트 결론</h2>

<p>
시간표 알림 프로그램을 통해 Java 객체지향 프로그래밍,
파일 입출력, 예외 처리, GitHub 활용 방법을 학습할 수 있었다.
또한 GUI 환경에서 사용자 친화적인 프로그램을 구현하며 실제 소프트웨어 개발 과정을 경험할 수 있었다.
</p>

</section>

</body>
</html>
