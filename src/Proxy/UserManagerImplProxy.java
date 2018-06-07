package Proxy;

public class UserManagerImplProxy implements UserManager {

    private UserManager userManager;

    public UserManagerImplProxy(UserManager userManager){
        this.userManager = userManager;
    }


    @Override
    public void addUser(String userId, String userName) {
        userManager.addUser(userId, userName);
    }

    @Override
    public void delUser(String userId) {
        userManager.delUser(userId);
    }

    @Override
    public String findUser(String userId) {
        return userManager.findUser(userId);
    }

    @Override
    public void modifyUser(String userId, String userNameString) {
        userManager.modifyUser(userId, userNameString);
    }
}
