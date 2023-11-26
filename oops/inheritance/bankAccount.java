package oops.inheritance;

public class bankAccount {
    public static void main(String[] args) {
       
    }
}
class account{
    public int accountNumber;
    public String name;
    public String address;
    public long phoneNumber; 
    public String dob;
    public double balance;
    
    public int getAccountNumber(){return accountNumber;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public long getPhoneNumber(){return phoneNumber;}
    public String getDOB(){return dob;}
    public double getBalance(){return balance;}

    public void setAccountNumber(int acc){
        accountNumber = acc;
    }
    public void setName(String naam){
        name = naam;
    }
    public void setAddress(String add){
        address = add;
    }
    public void setPhoneNumber(long phNo){
        phoneNumber = phNo;
    }
    public void setDOB(String dob){
        this.dob = dob;
    }
    public void setBalance(double bal){
        balance = bal;
    }
}

class savings extends account{
    public void deposit(double dep){
        balance = balance + dep;
    }
    public void withdraw(double wthdrw){
        balance = balance - wthdrw;
    }
    public void fixedDeposit(double fd){
        balance = fd;
    }
}

class loanAccount extends account{
    public void payEMI(double emi){
        balance = balance - emi;
    }
    public void topUpLoan(double tl){
        balance = balance + tl;
    }
    public void repayment(double repay){
        balance = balance - repay;
    }
}



