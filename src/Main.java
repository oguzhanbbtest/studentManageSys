public class Main {
    public static void main(String[] args) {
        SayfaDuzeni a1 = new SayfaDuzeni();

        Teacher t1 = new Teacher("Oguzhan Bahadir","FZKKLTR","666");
        Teacher t2 = new Teacher("Ilber Ortayli","TRH","111");
        Teacher t3 = new Teacher("Abarai Renji","UDDS","222");

        Course fizikkultur = new Course("Fizik Kultur","606","FZKKLTR",t1);
        fizikkultur.addTeacher(t1);

        Course tarih = new Course("Tarih","101","TRH",t2 );
        tarih.addTeacher(t2);

        Course ftechnics = new Course("UD Dovus Teknikleri","333","UDDS",t3);
        ftechnics.addTeacher(t3);

        a1.sayfabosluk();

        Student s1 = new Student("Matador Ali","001","002",fizikkultur,tarih,ftechnics);
        s1.addBulkExamNote(80,55,70);
        s1.addBulkSNote(90,90,90);
        s1.isPass();

        a1.sayfabosluk();
        a1.sayfaduzeni1();
        a1.sayfaduzeni2();
        a1.sayfaduzeni1();
        a1.sayfabosluk();


        Student s2 = new Student("Boğa Hüseyin", "002","002",fizikkultur,tarih,ftechnics);
        s2.addBulkExamNote(81,55,75);
        s2.addBulkSNote(90,90,90);
        s2.isPass();
    }
}
