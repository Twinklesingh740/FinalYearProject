<%-- 
    Document   : ColumnStep2
    Created on : Dec 18, 2016, 10:43:31 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <h2>
        Heads Details
        </h2>
        
        <hr>
        <h2>
Step-2
        </h2>
        <form action="/onlinechart/ColumnChart" method="post">
        <table >
            
        <%
            int heads=Integer.valueOf(request.getParameter("heads"));
        for(int i=0;i<heads;i++)
        {
            out.println("<tr><td> Head" + (i+1) + " Title</td> <td><input type='text' name='headtitle'></td>" );
            out.println("<td> Head" + (i+1) + " Value</td> <td><input type='text' name='headvalue'></td></tr>" );
            
        }
            
            %>
            <tr>
               
            </tr>
            </table>
            <input type="submit" value="Generate Chart Image"/>
            
        </form>
    </body>
</html>
