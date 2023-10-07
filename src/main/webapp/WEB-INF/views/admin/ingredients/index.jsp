<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<div class="panel panel-default">
<div class="panel-body">
	${message}
	<form:form action="/admin/ingredients/index" modelAttribute="model">
		
		<div class="form-group">
			<label>Id</label>
			<form:input path="id" cssClass="form-control" readonly="true"/>
		</div>
		<div class="form-group">
			<label>Name</label>
			<form:input path="name" cssClass="form-control"/>
		</div>
		<div class="form-group">
			<button class="btn btn-default" formaction="/admin/ingredients/insert">Insert</button>
			<button class="btn btn-default" formaction="/admin/ingredients/update">Update</button>
			<button class="btn btn-default" formaction="/admin/ingredients/delete">Delete</button>
			<button class="btn btn-default" formaction="/admin/ingredients/index">Reset</button>
		</div>
		
		
	</form:form>
	</div>
	
	<table class="table table-hover">
	<thead>
		<tr>
			<th>Id</th>
			<th>Names</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="e" items="${list}">
		<tr>
			<td>${e.id}</td>
			<td>${e.name}</td>

			<a class="btn btn-sm btn-warning" href="/admin/ingredients/edit/${e.id}">Edit</a>
			<a class="btn btn-sm btn-danger" href="/admin/ingredients/delete/${e.id}">Delete</a>
			</td>		
		</tr>
		</c:forEach>
	</tbody>
	</table>
	
</div>