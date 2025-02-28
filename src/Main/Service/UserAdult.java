package Main.Service;

import Main.Data.UserData;

public class UserAdult extends UserData implements UserValidationAdult {
    @Override
    public void validationUser() {
        System.out.println("Gerando validações do usuário");
    }

}
