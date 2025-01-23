package cmd1;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        PropertyReader propertyReader = new PropertyReader(new File("C:/Users/Eissa/OneDrive/Desktop/cofing.json"));


        String login = propertyReader.getProperty("login");
        String password = propertyReader.getProperty("password");
        String url = propertyReader.getProperty("url");
        String port = propertyReader.getProperty("port");


        System.out.println("Login: " + login);
        System.out.println("Password: " + password);
        System.out.println("URL: " + url);
        System.out.println("Port: " + port);
    }
}
