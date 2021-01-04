package banking;

public class Bank {
    public void start_banking(){
        Account sifat=new Account("Sifat Sikder", "01987959788", "1234");

        sifat.add_money(1500);
        sifat.cash_out(1000,"1234");
        System.out.println(sifat);
        sifat.cash_out(2000,"1234");

        Account abir=new Account("Abir Sarkar", "01836543813");

        abir.add_money(3000);
        abir.set_pin("1234");
        abir.cash_out(2000,"1234");

        System.out.println(abir.toString());
        String sifat_pin="1234";
        if(sifat.pin_update("1234", "1122")){
            sifat_pin="1122";
        }


    }

}
