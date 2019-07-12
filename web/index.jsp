<%--
  Created by IntelliJ IDEA.
  User: cy
  Date: 2019/6/4
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <%if ((session.getAttribute("message")!=null)){%>

  <%=session.getAttribute("message")%>

  <%}%>
  </body>
</html>
