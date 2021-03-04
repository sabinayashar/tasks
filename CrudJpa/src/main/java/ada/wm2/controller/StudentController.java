package ada.wm2.controller;

import ada.wm2.entity.Course;
import ada.wm2.entity.Student;
import ada.wm2.repository.CourseRepository;
import ada.wm2.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {

    StudentRepository studentRepo;
    CourseRepository courseRepo;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public StudentController(StudentRepository sr, CourseRepository cr) {
        studentRepo = sr;
        courseRepo = cr;
    }

    @GetMapping("/list")
    public String getStudentList(Model model) {
        logger.warn("Entered getStudentList() method");
        Iterable<Student> students = studentRepo.findAll();
        model.addAttribute("students", students);
        return "show";
    }

    @GetMapping("/add")
    public String addNewStudent(Model model) {
        model.addAttribute("student", new Student());
        Iterable<Course> courses = courseRepo.findAll();
        model.addAttribute("courses", courses);
        return "student/addStudent";
    }

    @GetMapping("/update/{id}")
    public String updateStudent(Model model, @PathVariable Integer id) {
        Optional<Student> result = studentRepo.findById(id);
        if(result.isPresent()) {
            Student st = result.get();
            model.addAttribute("student", st);
        }
        Iterable<Course> courses = courseRepo.findAll();
        model.addAttribute("courses", courses);
        return "student/stDetails";
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(Model model, @PathVariable Integer id) {
        studentRepo.deleteById(id);
        model.addAttribute("message", "Student deletion was completed!");
        return "index";
    }

    @PostMapping("/save")
    public String saveNewStudent(Model model, @Valid Integer studentId, @Valid Student studentData, BindingResult br) {
        logger.debug("Entered saveNewStudent() method");
        if(studentRepo.existsById(studentData.getStudentId())) {
            model.addAttribute("message", "Student with ID: " + studentData.getStudentId() + " exists!");
            Iterable<Course> courses = courseRepo.findAll();
            model.addAttribute("courses", courses);
            return "student/addStudent";
        }
        if(br.hasErrors()) {
            logger.error("saveNewStudent() was terminated! >> Wrong input(s) for student >> " + studentData.getFirstName());
            Iterable<Course> courses = courseRepo.findAll();
            model.addAttribute("courses", courses);
            return "student/addStudent";
        }
        studentRepo.save(studentData);
        logger.info("New student saved: " + studentData.getFirstName() + " " + studentData.getLastName());
        model.addAttribute("message", "Student " + studentData.getFirstName() + " " + studentData.getLastName() + " was added!");
        return "index";
    }

    @PostMapping("/modifyandsave")
    public String modifyAndSaveStudent(Model model, @Valid Integer studentId, @Valid Student studentData, BindingResult br) {
        logger.debug("Entered modifyAndSaveStudent() method");
        if(br.hasErrors()) {
            logger.error("modifyAndSaveStudent() was terminated! >> Wrong input(s) for student >> " + studentData.getFirstName());
            Iterable<Course> courses = courseRepo.findAll();
            model.addAttribute("courses", courses);
            return "student/stDetails";
        }
        studentRepo.save(studentData);
        logger.info("Student >> " + studentData.getFirstName() + " " + studentData.getLastName() + " was modified");
        model.addAttribute("message", "Student " + studentData.getFirstName() + " " + studentData.getLastName() + " was modified!");
        return "index";
    }

    @GetMapping("/email")
    public String getStudentByEmailOrDegree(Model model, @RequestParam String email, @RequestParam String degree) {
        Iterable<Student> students = studentRepo.findByEmailAddressOrDegreeIgnoreCase(email, degree);
        model.addAttribute("students", students);
        return "show";
    }

    @GetMapping("/gpa")
    public String getStudentByGpa(Model model, @RequestParam Double gpa1, @RequestParam Double gpa2) {
        Iterable<Student> students = studentRepo.findByGpaInterval(gpa1, gpa2);
        model.addAttribute("students", students);
        return "show";
    }

    @GetMapping("/course")
    public String getStudentByTakenCourses(Model model, @RequestParam String course1) {
        Iterable<Student> students = studentRepo.findByTakenCoursesIgnoreCase(course1);
        model.addAttribute("students", students);
        return "show";
    }
}
