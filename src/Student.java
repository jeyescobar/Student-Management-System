public class Student {
    private int id;
    private String name;
    private String major;
    private double gpa;

    public Student(int id, String name, String major, double gpa){
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    //getters

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public double getGpa(){
        return gpa;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }


    @Override
    public String toString(){
        return "ID: " + id + " , Nombre: " + name + " , Major: " + major + " , GPA: " + gpa ;
    }

}
