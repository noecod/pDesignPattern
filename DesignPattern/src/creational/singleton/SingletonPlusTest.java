package creational.singleton;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;


public class SingletonPlusTest {

    @Test
    void callSingletoTwice() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        assertThat(s1, is(s2));
    }

    @Test
    void callLoggerTwice() {
        FileLogger l1 = FileLogger.getFileLogger();
        FileLogger l2 = FileLogger.getFileLogger();
        assertThat(l1, is(l2));
    }
}
