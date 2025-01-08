package com.example.casem4.model;

import jakarta.persistence.*;


@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedback_id;

    // 1 Feedback là của 1 User
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id") // Liên kết tới AppUser
    private AppUser appUser;

    // 1 Feedback chỉ dành cho 1 Phone
    @ManyToOne
    @JoinColumn(name = "phone_id", referencedColumnName = "phone_id") // Liên kết tới Phone
    private Phone phone;

    private String content;

    public Feedback() {
    }

    public Integer getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(Integer feedback_id) {
        this.feedback_id = feedback_id;
    }

    public AppUser getUser() {
        return appUser;
    }

    public void setUser(AppUser user) {
        this.appUser = user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
