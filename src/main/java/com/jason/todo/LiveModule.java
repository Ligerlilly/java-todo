package com.jason.todo;

import com.google.inject.AbstractModule;
import com.jason.todo.logic.TodoAPI;
import com.jason.todo.logic.TodoDAO;
import com.jason.todo.logic.impl.TodoAPIImpl;
import com.jason.todo.logic.impl.TodoDAOImpl;

/**
 * Created by Lono on 2/7/17.
 */
public class LiveModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(TodoAPI.class).to(TodoAPIImpl.class);
        bind(TodoDAO.class).to(TodoDAOImpl.class);
    }
}
