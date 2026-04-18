package ru.job4j.checkdesk.service;

import org.springframework.stereotype.Service;
import ru.job4j.checkdesk.model.Exam;

import java.util.List;
import java.util.Map;
@Service
public class SimpleDescService implements DescService {
    private final Map<Long, Exam> examMap = Map.of(
            1L, new Exam(1L, "Core"),
            2L, new Exam(2L, "IO"),
            3L, new Exam(3L, "Multithreading"),
            4L, new Exam(4L, "Spring")
    );

    @Override
    public List<Exam> findAll() {
        return examMap.values().stream().toList();
    }
}
