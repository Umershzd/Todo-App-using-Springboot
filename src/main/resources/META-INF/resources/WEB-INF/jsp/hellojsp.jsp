<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello World with JSP in Spring Boot</title>
</head>

<body>
    <div>
        <h1>Hello, World!</h1>
        <p>This is a simple example of using JSP with Spring Boot.</p>
        <p>The current time is: <%= new java.util.Date() %></p>
        <p><strong>Message from JSP library:</strong> ${message}</p>
    </div>
</body>

</html>
