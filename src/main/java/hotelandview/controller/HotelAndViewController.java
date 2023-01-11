package hotelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelAndViewController {
		
	@RequestMapping("/mainHotelAndView")
	public ModelAndView mainHotleAndView() throws Exception {
		ModelAndView mv = new ModelAndView("/mainHotelAndView");
		
		return mv;
	}


}
