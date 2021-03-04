package ada.wm2.controller;

import ada.wm2.entity.Course;
import ada.wm2.exception.CourseException;
import ada.wm2.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseRepository courseRepo;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/list")
    public String getCourseList(Model model) {
        logger.warn("Entered getCourseList() method");
        Iterable<Course> courses = courseRepo.findAll();
        model.addAttribute("courses", courses);
        return "show";
    }

    @GetMapping("/add")
    public String addNewCourse(Model model) {
        model.addAttribute("course", new Course());
        return "course/addCourse";
    }

    @GetMapping("/update/{id}")
    public String UpdateCourse(Model model, @PathVariable Integer id) {
        Optional<Course> result = courseRepo.findById(id);
        if(result.isPresent()) {
            Course cr = result.get();
            model.addAttribute("course", cr);
        }
        return "course/crDetails";
    }

    @PostMapping("/delete/{id}")
    public String deleteCourse(Model model, @PathVariable Integer id) throws CourseException {
        try {
            courseRepo.deleteById(id);
            model.addAttribute("message", "Course deletion was completed!");
            return "index";
        } catch (Exception ex) {
            logger.warn("It is not allowed to delete the course because some students are already taking it!");
            throw new CourseException("Oops! It is not allowed to delete the course because some students are already taking it!");
        }
    }

    @PostMapping("/save")
    public String saveNewCourse(Model model, @Valid Integer courseId, @Valid Course courseData, BindingResult br) {
        logger.debug("Entered saveNewCourse() method");
        if(courseRepo.existsById(courseData.getCourseId())) {
            model.addAttribute("message", "Course with ID: " + courseData.getCourseId() + " exists!");
            return "course/addCourse";
        }
        if(br.hasErrors()) {
            logger.error("saveNewCourse() was terminated! >> Wrong input(s) for course >> " + courseData.getCourseName());
            return "course/addCourse";
        } else {
            courseRepo.save(courseData);
            logger.info("New course saved: " + courseData.getCourseName());
            model.addAttribute("message", "Course " + courseData.getCourseName() + " was added!");
            return "index";
        }
    }

    @PostMapping("/modifyandsave")
    public String modifyAndSaveCourse(Model model, @Valid Integer courseId, @Valid Course courseData, BindingResult br) {
        logger.debug("Entered modifyAndSaveCourse() method");
        if(br.hasErrors()) {
            logger.error("modifyAndSaveCourse() was terminated! >> Wrong input(s) for course >> " + courseData.getCourseName());
            return "course/crDetails";
        }
        courseRepo.save(courseData);
        logger.info("Course >> " + courseData.getCourseName() + " was modified");
        model.addAttribute("message", "Course " + courseData.getCourseName() + " was modified!");
        return "index";
        }

    @GetMapping("/typeandterm")
    public String findByCourseTypeAndAvailableTerm(Model model, @RequestParam String type, @RequestParam String term) {
        Iterable<Course> courses = courseRepo.findByCourseTypeAndAvailableTermIgnoreCase(type, term);
        model.addAttribute("courses", courses);
        return "show";
    }
}
