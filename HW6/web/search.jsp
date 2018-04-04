<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="countryStyle.css">
        <title>Search Countries</title>
    </head>
    <body>
         <div class="wrap">
           <div class = "headerImg">
			<img src="includes/country.jfif" height="150px" />
		</div>
        <%@ include file="includes/header.jsp" %>   
        <br><br>    
        <%@ include file="includes/menu.jsp" %>
        
        <div class="main">
        <h1>Search Countries</h1>
         <hr>
        <form name="searchForm" action="search" method="ge">
        <input type="text" name="searchVal" value=""/>
        <br>
        <input type="submit" name="submit" value="Search"/>
        </form>
        </div>
        <%@ include file="includes/footer.jsp" %>
         </div>
    </body>
</html>
