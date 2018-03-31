
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./Css/countryStyle.css">
        <title>Country Database</title>
    </head>
    <% String table=(String) request.getAttribute("table");%>
    <body>
       <div class="database"style="text-aligh:center">
        <h1>My Country Database</h1>
         <hr>
        <table id="header">
            <tr>
                <th>Country ID</th>

                <th>Name</th>

                <th>Population</th>

                <th>Region</th>

                <th>Language</th>
                <th> Delete</th>
            </tr>
        </table>
        <table id="data">  
        <%=table %>
        </table>
        <br><br>
        <div class="add">
        <a href="add">Add A New Country</a>
        </div>
       </div>
        </body>   
</html>
