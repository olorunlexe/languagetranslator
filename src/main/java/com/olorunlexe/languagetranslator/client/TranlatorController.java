package com.olorunlexe.languagetranslator.client;

import com.cloudmersive.client.invoker.ApiException;
import com.olorunlexe.languagetranslator.service.TranslatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TranlatorController {
    @Autowired
    private TranslatorService translatorService;

    @PostMapping(value = "convertEnglishToFrench",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertEnglishToFrench(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertEnglishToFrench(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }

    @PostMapping(value = "convertFrenchToEnglish",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertFrenchToEnglish(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertFrenchToEnglish(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }

    @PostMapping(value = "convertEnglishToGerman",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertEnglishToGerman(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertEnglishToGerman(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }

    @PostMapping(value = "convertGermanToEnglish",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertGermanToEnglish(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertGermanToEnglish(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }

    @PostMapping(value = "convertEnglishToRussian",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertEnglishToRussian(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertEnglishToRussian(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }

    @PostMapping(value = "convertRussianToEnglish",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String convertRussianToEnglish(@RequestBody String text) {

        String responseModel = null;
        try {
            responseModel = translatorService.convertRussianToEnglish(text);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        return responseModel;
    }
}
