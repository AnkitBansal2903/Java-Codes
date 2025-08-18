package inbuild.Example.Encapsulation.Second;

public class Costomer {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("001" , "Ankit Bansal");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }
}
