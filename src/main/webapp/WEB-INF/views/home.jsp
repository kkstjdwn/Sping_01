<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>

</head>
<body>
<c:import url="layout/nav.jsp"  />
<c:import url="layout/bootStrap.jsp"/>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="test">Go Test</a>
<a href="notice/noticeList">Not-List</a>
</body>
</html>
