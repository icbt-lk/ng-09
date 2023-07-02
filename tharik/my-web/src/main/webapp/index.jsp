<%-- 
    Document   : index
    Created on : 11-Jun-2023, 16:37:51
    Author     : icbt
--%>

 

<%@page import="icbt.Utils"%>
<%@page import="icbt.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.css" />
        <script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
        <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.js"></script>
        
        <script src="https://cdn.datatables.net/1.13.4/js/dataTables.bootstrap5.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css" />
        <link rel="stylesheet" href="https://cdn.datatables.net/1.13.4/css/dataTables.bootstrap5.min.css" />
    </head>
    <body>
        <%   
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          boolean isAuthenticated = false;
          
          if (username != null && password != null) {
            if (username.equals("admin") && password.equals("admin123")) {
              isAuthenticated =true;
              
              String sessionId = "123";
              
              Cookie cookie = new Cookie("session-id", sessionId);
              response.addCookie(cookie);
              
              session.setAttribute(sessionId, username);
            }
          } else {
            
            for (Cookie cookie : request.getCookies()) {
                if (cookie.getName().equals("session-id")) {
                   String name = (String)session.getAttribute(cookie.getValue());
                   if (name != null) {
                    isAuthenticated =true;
                    }
                }
            }
          
          }
    
          if (!isAuthenticated) {
           response.sendRedirect("login.jsp");
          }
            
        out.print("<table id='tblStudents'>");
        out.print("<thead><tr><th>Batch</th><th>Student No</th><th>First Name</th><th>Last Name</th></tr></thead><tbody>");
        for (Student st : Utils.getStudents()) {
            out.print("<tr>");
            out.print("<td>" + st.getBatch()+ "</td>");
            out.print("<td>" + st.getNo()+ "</td>");
            out.print("<td>" + st.getFirstName() + "</td>");
            out.print("<td>" + st.getLastName()+ "</td>");
            out.print("</tr>");
        }
        out.print("</tbody></table>");
        
        %>
        
        <script>
            $(document).ready( function () {
                $('#tblStudents').DataTable();
            } );
        </script>
     
    </body>
</html>
