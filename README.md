ToDoLite: Server Application
============================

Simple ToDo list application using Play! Framework (v2.2.1)

Description
-----------

REST server that saves and gives info to mobile clients.
It is a little program which saves tasks. It also could manage users and tasks per user, and could add tags to each task to clasify them.

Requirements
------------

Server with Play! framework and a Postgresql database.
Rest client using the following headers:
[] Accept: application/json
[] Content-Type: application/json


### USER MANAGEMENT

Create an user:

> POST /usuario
```json
{
	"nombre":"user name"
}
```

Get an user by ID:

> GET /usuario/$id

Get an user by name:

> GET /usuario/nombre

Get users by name:

> GET /usuario/nombre/$page

Get all users:

> GET /usuarios/$page

Update user data:

> PUT /usuario
```json
{
	"nombre":"new name"
}
```

Delete user:

> DELETE /usuario/$id

### ToDo MANAGEMENT

Create new task:

> POST /usuario/$id/tarea
```json
{
	"descripcion":"my task"
}
```

Get a task by ID:

> GET /usuario/$id/tarea/$id_task

Get all tasks:

> GET /usuario/$id/tareas/$page

Update task data:

> PUT /usuario/$id/tarea
```json
{
	"descripcion":"new task name"
}
```

Check as "done":

> PUT /usuario/$id/tarea/$id_task/realizada

Delete a task:

> DELETE /usuario/$id/tarea/$id_task

### TAGS MANAGEMENT

Create a new tag:

> POST /tag
```json
{
	"tag":"my tag"
}
```

Get a tag by ID:

> GET /tag/$id_tag

Get all tags:

> GET /tags/$page

Update a tag:

> PUT /tag
```json
{
	"tag":"new tag name"
}
```

Delete a tag:

> DELETE /tag/$id_tag

### SPECIAL MANAGEMENT

Add tags to a task (first, create tags, then link tag ID to task):

> POST /usuario/$id/tarea/$id_task/tags
```json
{
	"tags": [
		{"tag":$id_tag},
		{"tag":$id_tag}
	]
}
```

Get all tags of a task:

> GET /usuario/$id/tarea/$id_task/tags/$page

Search tasks by tag:

> GET /usuario/$id/tag/$tag_name
