package SKS.SKS.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {
	
	
	private long id;
	private String userName;
	private String lastName;
	private String email;
	private String password;

}
