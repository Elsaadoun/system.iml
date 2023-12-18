package com.yourcompany.pollingsystem.service;

import java.util.List;
import com.yourcompany.pollingsystem.model.Response;
import com.yourcompany.pollingsystem.repository.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    @Autowired
    private ResponseRepository responseRepository;

    public Response createResponse(Response response) {

        return responseRepository.save(response);
    }

    public Response getResponseById(Long id) {

        return responseRepository.findById(id).orElseThrow(() -> new RuntimeException("Response not found"));
    }

    public List<Response> getAllResponses() {

        return responseRepository.findAll();
    }

    public Response updateResponse(Long id, Response updatedResponse) {

        Response response = responseRepository.findById(id).orElseThrow(() -> new RuntimeException("Response not found"));

        return responseRepository.save(response);
    }

    public void deleteResponse(Long id) {

        responseRepository.deleteById(id);
    }
}
