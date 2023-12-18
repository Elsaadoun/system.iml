package com.yourcompany.pollingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.yourcompany.pollingsystem.model.User;

@Service
public class ExternalService {
    @Autowired
    private RestTemplate restTemplate;

    // Récupération d'informations utilisateur depuis un service externe
    public User getExternalUserInfo(Long userId) {
        // URL d'une API externe, à remplacer par l'URL réelle
        String url = "http://external-api.com/users/" + userId;
        return restTemplate.getForObject(url, User.class);
    }

    // Autres méthodes pour interagir avec des services externes, selon les besoins de votre système
}
