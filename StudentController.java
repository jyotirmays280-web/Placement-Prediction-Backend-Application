package Mini_Project.example.Placement_Predictor.Controller;
import Mini_Project.example.Placement_Predictor.Entity.Student;
import Mini_Project.example.Placement_Predictor.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    List<Student> ListOfStudent = new ArrayList<>();

    @Autowired
    private StudentService service;

    // Save Student
    @PostMapping("/save")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        ListOfStudent.add(student);
        Student savedStudent = service.saveStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<Student>> GetAllStudent() {
        return ResponseEntity.ok(ListOfStudent);
    }

    @DeleteMapping("/DeleteAll")
    public ResponseEntity<Void> DeleteAll() {
        ListOfStudent.clear();
        service.DeleteStudent();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        ListOfStudent.remove(Math.toIntExact(id));
        service.DeleteById(id);
        Student current = service.saveStudent(student);
        ListOfStudent.add(current);
        return ResponseEntity.ok(current);
    }
}