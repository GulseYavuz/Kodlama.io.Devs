package business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import business.abstracts.LanguageService;
import dataAccess.abstracts.LanguageRepository;
import entities.concretes.Language;

public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	

	@Override
	public void insertLanguage(Language language) {
		languageRepository.insertLanguage(language);
	}

	@Override
	public void updateLanguage(Language thisLanguage, Language newLanguage) {
		languageRepository.updateLanguage(thisLanguage, newLanguage);
	}

	@Override
	public void deleteLanguage(Language language) {
		languageRepository.deleteLanguage(language);
	}

	@Override
	public List<Language> getAllLanguage() {
		return languageRepository.getAllLanguage();
	}

	@Override
	public Language getLanguageId(int id) {
		return languageRepository.getLanguageId(id);
	}

	@Override
	public void isEmpty(Language language) {
		if(language.getName().isEmpty()) {
			try {
				System.err.println("Program dili boş geçilemez.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void isRepeat(Language language) {
		List<Language> languages = languageRepository.getAllLanguage();
		for (Language languageValue : languages) {
			if(languageValue.getName().equals(language.getName())) {
				try {
					System.out.println("Programlama dili tekrar edilemez.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}

}
