package creational.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItalianProductFactoryTest {

    AbstractProductFactory pf;

    @BeforeEach
    public void setup() {
        this.pf = new ItalianProductFactory();
    }

    @Test
    public void testGetItalianProductFactory() {
        assertEquals(this.pf.getClass(), ItalianProductFactory.class);
    }

    @Test
    public void testCreateQuattroStagioni() {
        final AbstractPizza p = this.pf.createQuattroStagioni();
        assertEquals(p.getClass(), QuattroStagioniItalian.class);
    }

    @Test
    public void testCreateNapoli() {
        final AbstractPizza p = this.pf.createNapoli();
        assertEquals(p.getClass(), NapoliItalian.class);
    }

    @Test
    public void testCreateCoffee() {
        final AbstractCoffee c = this.pf.createCoffee();
        assertEquals(c.getClass(), CoffeeItalian.class);
    }
}