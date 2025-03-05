package android.example.com.tlucontact;

public class CBNV {
    String name;
    String position;
    String phone_number;
    String email;
    String department;

    public CBNV(String name, String position, String phone_number, String email, String department) {
        this.name = name;
        this.position = position;
        this.phone_number = phone_number;
        this.email = email;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
