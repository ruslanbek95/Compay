import company.serv.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService= new UserServiceImpl();
        userService.addNewUser("Bektut",24);
        userService.addNewUser("Haadi",24);
        userService.addNewUser("Ruslan ",24);
        userService.userOll();
        System.out.println("------------------------");
        try {
        userService.idFind(2);
        userService.idDelete(3);
        userService.userOll();
        userService.idFind(2);
        } catch (Exception e) {
            System.out.println("Exseption karmaldy");
        }

        System.out.println("HELLO");


    }
}