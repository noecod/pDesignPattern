package creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AmericanProcuctFactoryTest {

    AbstractProductFactory pf;

    @BeforeEach
    public void setup() {
        this.pf = new AmericanProductFactory();
    }

    @Test
    public void testAmericanProductFactory() {
        assertEquals(this.pf.getClass(), AmericanProductFactory.class);
    }

    @Test
    public void testCreateQuattroStagioni() {
        final AbstractPizza p = this.pf.createQuattroStagioni();
        assertEquals(p.getClass(), QuattroStagioniAmerican.class);
    }

    @Test
    public void testCreateNapoli() {
        final AbstractPizza p = this.pf.createNapoli();
        assertEquals(p.getClass(), NapoliAmerican.class);
    }

    @Test
    public void testCreateCoffee() {
        final AbstractCoffee c = this.pf.createCoffee();
        assertEquals(c.getClass(), CoffeeAmerican.class);
    }
}