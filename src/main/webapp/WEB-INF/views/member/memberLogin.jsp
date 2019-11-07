<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>M-L</title>
</head>
<body>
<c:import url="../layout/nav.jsp"  />
<c:import url="../layout/bootStrap.jsp"/>
<div class="container">
<div id="di">
  <h2>LOGIN</h2></div>
  <form action="memberLogin" method="post">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="text" class="form-control" id="id" placeholder="Enter ID" name="id" value="">
    </div>
    <div class="form-group">
      <label for="pwd">PW:</label>
      <input type="password" class="form-control" id="pw" placeholder="Enter PW" name="pw">
    </div>
    <div class="form-group">        
        <div class="checkbox">
          <label><input type="checkbox" name="remember" value="check" checked="checked"> Remember me</label>
        </div>
    </div>
    
    <button type="submit" class="btn btn-default">LOGIN</button>
    
  </form>
</div>
</body>
</html>