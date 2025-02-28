package Main.Data;

import java.util.Scanner;

public abstract class UserData {
    private String userName;
    private int userAge;
    private String userGender;

    Scanner userInput = new Scanner(System.in);
    public void readUsername(){
        System.out.println("Digite seu nome: ");
        String userNameIn = userInput.nextLine();
        setUserName(userNameIn);
    }

    public void readUserAge(){
        System.out.println("Digite sua idade: ");
        int userAgeIn = userInput.nextInt();
        setUserAge(userAgeIn);
    }

    public void readUserGender(){
        System.out.println("Digite seu gênero: ");
        String userGenderIn = userInput.nextLine();
        setUserGender(userGenderIn);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }
}
