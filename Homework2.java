public class Student {

    private int no;
    private String name;
    private String major;
    private int phone;

    public Student(int no, String name, String major, int phone) {
        super();
        this.no = no;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
}