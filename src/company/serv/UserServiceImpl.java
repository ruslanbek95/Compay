package company.serv;

import company.exsep.Exseption;
import company.model.User;
import company.dao.UserDao;

public class UserServiceImpl implements AbleUserService {

    UserDao userDao = new UserDao();
    @Override
    public void addNewUser(String name, int age) {
        User user1 = new User(name, age);
        userDao.getArrayList().add(user1);
    }

    @Override
    public void idFind(int id) {
        for (User r : userDao.getArrayList()) {
            if (r.getId() == id) {
                System.out.println(r);
            }
        }
    }

    @Override
    public void idDelete(int id) {
        boolean isFound = false;
        for (int i = 0; i < userDao.getArrayList().size(); i++) {
            if (userDao.getArrayList().get(i).getId() == id) {
                userDao.getArrayList().remove(i);
                isFound = true;
            }
        }
        if (isFound) throw new Exseption("Введи правильный id");

    }

    @Override
    public void userOll() {
        for (User r : userDao.getArrayList()) {
            System.out.println(r);

        }

    }
}
