package com.example.myap;

public class Member {
    private int id;
    private String loginId;
    private String loginPassword;

    public Member(int id, String loginId, String loginPassword) {
        this.id = id;
        this.loginId = loginId;
        this.loginPassword = loginPassword;
    }

    public Member(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
