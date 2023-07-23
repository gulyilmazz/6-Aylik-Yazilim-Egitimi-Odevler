public class Course {
    public double note,oralNote;
    String name;
    String code;
    String prefix;
    double oralWeight;
    double examWeight;
    Teacher teacher;
    
    

    public Course(String name, String code, String prefix, double oralWeight, double examWeight) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.oralWeight = oralWeight;
        this.examWeight = examWeight;
        this.teacher = null;
    }

    public void addTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void printTeacher() {
        if (teacher != null) {
            System.out.println("Ders: " + this.name + ", Akademisyen: " + teacher.name);
        } else {
            System.out.println("Ders: " + this.name + ", Akademisyen atanmamıştır.");
        }
    }
}