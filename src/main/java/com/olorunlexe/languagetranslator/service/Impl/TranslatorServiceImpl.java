package com.olorunlexe.languagetranslator.service.Impl;

import com.cloudmersive.client.LanguageTranslationApi;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.ApiKeyAuth;
import com.cloudmersive.client.model.LanguageTranslationResponse;
import com.google.gson.Gson;
import com.olorunlexe.languagetranslator.model.TranslateRequest;
import com.olorunlexe.languagetranslator.service.TranslatorService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TranslatorServiceImpl implements TranslatorService {
    private LanguageTranslationApi apiInstance;
    @Value("${translatorApiKey}")
    private String translatorApiKey;

    @PostConstruct
    private void startup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        apiInstance = new LanguageTranslationApi();
        apiInstance.setApiClient(defaultClient);
        ApiKeyAuth apiKey = (ApiKeyAuth) apiInstance.getApiClient().getAuthentication("Apikey");
        apiKey.setApiKey(translatorApiKey);
    }

    @Override
    public String convertEnglishToFrench(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateEngToFra(in);
        return new Gson().toJson(response);
    }

    @Override
    public String convertFrenchToEnglish(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateFraToEng(in);
        return new Gson().toJson(response);
    }

    @Override
    public String convertEnglishToGerman(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateEngToDeu(in);
        return new Gson().toJson(response);
    }

    @Override
    public String convertGermanToEnglish(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateDeuToEng(in);
        return new Gson().toJson(response);
    }

    @Override
    public String convertEnglishToRussian(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateEngToRus(in);
        return new Gson().toJson(response);
    }

    @Override
    public String convertRussianToEnglish(String input) throws ApiException {
        TranslateRequest in = new TranslateRequest(input);
        LanguageTranslationResponse response = apiInstance.languageTranslationTranslateRusToEng(in);
        return new Gson().toJson(response);
    }
}
