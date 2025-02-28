package Main.Data;

import java.util.Scanner;

public abstract class UserData {
    private String userName;
    private int userAge;
    private String userGender;

    public void readUsername() {
        System.out.println("Digite seu nome: ");
    }

    public void readUserAge() {
        System.out.println("Digite sua idade: ");
    }

    public void readUserGender() {
        System.out.println("Digite seu gênero: ");
    }
}
