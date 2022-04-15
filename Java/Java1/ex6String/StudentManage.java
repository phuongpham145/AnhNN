import java.util.Scanner;

public class StudentManage {
    private String name, email, phonenumber, cccd;

    public StudentManage() {

    }

    public StudentManage(String name, String email, String phonenumber, String cccd) {
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
        this.cccd = cccd;
    }
    public void ExportStudent(){
        System.out.printf("Name is %s - Email is %s - phonenumber is %s - cccd is %s", name, email, phonenumber, cccd);
    }
    public void AddStudent(Scanner scanner) {
        do {
            System.out.print("Fullname : ");
            name = scanner.nextLine();
            if (name == null || name.equals(""))
                System.out.println("Name is not true, please enter again.");
            else
                break;
        } while (true);
        StudentManageData dv = new StudentManageData();
        do {
            System.out.print("Email : ");
            email = scanner.nextLine();
            if (dv.isEmail(email))
                break;
            System.out.println("Email is not true, please enter again");
        } while (true);
        do {
            System.out.print("Phonenumber : ");
            phonenumber = scanner.nextLine();
            if (dv.isPhoneNumber(phonenumber))
                break;
            System.out.println("Phonenumber is not true, please enter again");
        } while (true);
        do {
            System.out.print("Cccd : ");
            cccd = scanner.nextLine();
            if (dv.isCCDD(cccd))
                break;
            System.out.println("Cccd is not true, please enter again");
        } while (true);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getCccd() {
        return cccd;
    }

}
