import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Derslerin oluşturulması
        Course mat = new Course("Matematik", "MAT101", "MAT", 20, 80);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 30, 70);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 25, 75);

        // Akademisyenlerin oluşturulması
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        // Derslere akademisyen atanması
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        // Öğrencilerin oluşturulması ve notlarının alınması
        System.out.println("Öğrenci 1 Bilgilerini Girin:");
        Student s1 = createStudent(scanner, mat, fizik, kimya);
        s1.isPass();

        System.out.println("Öğrenci 2 Bilgilerini Girin:");
        Student s2 = createStudent(scanner, mat, fizik, kimya);
        s2.isPass();

        System.out.println("Öğrenci 3 Bilgilerini Girin:");
        Student s3 = createStudent(scanner, mat, fizik, kimya);
        s3.isPass();
    }

    public static Student createStudent(Scanner scanner, Course mat, Course fizik, Course kimya) {
        System.out.print("Öğrenci Adı: ");
        String name = scanner.nextLine();

        System.out.print("Sınıf: ");
        int classes = Integer.parseInt(scanner.nextLine());

        System.out.print("Öğrenci Numarası: ");
        String stuNo = scanner.nextLine();

        System.out.print("Matematik Sınav Notu: ");
        int matNote = Integer.parseInt(scanner.nextLine());

        System.out.print("Matematik Sözlü Notu: ");
        int matOralNote = Integer.parseInt(scanner.nextLine());

        System.out.print("Fizik Sınav Notu: ");
        int fizikNote = Integer.parseInt(scanner.nextLine());

        System.out.print("Fizik Sözlü Notu: ");
        int fizikOralNote = Integer.parseInt(scanner.nextLine());

        System.out.print("Kimya Sınav Notu: ");
        int kimyaNote = Integer.parseInt(scanner.nextLine());

        System.out.print("Kimya Sözlü Notu: ");
        int kimyaOralNote = Integer.parseInt(scanner.nextLine());

        Student student = new Student(name, classes, stuNo, mat, fizik, kimya);
        student.addBulkExamNote(matNote, fizikNote, kimyaNote);
        student.addOralNote(matOralNote, fizikOralNote, kimyaOralNote);

        return student;
    }
}