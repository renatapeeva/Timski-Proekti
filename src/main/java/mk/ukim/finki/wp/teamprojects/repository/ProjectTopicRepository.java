package mk.ukim.finki.wp.teamprojects.repository;

import mk.ukim.finki.wp.teamprojects.model.ProjectTopic;
import mk.ukim.finki.wp.teamprojects.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectTopicRepository extends JpaSpecificationRepository<ProjectTopic, Long> {
    Optional<ProjectTopic> findByTitle(String title);
    Optional<ProjectTopic> findByStudentsContaining(Student student);
}
