package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Product;

@Controller
public class MainController 
{
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", new Product());
		mav.setViewName("producto");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) 
		{
			mav.setViewName("producto");
		}
		else 
		{
			mav.addObject("productName", product.getName());
			mav.setViewName("validacion");
		}
		
		return mav;
		
	}
	

}
