package com.springbootApp.myFirstSpringBootApp;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {
    private TodoService todoService;
private TodoRepository todoRepository;
    public TodoControllerJpa(TodoService todoService, TodoRepository todoRepository) {
        super();
        this.todoService = todoService;
        this.todoRepository=todoRepository;
    }
    @RequestMapping("Todos-List")
public String listAllTodos(ModelMap model)
{
    String username = getName(model);
    List<Todo> todos =todoRepository.findAllByUsername(username);
model.addAttribute("todos",todos);
    return "ListTodos";
}

    private static String getName(ModelMap model) {
        return (String) model.get("name");
    }

    @RequestMapping(value="add-todo",method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model)
    {
        String username = getLoggedinUsername(model);
Todo todo=new Todo(0,username,"default desc",LocalDate.now().plusYears(1),false);
model.put("todo",todo);
return "Todo";
    }
    @RequestMapping(value="add-todo",method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo , BindingResult result )
    {
        if (result.hasErrors())
        {
            return "Todo";
        }
            String username = getLoggedinUsername(model);
            todoService.addTodo(username, todo.getDescription(), todo.getTargetdate(), false);
            return "redirect:Todos-List";

    }
    @RequestMapping("delete-todo")
    public String DeleteTodo(@RequestParam int id)
    {
        // todo delete logic
        todoService.deletebyId(id);
        return "redirect:Todos-List";
    }
    @RequestMapping(value="update-todo",method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id,ModelMap model)
    {
        Todo todo = todoService.findById(id);
model.addAttribute("todo",todo);
        return "Todo";
    }
    @RequestMapping(value="update-todo",method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo , BindingResult result )
    {
        if (result.hasErrors())
        {
            return "Todo";
        }
        String username = getLoggedinUsername(model);
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:Todos-List";

    }
    private String getLoggedinUsername(ModelMap model)
    {
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
