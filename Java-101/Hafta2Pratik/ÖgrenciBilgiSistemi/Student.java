public class Student {
    String name;
    String stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    boolean isPass;

    public Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }
    }

    public void addOralNote(int oralNote1, int oralNote2, int oralNote3) {
        if (oralNote1 >= 0 && oralNote1 <= 100) {
            this.course1.oralNote = oralNote1;
        }
        if (oralNote2 >= 0 && oralNote2 <= 100) {
            this.course2.oralNote = oralNote2;
        }
        if (oralNote3 >= 0 && oralNote3 <= 100) {
            this.course3.oralNote = oralNote3;
        }
    }

    public void calculateAverages() {
        double course1Average = (course1.note * (1 - (course1.oralWeight / 100))) + (course1.oralNote * (course1.oralWeight / 100));
        double course2Average = (course2.note * (1 - (course2.oralWeight / 100))) + (course2.oralNote * (course2.oralWeight / 100));
        double course3Average = (course3.note * (1 - (course3.oralWeight / 100))) + (course3.oralNote * (course3.oralWeight / 100));

        average = (course1Average + course2Average + course3Average) / 3;
    }

    public void isPass() {
        calculateAverages();
        if (course1.note == 0 || course2.note == 0 || course3.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            isPass = average >= 55;
            printNote();
            System.out.println("Ortalama: " + average);
            if (isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote() {
        System.out.println("Öğrenci: " + name);
        System.out.println("Ders 1 Notu: " + course1.note + ", Sözlü: " + course1.oralNote);
        System.out.println("Ders 2 Notu: " + course2.note + ", Sözlü: " + course2.oralNote);
        System.out.println("Ders 3 Notu: " + course3.note + ", Sözlü: " + course3.oralNote);
    }
}