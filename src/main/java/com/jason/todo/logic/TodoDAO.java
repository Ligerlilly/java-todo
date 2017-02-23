package com.jason.todo.logic;

import java.util.List;

/**
 * Created by Lono on 10/27/16.
 */
public interface TodoDAO {
    public List<String> getTodos();
    public List<String> addTodo(String todo);
}