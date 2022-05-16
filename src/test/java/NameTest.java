import io.qameta.allure.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class NameTest {

    @Parameterized.Parameter
    public String fullName;

    @Parameterized.Parameter(1)
    public boolean expected;

    @Parameterized.Parameters(name = "name = {0}, expected result= {1}")
    public static Collection<Object[]> dataParameters() {
        return Arrays.asList(new Object[][]{
                {"л з", false},
                {"гф", false},
                {"Ещ", false},
                {"Л с", false},
                {"п О", false},
                {" О ", false},
                {"поликарпий серый", false},
                {"афанасий Кузнецов", false},
                {"Сергий окраинный", false},
                {"Пафнутий Золотоколоконный", false},
                {" Светлана Сергеева", false},
                {"Keanu Reeves ", false},
                {"Tomb Raider", true},
                {"А Л", true},
                {"Ян Сухово-Кобылин", true},
                {"Катерина Ревзина", true},
        });
    }

    @Description("substitution of various values to check the Account class")
    @Test
    public void parameterizedTest() {
        Account account = new Account(fullName);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}
