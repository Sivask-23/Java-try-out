//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package bank;
class Account{
    public String name; // public
    protected String email; // default

    private String password; // to access this we use setter and getters and should be define in the class itself

    // getters and setters

    public void setPassword(String pass){
        this.password=pass;
    }
    public String getPassword(){
        return password;
    }
}
public class Bank {
    public static void main(String[] args){
        Account ac1=new Account();
        ac1.name="Siva";
        System.out.println(ac1.name);
        ac1.email="sk@gmail.com";
        System.out.println(ac1.email);
        ac1.setPassword("abc");
        System.out.println(ac1.getPassword());

    }
}
