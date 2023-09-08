package uz.diyorbek.tasklist.web.mappers;

import org.mapstruct.Mapper;
import uz.diyorbek.tasklist.domain.user.User;
import uz.diyorbek.tasklist.web.dto.user.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
