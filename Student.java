package Mini_Project.example.Placement_Predictor.Entity;
import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double cgpa;
    private int backlogs;
    private int projects;
    private int internships;
    private String codingRating;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(Long id, double cgpa, int backlogs, int projects, int internships, String codingRating) {
        this.id = id;
        this.cgpa = cgpa;
        this.backlogs = backlogs;
        this.projects = projects;
        this.internships = internships;
        this.codingRating = codingRating;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getBacklogs() {
        return backlogs;
    }
    public void setBacklogs(int backlogs) {
        this.backlogs = backlogs;
    }

    public int getProjects() {
        return projects;
    }
    public void setProjects(int projects) {
        this.projects = projects;
    }

    public int getInternships() {
        return internships;
    }
    public void setInternships(int internships) {
        this.internships = internships;
    }

    public String getCodingRating() {
        return codingRating;
    }
    public void setCodingRating(String codingRating) {
        this.codingRating = codingRating;
    }
}