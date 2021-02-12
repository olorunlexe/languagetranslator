package com.olorunlexe.languagetranslator.service;

import com.cloudmersive.client.invoker.ApiException;

public interface TranslatorService {
    public String convertEnglishToFrench(String input) throws ApiException;

    public String convertFrenchToEnglish(String input) throws ApiException;

    public String convertEnglishToGerman(String input) throws ApiException;

    public String convertGermanToEnglish(String input) throws ApiException;

    public String convertEnglishToRussian(String input) throws ApiException;

    public String convertRussianToEnglish(String input) throws ApiException;
}
