<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/day4/src/main/webapp/css/index2.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	function fenye(cpage){

			$("[name='cpage']").val(cpage);
			$("form").submit();
	}

</script>
</head>
<body>	
	<form action="list.do" method="post" id="page">
		<input type="hidden" name="cpage" onclick="fenye()">
		用户名：<input type="text" name="mohu" value="${map.mohu}">
		<input type="submit">
		<input type="button" value="添加" onclick="location='toadd.do'">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>名字</td>
			<td>介绍</td>
			<td>导演</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.mid }</td>
				<td>${u.mname }</td>
				<td>${u.content}</td>
				<td>${u.dy}</td>
				<td>${u.mdate}</td>
				<td>操作</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>