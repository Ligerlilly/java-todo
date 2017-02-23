package com.jason.todo.logic.impl;

import javax.inject.Singleton;
import java.util.List;
import com.jason.todo.logic.*;
import javax.inject.Inject;
import com.jason.todo.logic.TodoAPI;

/**
 * Created by Lono on 10/27/16.
 */

@Singleton
public class TodoAPIImpl implements TodoAPI {
    public List<String> getTodos() {
        List<String> todos = todoDAO.getTodos();
        return todos;
    }

    public List<String> addTodo(String todo) {
        List<String> todos = todoDAO.addTodo(todo);
        return todos;
    }

    // ------------------------------------------------------------------------------------------------------
    // dependencies

    private TodoDAO todoDAO;

    @Inject
    public void setTodoDAO( TodoDAO todoDAO ) {
        this.todoDAO = todoDAO;
    }


}
