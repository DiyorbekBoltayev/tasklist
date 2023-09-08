package uz.diyorbek.tasklist.service;

import uz.diyorbek.tasklist.domain.task.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUser(Long id);
    Task update(Task task);
    Task create(Task task);

    void delete(Long id);


}
