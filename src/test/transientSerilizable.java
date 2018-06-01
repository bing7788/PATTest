package test;

import java.io.*;

public class transientSerilizable {

    public static void main(String[] args){
        User user = new User();
        user.setUsername("linbing");
        user.setPasswd("123456");

        System.out.println("----before read-----");
        System.out.println("username:"+user.getUsername());
        System.out.println("password:"+user.getPasswd());

    //序列化写入磁盘
        try {
            ObjectOutputStream os =  new ObjectOutputStream(new FileOutputStream("/Users/bing/Desktop/Java/info.txt"));
            os.writeObject(user);
            os.flush();
            os.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    //反序列化读取
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("/Users/bing/Desktop/Java/info.txt"));
            user = (User)is.readObject();
            is.close();
            System.out.println("-----after read-----");
            System.out.println("username:"+user.getUsername());
            System.out.println("password:"+user.getPasswd());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}



class User implements Serializable{

    private static final long serialVersionUID = 8294180014912103005L;

    private String username;
    private transient String passwd;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}