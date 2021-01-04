package banking;

public class Account {
    private String customer_name;
    private String mobile_number;
    private double balance;
    private String pin;

    public void add_money(double amount){
        balance += amount;
    }
    public void cash_out(double amount, String pin)  {
        if (pin == this.pin) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Cash out: " + amount);
            } else {
                System.out.println("Cannot be able to cash out due to insufficient balance");
            }
        }
        else{
            System.out.println("Your Pin number is Wrong");
            return;
        }
    }

    public String show_customer_name(){
        return customer_name;
    }
    public String show_mobile_number(){
        return mobile_number;
    }
    public double show_balance(){
        return balance;
    }

    public Account(String customer_name, String mobile_number, String pin){
        this.customer_name=customer_name;
        this.mobile_number=mobile_number;
        this.pin=pin;
    }

    public Account(String customer_name, String mobile_number){
        this.customer_name=customer_name;
        this.mobile_number=mobile_number;
    }
    public boolean pin_update(String old_pin, String new_pin){
        if (old_pin==this.pin){
            this.pin=new_pin;
            System.out.println("Pin updated "+ pin_print());
            return true;
        }
        else{
            System.out.println("Pin does not match "+ pin_print());
            return false;
        }
    }

    private String pin_print(){
        return  " "+ this.customer_name + " pin " + this.pin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer_name='" + customer_name + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void set_pin(String pin){
        this.pin=pin;
        System.out.println("Pin Set successful");

}



}
