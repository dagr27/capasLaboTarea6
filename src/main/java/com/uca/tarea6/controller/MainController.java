package com.uca.tarea6.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.tarea6.domain.contribuyente;
import com.uca.tarea6.domain.importancia;
import com.uca.tarea6.service.contribuyenteService;
import com.uca.tarea6.service.importanciaService;

@Controller
public class MainController {
	@Autowired
	private importanciaService importanciaS;
	
	@Autowired
	private contribuyenteService contribuyenteS;

	private List<importancia> importanciaAll = null;
	private List<contribuyente> contribuyenteAll = null;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		contribuyente contribuyente = new contribuyente();
		
		try {
			importanciaAll = importanciaS.findAll() ;
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		mav.addObject("importancias", importanciaAll);
		mav.addObject("contribuyente", contribuyente);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@Valid @ModelAttribute contribuyente contribuyente, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			try {
				importanciaAll = importanciaS.findAll() ;
			} catch(Exception e) {
				e.printStackTrace();
			}
			mav.addObject("importancias",importanciaAll);
			mav.setViewName("index");
		} else {
			Date dateToday = new Date();
			contribuyente.setF_fecha_ingreso(dateToday);;
			contribuyenteS.save(contribuyente);;
			mav.setViewName("success");
		}
		
		return mav;
	}
	
	@RequestMapping("/listado")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		try {
			contribuyenteAll = contribuyenteS.findAll();
		} catch(Exception e) {
			e.printStackTrace();
		}
		mav.addObject("contribuyentes", contribuyenteAll);
		mav.setViewName("lista");
		return mav;
	}
}
