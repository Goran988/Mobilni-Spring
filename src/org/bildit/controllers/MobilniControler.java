package org.bildit.controllers;

import java.util.List;

import org.bildit.dao.Mobilni;
import org.bildit.service.MobilniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MobilniControler {
	private MobilniService mobilniService;

	@Autowired
	public void setMobilniService(MobilniService mobilniService) {
		this.mobilniService = mobilniService;
	}

	@RequestMapping("/mobilni")
	public String showHome(Model model) {
		List<Mobilni> mobilni = mobilniService.getAll();
		model.addAttribute("list", mobilni);
		return "mobilni";
	}

	@RequestMapping("/createmobilni")
	public String createMobilni() {
		return "createmobilni";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model, Mobilni mobilni, BindingResult result) {
		mobilniService.createMobilni(mobilni);
		model.addAttribute("mobilni", mobilni);
		return "mobilnicreated";
	}

	@RequestMapping("/dodelete")
	public String doDelete(Model model) {
		List<Mobilni> mobilni = mobilniService.getAll();
		model.addAttribute("list", mobilni);
		return "dodelete";
	}

	@RequestMapping(value = "/deletemobilni", method = RequestMethod.POST)
	public String deleteMobilni(Model model, int id) {
		mobilniService.deleteMobilni(id);
		model.addAttribute("deletedId", id);
		return "mobilnideleted";
	}

	@RequestMapping("/search")
	public String search() {
		return "search";
	}

	@RequestMapping(value = "/searchmobilni", method = RequestMethod.POST)
	public String searchMobilni(Model model, String term) {
		List<Mobilni> mobilni2 = mobilniService.searchMobilni(term);
		model.addAttribute("list2",mobilni2);
		return "dosearch";
	}

}
