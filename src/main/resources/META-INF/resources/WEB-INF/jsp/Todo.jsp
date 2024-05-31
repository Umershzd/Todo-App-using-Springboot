<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
<link href="webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Todos Details</title>
</head>

<body>
    <div class="container">
<h1>Enter Todo Details</h1>
			<form:form method="post" modelAttribute="todo">
				Description: <form:input type="text" name="description" required="required" path="description"/>
				<form:input type="hidden" path="id"/>
                				<form:input type="hidden" path="done"/>
				<input type="submit" class="btn btn-success"/>

			</form:form>
</div>
<script src="webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>

</html>
