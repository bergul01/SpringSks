package SKS.SKS.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import SKS.SKS.dto.UserDto;
import SKS.SKS.entities.User;
import SKS.SKS.exception.ResourceNotFoundException;
import SKS.SKS.mapper.UserMapper;
import SKS.SKS.repository.UserRepository;
import SKS.SKS.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	@Override
	public UserDto getUserById(Long userId) {
		
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip kullanıcı mevcut değil"+ userId));
		
		return UserMapper.mapToUserDto(user);
	}

	@Override
	public List<UserDto> getAllUser() {
		
		List<User> users = userRepository.findAll();
		
		return users.stream().map((user) -> UserMapper.mapToUserDto(user)).collect(Collectors.toList());
	}

	@Override
	public UserDto updateUser(Long userId, UserDto updateUser) {
	
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip kullanıcı mevcut değil" + userId));
		
		user.setUserName(updateUser.getUserName());
		user.setLastName(updateUser.getLastName());
		user.setEmail(updateUser.getEmail());
		user.setPassword(updateUser.getPassword());
		
		User newUserUpdate = userRepository.save(user);
		
		return UserMapper.mapToUserDto(newUserUpdate);
	}

	@Override
	public void deleteUser(Long userId) {
		
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip kullanıcı mevcut değil" + userId));
		
		userRepository.deleteById(userId);
		
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		
		User user = UserMapper.mapToUser(userDto);
		
		User savedUser = userRepository.save(user);
		
		return UserMapper.mapToUserDto(savedUser);
	}
	
	
	
	

}
