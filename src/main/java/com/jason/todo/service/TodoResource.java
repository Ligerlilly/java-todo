package com.jason.todo.service;

import com.codahale.metrics.annotation.Timed;
import com.jason.todo.logic.TodoAPI;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;


/**
 * Created by Lono on 10/18/16.
 */

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {
    private final String todo;
    private final String template;

    public TodoResource() {
        this("","");
    }

    public TodoResource(String template, String todo) {
        this.todo = todo;
        this.template = template;
    }

    @GET
    @Timed
    public Response getTodos() {
        return Response.ok(
                todoAPI.getTodos()
        ).build();
    }

    @POST
    @Timed
    public Response addTodo(@QueryParam("todo") String todo) {
        return Response.ok(
                todoAPI.addTodo(todo)
        ).build();
    }

    // ------------------------------------------------------------------------------------------------------
    // dependencies

    private TodoAPI todoAPI;

    @Inject
    public void setTodoAPI(TodoAPI todoAPI) {
        this.todoAPI = todoAPI;
    }
}
