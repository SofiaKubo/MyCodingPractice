package tessting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 0) < 0);
    }

    @Test
    public void shouldReturn200ForBikeAndDistanceIs20Km() {
        Integer priceActual = priceCalculator.calculatePrice(TransportType.BIKE, 20);
        Assertions.assertEquals(Integer.valueOf(200), priceActual);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 21) < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 0) < 0);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
        Integer priceActual = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(Integer.valueOf(7000), priceActual);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 1001) < 0);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.TRUCK, 0) < 0);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        Integer priceActual = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);
        Assertions.assertEquals(Integer.valueOf(5000), priceActual);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        Assertions.assertNull(priceCalculator.calculatePrice(TransportType.DRONE, 0));
    }
}
