package ru.job4j.checkdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.checkdesk.model.Exam;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
