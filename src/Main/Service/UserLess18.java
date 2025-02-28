package Main.Service;

import Main.Data.UserData;

public class UserLess18 extends UserData implements UserValidationLess18{
    @Override
    public void UserLess18() {
        System.out.println("Gerando validações especiais para usuário menor de 18 anos");
    }
}
