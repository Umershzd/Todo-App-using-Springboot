<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <div class="container">

        <h2>Login </h2>
            <pre>${errormessage}</pre>

        <form  method="POST">
            <label for="username">Username:</label>
            <input type="text" name="name" required>

            <label for="password">Password:</label>
            <input type="password" name="password" required>

            <button type="submit">Login</button>
        </form>
    </div>
</body>

</html>
