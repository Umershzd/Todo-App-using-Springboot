package com.springbootApp.myFirstSpringBootApp;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();
    private static int todoCount=0;
    static {
        todos.add(new Todo(++todoCount,"Umer","Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++todoCount,"Rabia","Learn Java Spring Boot", LocalDate.now().plusYears(3),false));
        todos.add(new Todo(++todoCount,"Arsal","Learn React JS", LocalDate.now().plusYears(2),false));
    }
    public List<Todo> findByUsername(String username)
    {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done)
    {

        Todo todo=new Todo(++todoCount,username, description, targetDate, done);
        todos.add(todo);
    }
    public void deletebyId(int id)
        {
            Predicate <? super Todo> predicate = todo -> todo.getId() == id;
            todos.removeIf(predicate);
        }
}
