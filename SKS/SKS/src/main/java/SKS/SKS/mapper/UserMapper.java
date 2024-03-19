package SKS.SKS.mapper;

import SKS.SKS.dto.UserDto;
import SKS.SKS.entities.User;

public class UserMapper {
	
	public static UserDto mapToUserDto(User user) {
		
		return new UserDto(
				user.getId(),
				user.getUserName(),
				user.getLastName(),
				user.getEmail(),
				user.getPassword()
				);
	}
	
	public static User mapToUser(UserDto userDto) {
		
		return new User(
				userDto.getId(),
				userDto.getUserName(),
				userDto.getLastName(),
				userDto.getEmail(),
				userDto.getPassword()
				);
	}

}
