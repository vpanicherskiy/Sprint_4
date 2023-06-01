import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.praktikum.MainPageObject;
import ru.praktikum.enums.FaqList;

public class DropDownList extends BaseTest {

    @ParameterizedTest
    @EnumSource(FaqList.class)
    public void checkFaq(FaqList faqList) {
        new MainPageObject(faqList, driver)
                .clickDropdownButton()
                .checkDropDownElementText();
    }
}

