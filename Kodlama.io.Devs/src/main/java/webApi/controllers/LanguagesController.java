package webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import business.abstracts.LanguageService;
import entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	@PostMapping("/addLanguage")
	public void insertLanguage(@RequestBody Language language) {
		languageService.insertLanguage(language);
	}
	
	@GetMapping("/getAllLanguage")
	public List<Language> getLanguages(){
		return languageService.getAllLanguage();
	}
	
	@GetMapping("/getId/{id}")
	public Language getLanguageId(int id) {
		return languageService.getLanguageId(id);
		
	}
	
	@DeleteMapping("/deleteLanguage/{id}")
	public void deleteLanguage(Language language) {
		languageService.deleteLanguage(language);
	}
	

}
