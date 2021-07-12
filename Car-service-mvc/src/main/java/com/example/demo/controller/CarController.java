package com.example.demo.controller;
import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	@Controller
	public class CarController{
		
		@Autowired
		private Car car;
		
		@Autowired
		private CarRepository repo;

		@RequestMapping(value="/cars", method=RequestMethod.GET)
		public String initForm(Model model) {
			
			model.addAttribute("command", car);
			return "addCar";
		}
		
		@RequestMapping(value="/cars", method=RequestMethod.POST)
		public String submitForm(@ModelAttribute("command") Car car, Model model) {
		
			int rowAdded = repo.addCar(car);
			model.addAttribute("rowAdded",rowAdded);
			return "addCar";
		}
		
		@RequestMapping(value="/cars/all", method=RequestMethod.GET)
		public String findAllCars(Model model) {
			
			List<Car> list=repo.getAllCars();
			model.addAttribute("list", list);
			return "viewCar";
		}
		@RequestMapping(value="/cars/any", method=RequestMethod.GET)
		public String findAllBrands(Model model) {
			
			List<Car> list=repo.getBrandName();
			model.addAttribute("list", list);
			return "availableCars";
		}
		
//		@RequestMapping(value="/cars/view", method=RequestMethod.GET)
//		public String findAllNewBrands(Model model) {
//			
//		//	List<Car> list=repo.getCarsByBrand(brand);
//			model.addAttribute("list", list);
//			return "viewbyBrand";
//		}
		@ModelAttribute("groups")
		public String[] carStatus() {
			
			return new String[] {"sold", "unsold","blocked"};
		}
		
	}

