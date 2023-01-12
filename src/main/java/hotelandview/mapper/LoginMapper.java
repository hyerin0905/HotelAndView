package hotelandview.mapper;

import org.apache.ibatis.annotations.Mapper;

import hotelandview.dto.LoginDto;
import hotelandview.dto.UserDto;

@Mapper
public interface LoginMapper {
	public UserDto login(LoginDto loginDto) throws Exception;
	void insertNewMan(UserDto hotelandviewDto) throws Exception;
}