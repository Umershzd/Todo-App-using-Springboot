package com.springbootApp.myFirstSpringBootApp;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @RequestMapping("Todos-List")
public String listAllTodos(ModelMap model)
{
List<Todo> todos =todoService.findByUsername("Umer");
model.addAttribute("todos",todos);
    return "ListTodos";
}
    @RequestMapping(value="add-todo",method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model)
    {
        String username = (String) model.get("name");
Todo todo=new Todo(0,username,"default desc",LocalDate.now().plusYears(1),false);
model.put("todo",todo);
return "Todo";
    }
    @RequestMapping(value="add-todo",method = RequestMethod.POST)
    public String addNewTodo(ModelMap model,Todo todo )
    {
            String username = (String) model.get("name");
            todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
            return "redirect:Todos-List";

    }
}
