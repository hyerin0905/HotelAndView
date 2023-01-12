package hotelandview.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hotelandview.dto.LoginDto;
import hotelandview.dto.UserDto;
import hotelandview.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	//회원가입 페이지에 대한 요청을 처리
		@RequestMapping("/newUser")
		public String newUser() throws Exception{
			return "newUser.html";
		}
		
		//회원정보저장 처리에 대한 요청을 처리
		@RequestMapping("/insertUser")
		public String insertUser(UserDto hotelandviewDto) throws Exception {
			loginService.insertUser(hotelandviewDto);
			return "redirect:/mainHotelAndView";
		}
	
	@GetMapping("/login.do")
	public String login(HttpSession session) throws Exception {
		if (session.getAttribute("user") == null) {
			return "login.html";
		} else {
			return "redirect:/mainHotelAndView";
		}
	}
	
	@PostMapping("/login.do")
	public String login(LoginDto loginDto, HttpSession session) throws Exception {
		UserDto userDto = loginService.login(loginDto);
		if (userDto == null) {
			session.setAttribute("message", "일치하는 정보가 존재하지 않습니다.");
			return "redirect:/login.do";
		} else {
			session.setAttribute("user", userDto);
			return "redirect:/mainHotelAndView";
		}
	}
	
	@GetMapping("/logout.do")
	public String logout(HttpSession session) throws Exception {
		session.removeAttribute("user");
		session.invalidate();
		return "redirect:/mainHotelAndView";
	}
}