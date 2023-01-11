package hotelandview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hotelandview.mapper.HotelAndViewMapper;

@Service
public class HotelAndViewServiceImpl implements HotelAndViewService {
	
	@Autowired
	private HotelAndViewMapper hotelandviewMapper;
	
}
