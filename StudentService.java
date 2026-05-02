package Mini_Project.example.Placement_Predictor.Service;
import Mini_Project.example.Placement_Predictor.Entity.Student;
import Mini_Project.example.Placement_Predictor.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student) {
        return repo.save(student);
    }
    public void DeleteById(Long id){
        repo.deleteById(id);
    }
    public void DeleteStudent(){
        repo.deleteAll();
    }
}
