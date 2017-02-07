package com.jason.todo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.eclipse.jetty.servlets.CrossOriginFilter;
import javax.servlet.FilterRegistration;
import com.jason.todo.service.TodoResource;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import com.hubspot.dropwizard.guice.GuiceBundle;

/**
 * Created by Lono on 10/18/16.
 */
public class TodoApplication extends Application<TodoConfiguration> {
    private GuiceBundle<TodoConfiguration> guiceBundle;

    public static void main(String[] args) throws Exception {
        new TodoApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public  void initialize(Bootstrap<TodoConfiguration> bootstrap) {
        guiceBundle = GuiceBundle.<TodoConfiguration>newBuilder()
                .addModule(new LiveModule())
                .setConfigClass(TodoConfiguration.class)
                .build();

        bootstrap.addBundle(guiceBundle);
    }

    @Override
    public void run(TodoConfiguration configuration, Environment environment) {
        environment.jersey().register(TodoResource.class);
    }
}
