package com.example.casem4.model;

import jakarta.persistence.*;


@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedbackId;

    // 1 Feedback là của 1 User
    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId") // Liên kết tới AppUser
    private AppUser appUser;

    // 1 Feedback chỉ dành cho 1 Phone
    @ManyToOne
    @JoinColumn(name = "phoneId", referencedColumnName = "phoneId") // Liên kết tới Phone
    private Phone phone;

    private String content;

    public Feedback() {
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
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
