package model;


import java.util.Date;

public class Employee {
    private Long id;
    private String name;
//    private Date date;
    private String avatar;
    private boolean gender;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Employee(Long id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee(Long id, String name, String avatar, boolean gender) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
    }

    public Employee(Long id, String name, String avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    public Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
