package com.nuvi.domain;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="USER")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String user_id;
    private String nick_name;
    private String passwd;
    private String email;
    private int age;
    @Temporal(TemporalType.DATE)
    private Date create_dt;
    @Temporal(TemporalType.DATE)
    private Date update_dt;

    private int is_del;
    private int region_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String id) {
        this.user_id = id;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String username) {
        this.nick_name = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String password) {
        this.passwd = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date creat_dt) {
        this.create_dt = creat_dt;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
    }

    public int getIs_del() {
        return is_del;
    }

    public void setIs_del(int is_del) {
        this.is_del = is_del;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    @Override
    public String toString() {
        return "Id : " + user_id + "\n" + "Username : " + nick_name + "\n" + "Email : " + email;
    }
}
