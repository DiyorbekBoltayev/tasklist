package uz.diyorbek.tasklist.web.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import uz.diyorbek.tasklist.web.dto.validation.OnCreate;
import uz.diyorbek.tasklist.web.dto.validation.OnUpdate;

@Data
public class UserDto {

    @NotNull(message = "Id must be not null",groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Name mus be not null",groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name length must be smaller than 255 symbols",groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password must be not null", groups = {OnUpdate.class, OnCreate.class})
    private String password;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull(message = "Password confirmation must be not null", groups = { OnCreate.class})
    private  String passwordConfirmation;
}
