package model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class EmployeeForm {
    private int id;
    private String name;
//    private Date date;
//    private int department_id;
    private MultipartFile avatar;
    private boolean gender;

    public EmployeeForm(int id, String name) {
        this.id = id;
        this.name = name;
    }

       public EmployeeForm(int id, String name, MultipartFile avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public EmployeeForm(int id, String name, MultipartFile avatar, boolean gender) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
    }

    public EmployeeForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
