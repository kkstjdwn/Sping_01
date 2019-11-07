<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Notice Main</title>
<meta charset="utf-8">

</head>
</head>
<body>
<c:import url="../layout/nav.jsp"  />
<c:import url="../layout/bootStrap.jsp"/>
	<div class="container">
		<h2>NOTICE LIST</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>NO</th>
					<th>TITLE</th>
					<th>WRITER</th>
					<th>DATE</th>
					<th>HIT</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="dto">  
				<tr>
					<th>${pageScope.dto.num}</th>
					<th><a href="noticeSelect?num=${pageScope.dto.num}">${pageScope.dto.title}</a></th>
					<th>${pageScope.dto.writer}</th>
					<th>${pageScope.dto.reg_date}</th>
					<th>${pageScope.dto.hit}</th>
					
				</tr>
				</c:forEach>
			</tbody>
			
		</table>
		<!--**********************버튼그룹 -->
		<!-- session member, memberDTO -->
		<c:if test="${empty sessionScope.member}">
		<a href="noticeWrite" class="btn btn-info" id = "btn_right">글쓰기</a>
		</c:if>
		
		</div>

</body>
</html>