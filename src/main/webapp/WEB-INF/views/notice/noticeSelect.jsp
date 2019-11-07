<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>S-O</title>
<c:import url="../layout/css.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp"  />
<c:import url="../layout/bootStrap.jsp"/>
<div class="container">
		<form class="form-horizontal" action="/action_page.php">
			<div class="form-group">
				<label class="control-label col-sm-2" for="title">TITLE</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="title" name="title"
						readonly="readonly" value="${dto.title }">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="hit" id="hit_lb">HIT</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="hit" name="hit"
						readonly="readonly" value="${dto.hit }">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="writer">WRITER</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="writer" name="writer"
						readonly="readonly" value="${dto.writer }">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="contents">CONTENTS</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="contents" name="contents"
						readonly="readonly">${dto.contents }</textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="reg_date">DATE</label>
				<div class="col-sm-10">
				<input type="text" class="form-control" id="reg_date" name="reg_date"
						readonly="readonly" value ="${dto.reg_date }">
				</div>
			</div>
		</form>

		<!--**********************버튼그룹 -->

<div id = "bt_gp">
		<a href="noticeList" class="btn btn-primary" id="btn_right">목록</a>
		<a href="noticeUpdate" class="btn btn-warning btn_gp">수정</a>
		<a href="noticeUpdate" class="btn btn-danger">삭제</a>
		
</div>
	</div>
</body>
</html>