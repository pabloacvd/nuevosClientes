<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo cliente</title>
    <style>
        body{background-color: burlywood;padding: 25px;}
        input{margin:3px;}
        form{padding:10px;border:1px solid black;width:fit-content;}
    </style>
</head>
<body>
    <h1>Alta de nuevos clientes</h1>
    <p>Complete el siguiente formulario para registrar un nuevo cliente. Los campos marcados con un asterisco <span style="color:red">*</span> son obligatorios.</p>
    <form action="nuevoCliente" method="post">
        <input type="text" required name="nombre" placeholder="Nombre"> <span style="color:red">*</span><br />
        <br />
        <input type="text" required name="cargo" placeholder="Cargo"> <span style="color:red">*</span><br />
        <br />
        <input type="text" required name="empresa" placeholder="Empresa SA"> <span style="color:red">*</span><br />
        <br />
        <input type="phone" name="telefono" placeholder="+54 11 1111 1111"><br />
        <br />
        <button type="submit">Enviar</button>
    </form>
</body>
</html>
