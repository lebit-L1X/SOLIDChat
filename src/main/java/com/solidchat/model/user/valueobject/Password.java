package com.solidchat.model.user.valueobject;

import java.util.regex.Pattern;
import org.apache.commons.lang3.Validate;

public class Password implements IValueObject<Password> {
    private final String value;
    private static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
    private static final Pattern REGEX_PATTERN = Pattern.compile(REGEX_PASSWORD, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean sameValueAs(Password other) {
        return other.value.equals(this.value);
    }

    @Override
    public String toString(Password object) {
        return value;
    }

    public static Password createPassword(String password) {
        Validate.isTrue(validatePassword(password), "Invalid password");
        return new Password(password);
    }

    private Password(String password) {
        this.value = password;
    }

    private static boolean validatePassword(String password) {
        Validate.notNull(password, "Password must not be null");
        return REGEX_PATTERN.matcher(password).matches();
    }


}
