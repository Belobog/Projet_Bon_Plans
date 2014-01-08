<!DOCTYPE html >
<html >
    <head>
        <title>Hello World!</title>
    </head>
    <body>
        <h1>Hello world!</h1>
        <form th:action="@{/logout}" method="post">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div><input type="submit" value="Sign Out"/></div>
        </form>
    </body>
</html>