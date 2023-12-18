package com.yourcompany.pollingsystem.controller;

import com.yourcompany.pollingsystem.model.Response;
import com.yourcompany.pollingsystem.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/responses")
public class ResponseController {
    @Autowired
    private ResponseService responseService;

    @PostMapping
    public ResponseEntity<Response> createResponse(@RequestBody Response response) {
        return ResponseEntity.ok(responseService.createResponse(response));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getResponseById(@PathVariable Long id) {
        return ResponseEntity.ok(responseService.getResponseById(id));
    }

    @GetMapping
    public ResponseEntity<List<Response>> getAllResponses() {
        return ResponseEntity.ok(responseService.getAllResponses());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> updateResponse(@PathVariable Long id, @RequestBody Response response) {
        return ResponseEntity.ok(responseService.updateResponse(id, response));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResponse(@PathVariable Long id) {
        responseService.deleteResponse(id);
        return ResponseEntity.ok().build();
    }
}
