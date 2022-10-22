package creational.factorymethod;

/**
 * System configuration parameters
 */
public interface ISystemConfiguration {

    /**
     * Display title
     *
     * @return title
     */
    String getTitle();

    /**
     * Shown description in about menu
     *
     * @return description
     */
    String getDescription();

    /**
     * Height of display
     *
     * @return height
     */
    int getHeight();

    /**
     * Width of display
     *
     * @return width
     */
    int getWidth();

    /**
     * Number of moving elements
     *
     * @return number of elements
     */
    int getNumberOfElements();
}
