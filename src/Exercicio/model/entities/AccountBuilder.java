package Exercicio.model.entities;

public class AccountBuilder {

    private Integer number;
    private String holder;
    private Double balance;
    private Double witdrawLimit;

    public AccountBuilder number(Integer number){
        this.number = number;
        return this;
    }
    public AccountBuilder holder(String holder){
        this.holder = holder;
        return this;
    }
    public AccountBuilder balance(Double balance){
        this.balance = balance;
        return this;
    }
    public AccountBuilder witdrawLimit(Double witdrawLimit){
        this.witdrawLimit = witdrawLimit;
        return this;
    }
    public Account build(){
        return new Account(number,holder,balance,witdrawLimit);
    }
}
