<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html >
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <h1>Hello world!</h1>
        <form action="Deconnexion" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div><input type="submit" value="Sign Out"/></div>
        </form>
    </body>
</html>