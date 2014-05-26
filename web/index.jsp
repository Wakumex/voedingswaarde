<%-- 
    Document   : index
    Created on : 26-mei-2014, 20:28:28
    Author     : kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "voeding.*" %>
<!DOCTYPE html>
<%
    Namen namen;
    
    namen = new Namen();
    
    namen.voegToe();
    
    int i = 0;
            
            if(request.getParameter("submit") != null )
            {
                i = Integer.parseInt(request.getParameter("pizza"));
            }
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="index.css" rel="stylesheet" type="type/css" media="screen">
        <title>Voedingswaarde</title>
    </head>
    <body>

        <div id="wrapper">
              <div class="eigenschappen">
                  
            <form action="#" method="get">
            <select name = "pizza">
            <option value ="0" selected disabled="">Selecteer product</option>
            <option value="0">Ei</option>
            <option value="1">Brood</option>
            <option value="2">Slappy ho burger</option>
            </select>              
            <input type="submit" name="submit" value="verzend"><br>


            <%             if(request.getParameter("submit") != null ) { %>
            <%= namen.getResult(i) %>
            <%= namen.genereerPagina() %>
            
            <% } %>

            </form>
        </div>
        </div>
            
    </body>
</html>
