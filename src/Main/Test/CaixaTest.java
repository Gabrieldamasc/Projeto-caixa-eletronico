package Main.Test;

import Main.Data.UserData;
import Main.Service.UserAdult;
import Main.Service.UserLess18;

public class CaixaTest {
    public static void main(String[] args) {
        UserLess18 user1Less18 = new UserLess18();
        UserAdult user1Adult = new UserAdult();

        user1Less18.userLess18Wrap();

    }


}
