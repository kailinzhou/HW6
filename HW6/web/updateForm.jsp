
<%@page import="model.Countries"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Countries country = (Countries) request.getAttribute("country") ;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type="text/css" href="./Css/countryStyle.css">
        <title>Update a Country</title>
    </head>
    <body>
          <div class="database"style="text-aligh:center">
        <h1>Update A New Country</h1>
        <hr>
        <form name="updateForm" action="updateCountry" method="get"> 
                    <table class="update">
                      <tr>
                        <td>Country ID: </td>
                        <td><input type="text" name="ID" value="<%= country.getCountryID()%>" /></td>                        
                    </tr>
                    <tr>
                        <td>Country Name: </td>
                        <td><input type="text" name="name" value="<%= country.getCountryName()%>" /></td>                        
                    </tr>
                    
                    <tr>
                        <td>Population: </td>
                        <td><input type="text" name="population" value="<%= country.getPopulation()%>" /></td>                        
                    </tr>
                    
                    <tr>
                        <td>Region: </td>
                        <td><input type="text" name="region" value="<%= country.getRegion()%>" /></td>                        
                    </tr>
                    
                    <tr>
                        <td>Language: </td>
                        <td><input type="text" name="language" value="<%= country.getCountryLanguage()%>" /></td>                        
                    </tr>

                </table>
                    <input type="reset" name="reset" value="Clear" />
            <input type="submit" name="submit" value="Update" />
        </form>
      <a href="read">Return</a>
    </body>
</html>
