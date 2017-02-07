package com.jason.todo.logic.impl;

import java.util.*;
import com.jason.todo.logic.TodoDAO;

/**
 * Created by Lono on 10/27/16.
 */
public class TodoDAOImpl implements TodoDAO {
    String[] todos = {"a","b","c"};

    public String[] getTodos() {
        return this.todos;
    }
}
