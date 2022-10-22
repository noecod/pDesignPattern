package creational.factorymethod;

public interface IDefaultSystemConfiguration extends ISystemConfiguration {

    @Override
    default String getTitle() {
        return "no title set";
    }

    @Override
    default String getDescription() {
        return "no description set";
    }

    @Override
    default int getHeight() {
        return 480;
    }

    @Override
    default int getWidth() {
        return 640;
    }
}
