package praktika4.practice19.Task2;

public class Student {
    private String fio;
    private double averageScore;

    public Student(String fio, double averageScore) throws EmptyStringException {
        setFio(fio);
        setAverageScore(averageScore);
    }

    public void setFio(String fio) throws EmptyStringException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        this.fio = fio.trim();
    }

    public void setAverageScore(double averageScore) {
        if (averageScore < 0 || averageScore > 5) {
            throw new IllegalArgumentException("Балл должен быть от 0 до 5");
        }
        this.averageScore = averageScore;
    }

    public String getFio() {
        return fio;
    }

    public double getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return fio + " (средний балл: " + averageScore + ")";
    }
}
