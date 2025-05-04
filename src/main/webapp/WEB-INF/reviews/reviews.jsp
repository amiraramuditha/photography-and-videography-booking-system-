<%@ page import = "java.util.List" %>
<%@ page import = "io.github.naveenb2004.fixes.reviews.Review" %>
<%@ page contentType = "text/html;charset=UTF-8" language = "java" %>
<html>
    <head>
        <title>Hello JSP</title>
    </head>
    <body>
        <h1>Hello from JSP!</h1>
        <%
            List<Review> reviews = (List<Review>) request.getAttribute("reviews");
            for (Review r : reviews) {
                out.println(r.toString());
            }
        %>
    </body>
</html>
