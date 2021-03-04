package ada.wm2.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Entity
@Table(name = "COURSES")
public class Course {

    @Positive
    @NotNull
    @Id
    Integer courseId;

    @NotBlank
    @Size(min = 5, message = "valid course name must be used")
    String courseName;

    @NotBlank(message = "'fall' or 'spring' must be used")
    @Column(name = "AVAILABLE_TERM")
    String term;

    @Min(value = 1)
    @Max(value = 6)
    @NotNull
    Integer courseCredit;

    @NotBlank
    @Pattern(regexp = "[a-zA-Z',.-]+( [a-zA-Z',.-]+)*", message = "choices in brackets must be used")
    @Size(max = 2)
    String courseType;

    @NotBlank
    @Pattern(regexp = "[a-zA-Z',.-]+( [a-zA-Z',.-]+)*", message = "'John Doe' pattern must be used")
    @Column(name = "INSTRUCTOR")
    String courseInstructor;

    @ManyToMany(mappedBy = "courses")
    List<Student> students;
}
