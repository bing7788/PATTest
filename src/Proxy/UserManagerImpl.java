package Proxy;

public class UserManagerImpl implements UserManager {
    @Override
    public void addUser(String userId, String userName) {
        System.out.println("UserManagerImpl.addUser()  userId-->>" + userId);
    }

    @Override
    public void delUser(String userId) {
        System.out.println("UserManagerImpl.delUser() userId-->>" + userId);
    }

    @Override
    public String findUser(String userId) {
        System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
        return null;
    }

    @Override
    public void modifyUser(String userId, String userNameString) {
        System.out.println("UserManagerImpl.modifyUser() userId-->>" + userId);
    }
}
