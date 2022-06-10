package siniflar;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course mat_sozlu = new Course("Matematik", "MAT101", "MAT");
        Course fizik_sozlu = new Course("Fizik", "FZK101", "FZK");
        Course kimya_sozlu = new Course("Kimya", "KMY101", "KMY");



        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Saban", 4, "140144015", mat, fizik, kimya,mat_sozlu,fizik_sozlu,kimya_sozlu);
        s1.addBulkExamNote(60,70,60,90,35,56);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya,mat_sozlu,fizik_sozlu,kimya_sozlu);
        s2.addBulkExamNote(70,60,50,45,40,35);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,mat_sozlu,fizik_sozlu,kimya_sozlu);
        s3.addBulkExamNote(50,40,50,70,85,74);
        s3.isPass();

    }
}
