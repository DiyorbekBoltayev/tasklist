package uz.diyorbek.tasklist.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import uz.diyorbek.tasklist.domain.task.Task;
import uz.diyorbek.tasklist.domain.user.User;
import uz.diyorbek.tasklist.service.TaskService;
import uz.diyorbek.tasklist.service.UserService;
import uz.diyorbek.tasklist.web.dto.task.TaskDto;
import uz.diyorbek.tasklist.web.dto.user.UserDto;
import uz.diyorbek.tasklist.web.dto.validation.OnCreate;
import uz.diyorbek.tasklist.web.dto.validation.OnUpdate;
import uz.diyorbek.tasklist.web.mappers.TaskMapper;
import uz.diyorbek.tasklist.web.mappers.UserMapper;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/users")
@Validated
public class UserController {
    private final UserService userService;
    private final TaskService taskService;
    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public UserDto update(@Validated(OnUpdate.class) @RequestBody UserDto dto){
        User user=userMapper.toEntity(dto);
        User updatedUser=userService.update(user);
        return  userMapper.toDto(updatedUser);
    }

    @GetMapping("/{id}")
    public  UserDto getById(@PathVariable Long id){
        User user=userService.getById(id);
        return userMapper.toDto(user);
    }

    @DeleteMapping("/{id}")
    public void  deleteById(@PathVariable Long id){
        userService.delete(id);
    }

    @GetMapping("/{id}/tasks")
    public List<TaskDto> getTasksBYUser(@PathVariable Long id){
    List<Task> tasks=taskService.getAllByUser(id);
    return taskMapper.toDto(tasks);
    }

    @PostMapping("/{id}/tasks")
    public  TaskDto createTask(@PathVariable Long id,
                               @Validated(OnCreate.class) @RequestBody TaskDto dto){
        Task task= taskMapper.toEntity(dto);
        Task createdTask= taskService.create(task,id);
        return taskMapper.toDto(createdTask);

    }
}
