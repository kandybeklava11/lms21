import javax.swing.*;
import java.util.Random;

public class Reader {

    private int id;
    private String fullName;
    private String email;
    private int phoneNumber;
    private ReaderGender gender;

    public Reader( String fullName, String email, int phoneNumber, ReaderGender gender) {
        Random random=new Random();
this.id=random.nextInt(1,999999);
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ReaderGender getGender() {
        return gender;
    }

    public void setGender(ReaderGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Reader: " +
                "id=" + id +
                ",fullName=" + fullName +
                ", email=" + email +
                ", phoneNumber=" + phoneNumber +
                ", gender=" + gender ;

    }
}
