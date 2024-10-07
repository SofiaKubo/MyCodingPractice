package tessting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieFactoryTest {
    private FortuneConfig config;
    private FortuneCookieFactory factory;

    @BeforeEach
    public void beforeEach() {
        config = new FortuneConfig(true);

        ArrayList<String> positive = new ArrayList<>();
        positive.add("positive");
        ArrayList<String> negative = new ArrayList<>();
        negative.add("negative");
        factory = new FortuneCookieFactory(config, positive, negative);
    }

    @Test
    public void shouldIncrementCountByOneAfterOneCookieBaked() {
        factory.bakeFortuneCookie();
        assertEquals(Integer.valueOf(1), factory.getCookiesBaked());
    }

    @Test
    public void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();
        assertEquals(Integer.valueOf(2), factory.getCookiesBaked());
    }

    @Test
    public void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        factory.bakeFortuneCookie();
        assertEquals(Integer.valueOf(1), factory.getCookiesBaked());
        factory.resetCookiesCreated();
        assertEquals(Integer.valueOf(0), factory.getCookiesBaked());
    }
}