import java.util.*;

public class BankDetails {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.getAccountDetails(101, "Abhishek", "22010101212@darshan.ac.in", 'S', 1000);
        b1.displayAccountDetails();
    }
}

class BankAccount {
    int actNo;
    String userName;
    String email;
    char actType;
    double actBalance;

    BankAccount() {
        actNo = 0;
        userName = "Undefined";
        email = "Not Defined By User";
        actType = 'S';
        actBalance = 0;
    }

    public void getAccountDetails(int actNo, String userName, String email, char actType, double actBalance) {
        this.actNo = actNo;
        this.userName = userName;
        this.email = email;
        this.actType = actType;
        if (actBalance >= 1000) {
            this.actBalance = actBalance;
        }
    }

    public void displayAccountDetails() {
        if (actBalance < 1000) {
            System.out.println("\nYour Account Balance Is Less" + actBalance
                    + "\nAccount Balance Has Be Blocked Pls Contact Nearest Branch");
        } else {
            System.out.println(
                    "Account No. :" + actNo + "\nUser Name:" + userName + "\nEmail:" + email + "\nAccount Type:"
                            + actType + "\nAccount Balance:" + actBalance);
        }

    }
}
