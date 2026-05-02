package Mini_Project.example.Placement_Predictor.Repository;
import Mini_Project.example.Placement_Predictor.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Long>{}

