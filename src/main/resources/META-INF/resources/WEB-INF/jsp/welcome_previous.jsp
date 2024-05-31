<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to TODO App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        p {
            margin-bottom: 20px;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
        }

        .btn:hover {
            background-color: #0056b3;
        }

        .tasks {
            margin-bottom: 20px;
        }

        .task-item {
            margin-bottom: 10px;
        }

        .task-item input[type="checkbox"] {
            margin-right: 10px;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Welcome to TODO App</h1>
                <h1>${name} </h1>
        <p>Manage your tasks efficiently with our simple and intuitive TODO App!</p>
        <div><a href="Todos-List">Manage</a>Your Todos</div>

        <div class="tasks">
            <div class="task-item">
                <input type="checkbox" id="task1" name="task1">
                <label for="task1">Task 1</label>
            </div>
            <div class="task-item">
                <input type="checkbox" id="task2" name="task2">
                <label for="task2">Task 2</label>
            </div>
            <div class="task-item">
                <input type="checkbox" id="task3" name="task3">
                <label for="task3">Task 3</label>
            </div>
        </div>

        <a href="/login" class="btn">Login</a>
        <a href="/signup" class="btn">Sign Up</a>
    </div>
</body>

</html>
