package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Language;

public interface LanguageRepository {

	void insertLanguage(Language language);
	void updateLanguage(Language thisLanguage, Language newLanguage);
	void deleteLanguage(Language language);
	List<Language> getAllLanguage();
	Language getLanguageId(int id);
}
