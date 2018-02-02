package utils;

import model.User;

import java.util.HashMap;
import java.util.Map;

public class ValidationUtil {

    public static final String WRONG_EMAIL = "wrong_email";
    public static final String WRONG_USER_NAME = "wrong_user_name";
    public static final String WRONG_USER_SURNAME = "wrong_user_surname";
    public static final String WRONG_LOGIN = "wrong_login";
    public static final String WRONG_PASS = "wrong_password";


    static public Map<String, String> validateUser(User user) {
        Map<String, String> errors = new HashMap<>();
        if(user.getFirstName() == null && !user.getFirstName().matches("/^[A-Za-z0-9 ]{2,40}$/")){
        errors.put(WRONG_USER_NAME, Messages.USER_NAME);
        }
        else if(user.getLastName() == null && !user.getLastName().matches("/^[A-Za-z0-9 ]{4,20}$/")){
            errors.put(WRONG_USER_SURNAME, Messages.USER_SURNAME);
        }
        else if(user.getEmail() == null && !user.getEmail().matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@+(\\.[A-Za-z0-9]+)" +
                "*(\\.[A-Za-z]{2,})$")){
            errors.put(WRONG_EMAIL, Messages.EMAIL);
        }
        else if(user.getLogin() == null && !user.getLogin().matches("[A-z0-9]{4,20}")){
            errors.put(WRONG_LOGIN, Messages.WRONG_LOG);
        }
        else if(user.getPassword() == null && !user.getPassword().matches("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$\"")){
            errors.put(WRONG_PASS, Messages.WRONG_PASS);
        }

        return errors;
    }
}
