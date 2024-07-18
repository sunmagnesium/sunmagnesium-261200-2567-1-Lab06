import java.time.LocalDate;

public class Admin extends User {

    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int dayOfMonth) {
        super(name, year, month, dayOfMonth);
    }

    public void doSomething() {
        LocalDate today = LocalDate.now();
        
        if (today.getDayOfMonth() == super.getDob().getDayOfMonth() &&
            today.getMonth() == super.getDob().getMonth() &&
            today.getYear() == super.getDob().getYear()) {
            System.out.println("Happy birthday Admin!");
        } else {
            System.out.println("Hello admin " + super.getName() + "!");
        }
    }

    public void doSomething(int n) {
        for (int i = 0; i < n; i++) {
            doSomething();
        }
    }
}
