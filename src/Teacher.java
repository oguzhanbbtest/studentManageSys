public class Teacher {
    String name;
    String mphone;
    String branch;

    Teacher(String name, String branch,String mphone){
    // sınıfımızda bulunan değişkenleri techer metodunun parametrelerine eşleştirdik.
        this.name = name;
        this.mphone = mphone;
        this.branch = branch;

    }
    void print(){
        System.out.println("Hoca Adi : " + this.name);
        System.out.println("telefonu : " + this.mphone);
        System.out.println("Bransi : " + this.branch);
    }
}
