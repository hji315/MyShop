<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>

   <!-- Custom styles for this template -->
   <link href="https://fonts.googleapis.com/css?family=Playfair&#43;Display:700,900&amp;display=swap" rel="stylesheet">
   <!-- Custom styles for this template -->
   <link href="${pageContext.request.contextPath}/resources/css/blog.css" rel="stylesheet">

<style>
.admin_navi_wrap{
    width: 20%;
    height: 300px;
    float:left;
    height: 100%;
}

</style>
</head>

<body>
	
	<header class="auto" style="width:500px; margin: 10px">
		<div>
        <a class="blog-header-logo text-dark" 
        href="${path}/" >
        #SHOP Admin page</a>
      	</div>
    </header>
    
            <!-- contents-area -->
            <div class="admin_wrap" style="text-align: center; margin-left: 10px">
                <!-- 네비영역 -->
                
                    <ul class="nav">
                        <li class="nav-item">
                            <a class="list-group-item" href="${path}/admin/memberList">회원 목록 조회</a>
                        </li>
                        <li class="nav-item">
                            <a class="list-group-item" href="#">추가 예정</a>
                        </li>
                        <li class="nav-item">
                            <a class="list-group-item"  href="#">추가 예정</a>                            
                        </li>
                    </ul>
              </div>

</body>
</html>