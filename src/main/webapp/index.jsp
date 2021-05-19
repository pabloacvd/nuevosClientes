<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Nuevo cliente</title>
        <style>
            input {padding: 3px;}
        </style>
    </head>
    <body style="background-color: #dbc292; padding: 10px;">
        <h1>Acceso a nuestro sitio</h1>
        <br/>
        <form action="hello-servlet" method="post">
            <input type="text" placeholder="Usuario" name="usuario" />
            <br/><br/>
            <input type="password" placeholder="Password" name="password" />
            <br/><br/>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>