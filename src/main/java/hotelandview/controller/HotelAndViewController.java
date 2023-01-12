package hotelandview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import hotelandview.dto.LoginDto;
import hotelandview.dto.UserDto;
import hotelandview.service.HotelAndViewService;

@Controller
public class HotelAndViewController {
	@Autowired
	private HotelAndViewService hotelandviewService;

	@GetMapping("/mainHotelAndView")
	public String mainHotelAndView() throws Exception {
		return "Home.html";
	}
	
	@GetMapping("/room")
	public String room() throws Exception {
		return "room.html";
	}
	
	@GetMapping("/reservation")
	public String reservation() throws Exception {
		return "reservation.html";
	}
	
	@GetMapping("/Qna")
	public String Qna() throws Exception{
		return "Qna.html";
	}

}
