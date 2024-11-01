package creational.objectpool;

import lombok.Getter;

@Getter
public class ExportingProcess {

    private final String location;
    private long processNo = 0;

    public ExportingProcess(String location, long processNo) {
        this.location = location;
        this.processNo = processNo;

        // doing some time expensive calls / tasks
        // ...

        // for-loop is just for simulation
        for (int __ = 0; __ < Integer.MAX_VALUE; __++) {
            // do nothing
        }

        System.out.println("Object with process no. " + processNo + " was created");
    }
}
