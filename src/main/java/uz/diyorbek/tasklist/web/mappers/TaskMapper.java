package uz.diyorbek.tasklist.web.mappers;

import org.mapstruct.Mapper;
import uz.diyorbek.tasklist.domain.task.Task;
import uz.diyorbek.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
   TaskDto toDto(Task task);

   List<TaskDto> toDto(List<Task> tasks);

   Task toEntity(TaskDto taskDto);

   List<Task> toEntity(List<TaskDto> taskDtoList);
}
