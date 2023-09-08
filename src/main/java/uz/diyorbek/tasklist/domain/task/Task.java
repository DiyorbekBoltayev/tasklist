package uz.diyorbek.tasklist.domain.task;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Task {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDate expirationDate;


}
