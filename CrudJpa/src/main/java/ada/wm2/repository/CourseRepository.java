package ada.wm2.repository;

import ada.wm2.entity.Course;
import ada.wm2.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    @Query(value = "SELECT * FROM COURSES WHERE UPPER(COURSE_TYPE) = UPPER(:type) AND UPPER(AVAILABLE_TERM) = UPPER(:term)", nativeQuery = true)
    List<Course> findByCourseTypeAndAvailableTermIgnoreCase(String type, String term);
}

