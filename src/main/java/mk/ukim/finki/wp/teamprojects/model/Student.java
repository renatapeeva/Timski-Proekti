package mk.ukim.finki.wp.teamprojects.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id
    @Column(name = "student_index")
    private String index;

    private String email;

    private String name;

    private String lastName;

    private String parentName;

    @ManyToOne
    private StudyProgram studyProgram;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Student student = (Student) o;
        return getIndex() != null && Objects.equals(getIndex(), student.getIndex());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
