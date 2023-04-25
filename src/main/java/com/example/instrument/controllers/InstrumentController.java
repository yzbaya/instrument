package com.example.instrument.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.instrument.entities.Instrument;
import com.example.instrument.service.InstrumentService;
import com.example.instrument.service.InstrumentService;

@Controller
public class InstrumentController {
	
	InstrumentService instrumentService;
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createInstrument";
	}
	@RequestMapping("/saveInstrument")
	public String saveInstrument(@ModelAttribute("instrument") Instrument instrument, 
	                          @RequestParam("date") String date,
	                            ModelMap modelMap) throws
	ParseException 
	{
	
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateCreation = dateformat.parse(String.valueOf(date));
	 instrument.setDateCreation(dateCreation);
	 
	Instrument saveInstrument = instrumentService.saveInstrument(instrument);
	String msg ="produit enregistré avec Id "+saveInstrument.getIdProduit();
	modelMap.addAttribute("msg", msg);
	return "createProduit";
	}
	}

