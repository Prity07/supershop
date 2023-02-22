package com.company.shopno;

public class LoyalCustomer extends Customer{
    private int rewardPoint;

    public LoyalCustomer(int id, String name, String dateOfBirth, Branch branch) {
        super(id, name, dateOfBirth, branch);
        this.rewardPoint = 1000;
    }

    public void increaseRewardPoint(int point){
        this.rewardPoint = this.rewardPoint + point;
    }

    public int getRewardPoint(){
        return this.rewardPoint;
    }

    public void deductRewardPoint(int point){
        this.rewardPoint = this.rewardPoint - point;
    }
}
