package creational.objectpool;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;
    private int threadNo;

    @Override
    public void run() {
        // get an object from the pool
        ExportingProcess exportingProcess = pool.borrowObject();

        System.out.println("Thread " + threadNo + ": Object with process no. "
                + exportingProcess.getProcessNo() + " was borrowed");

        // do something
        // ...

        // for-loop is just for simulation
        for (int __ = 0; __ < 100_000; __++) {
            // do nothing
        }

        // return ExportingProcess instance back to the pool
        pool.returnObject(exportingProcess);

        System.out.println("Thread " + threadNo + ": Object with process no. "
                + exportingProcess.getProcessNo() + " was returned");
    }
}
