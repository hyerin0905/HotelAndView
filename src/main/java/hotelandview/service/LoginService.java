package hotelandview.service;

import hotelandview.dto.LoginDto;
import hotelandview.dto.UserDto;

public interface LoginService {
	public UserDto login(LoginDto loginDto) throws Exception;

	public void insertNewMan(UserDto hotelandviewDto) throws Exception;
	public void insertUser(UserDto hotelandviewDto) throws Exception;

}
 