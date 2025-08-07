package college;

public class Details {
    String name;
    int rno;
    String dept;
    String year;
    String transport;
    String gender;
    String bloodGroup;
    String mobile;
    String email;

    public Details(String name, int rno, String dept, String year, String transport,
                   String gender, String bloodGroup, String mobile, String email) {
        this.name = name;
        this.rno = rno;
        this.dept = dept;
        this.year = year;
        this.transport = transport;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.mobile = mobile;
        this.email = email;
    }

    public String toString() {
        return "Name       : " + name +
                "\nRoll No    : " + rno +
                "\nDept       : " + dept +
                "\nYear       : " + year +
                "\nTransport  : " + transport +
                "\nGender     : " + gender +
                "\nBlood Group: " + bloodGroup +
                "\nMobile     : " + mobile +
                "\nEmail      : " + email;
    }
}
