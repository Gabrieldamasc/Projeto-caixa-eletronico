package Main.Service;

import Main.Data.UserData;

import java.util.Scanner;

public class UserLess18 extends UserData implements UserValidationLess18 {
    public void userLess18Wrap() {
        readUsername();
        readUserAge();
        readUserGender();
    }

    @Override
    public void UserLess18Validation() {
        System.out.println("Gerando validações especiais para usuário menor de 18 anos");
    }

    Scanner userInput = new Scanner(System.in);

    @Override
    public void readUsername() {
        super.readUsername();
        String userNameIn = userInput.nextLine();
    }

    @Override
    public void readUserAge() {
        super.readUserAge();
        int userAgeIn = userInput.nextInt();
    }

    @Override
    public void readUserGender() {
        super.readUserGender();
        String userGenderIn = userInput.nextLine();
    }
}
