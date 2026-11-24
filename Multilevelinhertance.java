class Account {
    int accountNumber;
    void showAccount(){
        System.out.println( "AccountNumber" + accountNumber);
    }
}
class savingAccount extends Account{
    double interestRate;
    void showSavingDetails(){
    System.out.println("IntrestRate"+ interestRate);  
    }
}
class FixedDepositAccount extends savingAccount {
    int lockInYears;
    void showFDDetails(){
        System.out.println("LockInYears" +lockInYears);
    }
}
class Multilevelinhertance{
    public static void main(String[] args) {
        FixedDepositAccount fd = new FixedDepositAccount();

        fd.accountNumber=234567;
        fd.interestRate= 7.5;
        fd.lockInYears = 2;

        fd.showAccount();
        fd.showSavingDetails();
        fd.showFDDetails(); 
    }

}