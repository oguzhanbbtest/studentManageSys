public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double snote;
    double rnote;

    Course(String name, String code,String prefix,Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        double snote = 0;
        double rnote = 0;
    }
    void addTeacher(Teacher teacher){
        this.teacher = teacher;
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //printTeacher();
        }else{
            System.out.println("Ogretmen ve Ders Bölümleri Uyusmuyor!");
        }
    }

    void printTeacher(){
        this.teacher.print();

    }
}
