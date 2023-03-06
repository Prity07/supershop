package com.company.meena_Bazar;

public class LoyalCustomer extends Customer {
    private int rewardPoint;
    public LoyalCustomer(int id, String name, String dob, Branch branch) {
        super(id, name, dob, branch);
        this.rewardPoint=1000;
    }

    public int getRewardPoint() {
        return rewardPoint;
    }

    public void increaseRewardPoint(int point){
        this.rewardPoint = this.rewardPoint + point;
    }

    public void decreaseRewardPoint(int point){
        this.rewardPoint = this.rewardPoint - point;

    }
}
