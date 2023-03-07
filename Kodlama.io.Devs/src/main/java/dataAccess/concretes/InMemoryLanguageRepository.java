package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dataAccess.abstracts.LanguageRepository;
import entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	private List<Language> languages;
	
	@Autowired
	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1, "JAVA"));
		languages.add(new Language(2, "C#"));
		languages.add(new Language(3, "PYTHON"));
	}
	@Override
	public void insertLanguage(Language language) {
		languages.add(language);
	
	}

	@Override
	public void updateLanguage(Language thisLanguage, Language newLanguage) {
		languages.set(thisLanguage.getId(), newLanguage);
	}

	@Override
	public void deleteLanguage(Language language) {
		languages.remove(language.getId());
	}

	@Override
	public List<Language> getAllLanguage() {
		return languages;
	}

	@Override
	public Language getLanguageId(int id) {
		return languages.get(id);
	}

}
