package uz.diyorbek.tasklist.service.impl;

import org.springframework.stereotype.Service;
import uz.diyorbek.tasklist.domain.task.Task;
import uz.diyorbek.tasklist.service.TaskService;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUser(Long id) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task create(Task task) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
