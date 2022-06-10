package siniflar;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course mat_sozlu;
    Course fizik_sozlu;
    Course kimya_sozlu;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo,Course kimya_sozlu,Course fizik_sozlu, Course mat_sozlu,Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.mat_sozlu = mat_sozlu;
        this.fizik_sozlu = fizik_sozlu;
        this.kimya_sozlu = kimya_sozlu;



        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int mat_sozlu,int fizik_sozlu, int fizik,int kimya_sozlu, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (mat >= 0 && mat <= 100) {
            this.mat_sozlu.note = mat_sozlu;
        }
        if (mat >= 0 && mat <= 100) {
            this.fizik_sozlu.note = fizik_sozlu;
        }
        if (mat >= 0 && mat <= 100) {
            this.kimya_sozlu.note = kimya_sozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||this.fizik_sozlu.note==0||this.kimya_sozlu.note==0||this.mat_sozlu.note==0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.mat.note*0.8)+(this.fizik.note*0.8)+(this.kimya.note*0.8)+(this.mat_sozlu.note*0.2)+(this.fizik_sozlu.note*0.2)+(this.kimya_sozlu.note*0.2) )/3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sozlu Notu : " + this.mat_sozlu.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sozlu Notu : " + this.fizik_sozlu.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sozlu Notu : " + this.kimya_sozlu.note);
    }

}
