package Exercicio.model.entities;

import Aula.model.exeption.DomainExeption;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double witdrawLimit;

    protected Account(Integer number, String holder, Double balance, Double witdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.witdrawLimit = witdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getLimit() {
        return witdrawLimit;
    }

    public void setLimit(Double limit) {
        this.witdrawLimit = limit;
    }

    public void witdraw(double witdrawValue) throws DomainExeption {
        if (witdrawValue > balance){
            throw new DomainExeption("Erro de saque: Saldo insuficiente.");
        }
        if (witdrawValue > witdrawLimit){
            throw new DomainExeption("Erro de saque: Limite de saque insuficente.");
        }
        balance -= witdrawValue;
        System.out.println("Novo saldo: " + String.format( "%.2f",balance));
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", limit=" + witdrawLimit +
                '}';
    }
}
