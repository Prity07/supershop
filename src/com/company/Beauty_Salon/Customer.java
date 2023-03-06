package com.company.Beauty_Salon;

public class Customer {
    private String name;
    private boolean isMember = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
//        if (memberType == "Gold Member") {
//            this.memberType = memberType;
//            System.out.println("Gold Membership");
//        } else if (memberType == "Premium Member") {
//            this.memberType = memberType;
//            System.out.println("Premium Membership");
//        } else if (memberType == "Silver Member") {
//            this.memberType = memberType;
//            System.out.println("Silver Membership");
//        }

    }
}
