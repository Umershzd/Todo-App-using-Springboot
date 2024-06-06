<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">

<head>
<link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List of Todos</title>
</head>

<body>
    <div class="container">
        <h1>Here is the List of todos!</h1>

    <table class="table">
    				<thead>
    					<tr>
    						<th>Description</th>
    						<th>Target Date</th>
    						<th>Is Done?</th>
    						<th></th>
    						<th></th>
    					</tr>
    				</thead>
    				<tbody>
    					<c:forEach items="${todos}" var="todo">
    						<tr>
    							<td>${todo.description}</td>
    							<td>${todo.targetdate}</td>
    							<td>${todo.done}</td>
    							<td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete</a>   </td>
    								<td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a>   </td>
    						</tr>
    					</c:forEach>
    				</tbody>
    			</table>
    			<a href="add-todo" class="btn btn-success">Add Todo</a>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>
