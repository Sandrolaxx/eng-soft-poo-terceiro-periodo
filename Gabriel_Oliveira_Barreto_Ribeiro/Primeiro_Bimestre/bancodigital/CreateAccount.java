package Gabriel_Oliveira_Barreto_Ribeiro.bancodigital;
public class CreateAccount {

    private int accountID;
    private String name;
    private String document;
    private String phone;
    private String email;
    private String password;
    private double balance;

    public CreateAccount(int accountID, String name, String document, String phone, String email, String password) {
        this.accountID = accountID;
        this.name = name;
        this.document = document;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(double deposit) {
        balance += deposit;
    }

    public void pay(double deposit) {
        balance -= deposit;
    }

}