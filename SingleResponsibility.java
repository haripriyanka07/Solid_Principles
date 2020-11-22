package com.solidprinciples;
class SignUp{
    public SignUp(){
        System.out.println("Sign UP");
    }
}
class Login{
    public Login(){
        System.out.println("Login");
    }
}
class Dashboard{
    public Dashboard(){
        System.out.println("Welcome to dashboard");
    }
}
class newUser{
    SignUp su = new SignUp();
    Login l = new Login();
    Dashboard d = new Dashboard();
}
class User{
    Login l = new Login();
    Dashboard d = new Dashboard();
}
public class SingleResponsibility {
    public static void main(String[] args) {
        User u = new User();
    }
}