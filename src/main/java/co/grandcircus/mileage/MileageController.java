package co.grandcircus.mileage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/mileage-form")
	public ModelAndView showMileageForm() {
		return new ModelAndView("mileage-form");
	}
	
	@RequestMapping("/mileage-result")
	public ModelAndView showMileageResult(
			@RequestParam("mpg") String mpg,
			@RequestParam("gallons") String gallons
			) {
		double mileage = Double.parseDouble(mpg)*Double.parseDouble(gallons);
		ModelAndView mv = new ModelAndView("mileage-result");
		mv.addObject("mileage", mileage);
		return mv;
	}
	
	@RequestMapping("/add-form")
	public ModelAndView showAddForm() {
		return new ModelAndView("add-form");
	}
	
	@RequestMapping("/add-result")
	public ModelAndView showAddResult(
			@RequestParam("num1") String num1,
			@RequestParam("num2") String num2
			) {
		double result = Double.parseDouble(num1)+Double.parseDouble(num2);
		ModelAndView mv = new ModelAndView("add-result");
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping("/divide-form")
	public ModelAndView showDivideForm() {
		return new ModelAndView("divide-form");
	}
	
	@RequestMapping("/divide-result")
	public ModelAndView showDivideResult(
			@RequestParam("num1") String num1,
			@RequestParam("num2") String num2
			) {
		int result = Integer.parseInt(num1)/Integer.parseInt(num2);
		int modulus = Integer.parseInt(num1)%Integer.parseInt(num2);
		ModelAndView mv = new ModelAndView("divide-result");
		mv.addObject("result", result);
		mv.addObject("modulus", modulus);
		return mv;
	}
	
	@RequestMapping("/repeat-form")
	public ModelAndView showRepeatForm() {
		return new ModelAndView("repeat-form");
	}
	
	@RequestMapping("/repeat-result")
	public ModelAndView showRepeatResult(
			@RequestParam("word") String word,
			@RequestParam("times") String times
			) {
		String result = "";
		for(int i = 0; i < Integer.parseInt(times); i++) {
			result += word;
		}
		ModelAndView mv = new ModelAndView("repeat-result");
		mv.addObject("result", result);
		return mv;
	}
}
