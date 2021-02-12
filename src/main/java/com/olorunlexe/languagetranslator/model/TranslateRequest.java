package com.olorunlexe.languagetranslator.model;

import com.cloudmersive.client.model.LanguageTranslationRequest;

public class TranslateRequest extends LanguageTranslationRequest {
    public TranslateRequest(String input) {
        setTextToTranslate(input);
    }
}
