package sofka.clase.cuentabancaria;

import java.util.ArrayList;
import java.util.List;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(true);
        BankAccount bankAccount1 = new BankAccount(001,true);
        BankAccount bankAccount3 = new BankAccount();
        BankAccount bankAccount4 = new BankAccount();
        List<BankAccount> accounts = new ArrayList<>();
        System.out.println(bankAccount);
        System.out.println(bankAccount1);
        accounts.add(bankAccount);
        accounts.add(bankAccount1);
        for (BankAccount bankAccount2 : accounts){
            System.out.println(bankAccount2);
        }
        bankAccount3.setActivated(false);
        bankAccount4.setActivated(true);

        System.out.println(bankAccount3.isActivated());
        System.out.println(bankAccount4.isActivated());
    }
}
