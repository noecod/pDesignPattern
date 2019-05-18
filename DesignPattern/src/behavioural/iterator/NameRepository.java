package behavioural.iterator;

import java.util.Arrays;

public class NameRepository implements IContainer {

    public String[] names = { "Robert", "John", "Julie", "Lora" };

    @Override
    public IIterator getIterator() {
        return new NameIterator();
    }

    @Override
    public IIterator getSortedIterator() {
        return new NameSortedIterator();
    }
    
    private abstract class AbstractNameBaseIterator implements IIterator {
        int index = 0;
        String[] localListCopy = names;
        
        public AbstractNameBaseIterator() {
            initialize();
        }
        
        abstract void initialize();

        @Override
        public boolean hasNext() {
            if (index < localListCopy.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return localListCopy[index++];
            }
            return null;
        }
    }

    private class NameIterator extends AbstractNameBaseIterator {

        @Override
        void initialize() {
            // do nothing
        }
    }

    private class NameSortedIterator extends AbstractNameBaseIterator {

        @Override
        void initialize() {
            Arrays.sort(localListCopy);
        }
    }
}
