package Proxy;

public class Client {

    public static void main(String [] args){
        UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("0001","bing");
    }
}
