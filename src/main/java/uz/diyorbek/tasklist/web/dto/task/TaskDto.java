package uz.diyorbek.tasklist.web.dto.task;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import uz.diyorbek.tasklist.domain.task.Status;
import uz.diyorbek.tasklist.web.dto.validation.OnCreate;
import uz.diyorbek.tasklist.web.dto.validation.OnUpdate;

import java.time.LocalDate;
@Data
public class TaskDto {
    @NotNull(message = "Id must be not null",groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Title must be not null",groups = {OnCreate.class, OnUpdate.class})
    @Length(max = 255,message = "Title length must be smaller than 255 symbols",groups = {OnUpdate.class,OnCreate.class})
    private String title;

    @Length(max = 255,message = "description length must be smaller than 255 symbols",groups = {OnUpdate.class,OnCreate.class})
    private String description;

    private Status status;

    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDate expirationDate;
}
