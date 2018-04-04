
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="countryStyle.css">
        <title>Country Database</title>
    </head>
    <% String table=(String) request.getAttribute("table");%>
    <body>
       <div class="wrap">
           <div class = "headerImg">
			<img src="includes/country.jfif" height="150px" />
		</div>
        <%@ include file="includes/header.jsp" %>   
        <br><br>    
        <%@ include file="includes/menu.jsp" %>
        
        <div class="main">
        <h1>My Country Database</h1>
         <hr>
        <table id="header">
            <tr>
                <th>Country ID</th>

                <th>Name</th>

                <th>Population</th>

                <th>Region</th>

                <th>Language</th>
                <th> Update</th>
                <th> Delete</th>
            </tr>
        </table>
        <table id="data">  
        <%=table %>
        </table>
        <br><br>
        </div>
            <%@ include file="includes/footer.jsp" %>
       </div>

     
        </body>   
</html>
