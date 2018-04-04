<%-- 
    Document   : add
    Created on : Mar 23, 2018, 3:30:28 PM
    Author     : kzhou8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="countryStyle.css">
        <title>Add A New Country</title>
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
        <h1>Add A New Country</h1>
        <hr>
        <form name="addForm" action="addCountry" method="get"> 
            <label>Country Name:</label><br>
            <input type="text" name="name" value="" />
            <br>
            <label>Population:</label><br>
            <input type="text" name="population" value=""/>
            <br>
            <label>Region:</label><br>
            <input type="text" name="region" value=""/>
            <br>
            <label>Language:</label><br>
            <input type="text" name="language" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit"/>
        </form>
        </div>
            <%@ include file="includes/footer.jsp" %>
      </div>
    </body>
</html>
