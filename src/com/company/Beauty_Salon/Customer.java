package com.company.Beauty_Salon;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        if(member== true){
            this.member = member;
            return true;
        }
           else {
               return false;
        }

    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        if(memberType == "Gold Member"){
            this.memberType = memberType;
            System.out.println("Gold Membership");
        }
        else if(memberType == "Premium Member"){
            this.memberType = memberType;
            System.out.println("Premium Membership");
        }
        else if(memberType == "Silver Member"){
            this.memberType = memberType;
            System.out.println("Silver Membership");
        }

    }
}
