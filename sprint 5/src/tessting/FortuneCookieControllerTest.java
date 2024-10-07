package tessting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class FortuneCookieControllerTest {
    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    static void beforeAll() {
        goodFactoryController = create(true);
        badFactoryController = create(false);
    }

    private static FortuneCookieController create(boolean isPositive) {
        FortuneConfig config = new FortuneConfig(isPositive);

        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        FortuneCookieFactory factory = new FortuneCookieFactory(config, positive, negative);
        return new FortuneCookieController(factory);
    }

    @Test
    public void shouldReturnPositiveFortune() {
        FortuneCookie cookie = goodFactoryController.tellFortune();
        assertEquals("positive", cookie.getFortuneText());
    }

    @Test
    public void shouldReturnNegativeFortune() {
        FortuneCookie cookie = badFactoryController.tellFortune();
        assertEquals("negative", cookie.getFortuneText());
    }
}
