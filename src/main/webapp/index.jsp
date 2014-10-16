<%-- 
    Document   : index
    Created on : 13/06/2014, 10:38:09
    Author     : Jean Negrão
--%>

<%@page import="br.leona.station.controller.Servico"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <td> <div align="center" class= "style3">
        <title>JSP TestWebService</title>
    </head>
    <body>        
        <h4>Camera: <%=(String)request.getAttribute("antes")%></h4>
        <h4>Direcao: <%=(String)request.getAttribute("direcao")%></h4>
        <h4>Total Services: ${listService.size()}</h4>           
        <table border="1" style="width:500px" align="center">
        <div align="center" class="style3">
        <%              
            List<Servico> services = (ArrayList)request.getAttribute("listService");  
            if(!services.isEmpty())
            for(Integer index = 0; index < services.size(); index++)
            {  
        %>      
                <td><h4 align="right" valign="middle"> 
                    Service Number <%=index+1%></h4></td>
                <tr align="left" valign="middle">
                <td><h5 align="left" valign="middle"> Nome </td>
                <td><h5 align="left" valign="middle"> Status </td>            
                </tr>
                <tr align="center" valign="middle">
                <td><%=services.get(index).getNome() %></td>
                </h5>
                <td><%=services.get(index).getStatus() %></td>           
                </h5>
                </tr>
        <%
            }
        %>
        <h4>Camera: <%=(String)request.getAttribute("depois")%></h4>
        </table>        
    </body>
</html>

