package hotelandview.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelandview.dto.LoginDto;
import hotelandview.dto.UserDto;
import hotelandview.mapper.HotelAndViewMapper;
import hotelandview.mapper.LoginMapper;

@Service 
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginMapper loginMapper;
	
	@Override
	public UserDto login(LoginDto loginDto) throws Exception {
		return loginMapper.login(loginDto);
	}

	@Override
	public void insertNewMan(UserDto hotelandviewDto) throws Exception {
		loginMapper.insertNewMan(hotelandviewDto);
		
	}

	@Override
	public void insertUser(UserDto hotelandviewDto) throws Exception {
		loginMapper.insertNewMan(hotelandviewDto);
		
	}
}