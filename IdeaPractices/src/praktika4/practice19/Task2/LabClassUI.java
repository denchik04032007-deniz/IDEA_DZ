package praktika4.practice19.Task2;

public interface LabClassUI {
    void addStudent(Student student);
    void sortByAverageScore();
    Student findByFio(String fio) throws StudentNotFoundException;
    void printAllStudents();
}