package creational.factorymethod;

public class DefaultConfig implements  IDefaultSystemConfiguration{

    @Override
    public int getNumberOfElements() {
        return 100;
    }
}
