
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="countryStyle.css">
        <title>Countries</title>
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
                <h1> My Countries Database</h1>
                 <hr>
                "This is Kailin Zhou's collections of countries"                    
            </div>
            <%@ include file="includes/footer.jsp" %>
        </div>
    </body>
</html>
