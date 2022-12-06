package com.example.myap;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class logindatabase {
    private static List<Member> memberList;

    static {
        memberList = new ArrayList<>();

        Member member =  null;
        member = new Member(1, "id1", "password1");
        memberList.add(member);
    }

    public static Member findMember(String loginId) {
        for(Member member : memberList){
            if(member.getLoginId().equals(loginId)){
                return member;
            }
        }
        return null;
    }
}