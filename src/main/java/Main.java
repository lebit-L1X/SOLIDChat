import com.solidchat.model.user.valueobject.Password;

public class Main {
    public static void main(String[] args) {
        Password pw = new Password("Abc123@x");
        System.out.println(pw);
    }
}
