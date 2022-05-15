import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    private static final String USERNAME_PATTERN =
            "^(?=.{3,19}$)([A-ZА-ЯЁ][a-zа-яёA-ZА-ЯЁ-]{0,17})+([\\s](?![\\s]))+([A-ZА-ЯЁ][a-zа-яёA-ZА-ЯЁ-]{0,17})";

    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public boolean checkNameToEmboss() {
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
}
