package tutorial.schooljdbc;

public class Student {

    private int role_no;
    private String name;
    private String address;

    public int getRole_no() {
        return role_no;
    }

    public void setRole_no(int role_no) {
        this.role_no = role_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "role_no=" + role_no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
