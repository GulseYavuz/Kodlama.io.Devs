package business.abstracts;

import java.util.List;

import entities.concretes.Language;

public interface LanguageService {
	void insertLanguage(Language language);
	void updateLanguage(Language thisLanguage, Language newLanguage);
	void deleteLanguage(Language language);
	List<Language> getAllLanguage();
	Language getLanguageId(int id);
	void isEmpty(Language language);
	void isRepeat(Language language);

}
