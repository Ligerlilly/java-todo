package com.jason.todo.logic;

import java.util.List;

/**
 * Created by Lono on 10/27/16.
 */
public interface TodoAPI {
    public List<String> getTodos();
    public List<String> addTodo(String todo);
    public List<String> updateTodo(int index, String todo);
    public List<String> deleteTodo(int index);
}
