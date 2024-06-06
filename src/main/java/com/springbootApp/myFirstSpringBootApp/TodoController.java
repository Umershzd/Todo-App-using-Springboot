package com.springbootApp.myFirstSpringBootApp;
import java.time.LocalDate;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
    public String addNewTodo(ModelMap model, @Valid Todo todo , BindingResult result )
    {
        if (result.hasErrors())
        {
            return "Todo";
        }
            String username = (String) model.get("name");
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
        String username = (String) model.get("name");
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:Todos-List";

    }
}
