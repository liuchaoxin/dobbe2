<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表页面</title>
<script type="text/javascript" src="/resource/js/jquery-1.8.3.js"></script>
<link href="/resource/css/index3.css" rel="stylesheet">
</head>
<body>
<form action="list" method="post">
	<input type="text" name="d1" > - 
	<input type="text" name="d2" >
	
	<select name="a1">
		<option value="">请选择</option>
		<option value="created">发表时间</option>
		<option value="user_id">作者</option>
		<option value="hits">点击数量</option>
	</select>
	
	<select name="a2">
		<option value="">请选择</option>
		<option value="asc">正序</option>
		<option value="desc">倒序</option>
	</select>
	<input type="submit" value="模糊查询">
</form>
	<table>
	<tr>
		<td>编号</td>
		<td>标题</td>
		<td>作者</td>
		<td>发布时间</td>
		<td>点击数量</td>
	</tr>
		
	<c:forEach items="${list }" var="f">
		<tr>
			<td>${f.id }</td>
			<td>${f.title }</td>
			<td>${f.user_id }</td>
			<td>${f.created }</td>
			<td>${f.hits }</td>
		</tr>
		</c:forEach>	
	<tr>
		<td colspan="250">${page} </td>
	</tr>
	</table>

</body>

</html>