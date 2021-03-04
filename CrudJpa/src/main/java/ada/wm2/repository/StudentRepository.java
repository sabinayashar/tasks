package ada.wm2.repository;

import ada.wm2.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    List<Student> findByEmailAddressOrDegreeIgnoreCase(String email, String degree);

    @Query("Select s from Student s where s.gpa between :gpa1 and :gpa2")
    List<Student> findByGpaInterval(Double gpa1, Double gpa2);

    @Query(value = "SELECT * FROM STUDENTS S, COURSES C, ENROLLMENTS E WHERE S.ST_ID = E.ST_ID AND C.COURSE_ID = E.COURSE_ID and UPPER(C.COURSE_NAME) = UPPER(:course1)", nativeQuery = true)
    List<Student> findByTakenCoursesIgnoreCase(String course1);
}
