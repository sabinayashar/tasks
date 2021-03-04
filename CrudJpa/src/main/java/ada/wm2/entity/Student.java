package ada.wm2.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Data
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Positive
    @NotNull
    @Id
    @Column(name = "ST_ID")
    Integer studentId;

    @NotBlank
    @Size(min = 2, max = 100, message = "valid name must be used")
    String firstName;

    @NotBlank
    @Size(min = 5, max = 100, message = "valid name must be used")
    String lastName;

    @NotBlank
    @Size(min = 4, max = 6)
    String gender;

    @NotBlank
    @Size(min = 6, max = 8, message = "degree must be either bachelor or master")
    String degree;

    @NotBlank
    @Size(min = 5, message = "valid major name must be used")
    String major;

    @Min(value = 0)
    @Max(value = 4)
    Double gpa;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z.a-z]+.[a-z]", message = " 'johndoe2050@yourchoice.edu.az' pattern must be used")
    @Column(name = "EMAIL")
    String emailAddress;

    @ManyToMany
    @JoinTable(name = "ENROLLMENTS",
               joinColumns = @JoinColumn(name = "ST_ID"),
               inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    List<Course> courses;
}
