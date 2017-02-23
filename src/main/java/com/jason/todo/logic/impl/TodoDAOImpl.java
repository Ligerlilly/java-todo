package com.jason.todo.logic.impl;

import java.util.*;
import com.jason.todo.logic.TodoDAO;

/**
 * Created by Lono on 10/27/16.
 */
public class TodoDAOImpl implements TodoDAO {
    List<String> todos = new LinkedList (Arrays.asList("a", "b", "c"));


    public List<String> getTodos() {
        return this.todos;
    }

    public List<String> addTodo(String todo) {
        this.todos.add(todo);
        return this.todos;
    }
}
