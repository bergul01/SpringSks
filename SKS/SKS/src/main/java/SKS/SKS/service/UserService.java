package SKS.SKS.service;

import java.util.List;

import SKS.SKS.dto.UserDto;

public interface UserService {
	
	UserDto getUserById(Long userId); 
	
	List<UserDto> getAllUser();
	
	UserDto updateUser(Long userId, UserDto updateUser); 
	
	void deleteUser(Long userId); 
	
	UserDto createUser(UserDto userDto);
	
	

}
