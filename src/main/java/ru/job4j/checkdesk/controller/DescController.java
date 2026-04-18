package ru.job4j.checkdesk.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.job4j.checkdesk.model.Exam;
import ru.job4j.checkdesk.service.DescService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/desc")
public class DescController {
    private final DescService descService;

    @GetMapping
    public ResponseEntity<List<Exam>> getAll() {
        return ResponseEntity.ok(descService.findAll());
    }
}
