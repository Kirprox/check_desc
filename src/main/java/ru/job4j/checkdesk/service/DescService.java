package ru.job4j.checkdesk.service;

import ru.job4j.checkdesk.model.Exam;

import java.util.List;

public interface DescService {
    List<Exam> findAll();
}
