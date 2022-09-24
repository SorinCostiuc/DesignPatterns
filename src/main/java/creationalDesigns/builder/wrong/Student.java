package creationalDesigns.builder.wrong;

public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;

    public Student(String cnp, String name, String email, String phoneNumber) {
        this.cnp = cnp;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Student() {
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
