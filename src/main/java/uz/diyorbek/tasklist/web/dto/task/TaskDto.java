package uz.diyorbek.tasklist.web.dto.task;

import lombok.Data;
import uz.diyorbek.tasklist.domain.task.Status;

import java.time.LocalDate;
@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDate expirationDate;
}
