package ru.job4j.checkdesk.service;

import org.springframework.stereotype.Service;
import ru.job4j.checkdesk.model.Exam;
import ru.job4j.checkdesk.repository.ExamRepository;

import java.util.List;
import java.util.Map;

@Service
public class SimpleDescService implements DescService {
    private final ExamRepository examRepository;

    public SimpleDescService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    @Override
    public List<Exam> findAll() {
        return examRepository.findAll();
    }
}
