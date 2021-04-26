package model;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

public class EmployeeForm {
    private int id;
    private String name;
//    private Date date;
    private int department_id;
    private MultipartFile avatar;
    private boolean gender;

    public EmployeeForm(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public EmployeeForm(int id, String name, int department_id) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
    }

    public EmployeeForm(int id, String name, int department_id, MultipartFile avatar) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
        this.avatar = avatar;
    }

    public EmployeeForm(int id, String name, int department_id, MultipartFile avatar, boolean gender) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
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
