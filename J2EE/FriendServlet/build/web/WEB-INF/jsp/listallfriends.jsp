<%-- 
    Document   : listallfriends
    Created on : 03/02/2017, 12:11:45
    Author     : alumne
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="mvcpractica.model.Friend"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Friend list</title>
        <style type="text/css">
            table td {
                border: solid thin blue;
            }
        </style>
    </head>
    <body>
        <h1>List of friends</h1>
        <%
            List<Friend> data = ( List<Friend>) request.getAttribute("friends");
            //out.println(data.toString());
            out.println("<ul>");
            for (Friend f: data) {
                out.println(String.format("<li>%s</li>", f.toString()));
            }
            out.println("</ul>");
        %>
    </body>
</html>