package SKS.SKS.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SKS.SKS.dto.UserDto;
import SKS.SKS.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUser(){
		
		List<UserDto> user = userService.getAllUser();
		
		return ResponseEntity.ok(user);
	}
	
	
	
	@GetMapping("{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
		
		UserDto userDto = userService.getUserById(userId);
		
		return ResponseEntity.ok(userDto);	
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId,@RequestBody UserDto updateUser){
		
		UserDto userDto = userService.updateUser(userId, updateUser);
		
		return ResponseEntity.ok(userDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
		
		userService.deleteUser(userId);
		
		return ResponseEntity.ok("Kullanıcı silme işlemi başarılı");
	}
	
	@PostMapping()
	public ResponseEntity<UserDto>  createUser(@RequestBody UserDto userDto){
		
		UserDto savedUser = userService.createUser(userDto);
		
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	
	
	
	
	
	

}
