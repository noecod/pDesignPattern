package creational.objectpool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {

    private ConcurrentLinkedQueue<T> pool;
    private ScheduledExecutorService executorService;

    /**
     * Creates the pool.
     *
     * @param minIdle Minimum number of objects residing in the pool.
     */
    public ObjectPool(final int minIdle) {

        // initialize pool
        initialize(minIdle);
    }

    /**
     * Creates the pool.
     *
     * @param minIdle            Minimum number of objects residing in the pool
     * @param maxIdle            Maximum number of objects residing in the pool
     * @param validationInterval Time in seconds for periodical checking of minIdle / maxIdle conditions in a separate
     *                           thread. When the number of objects is less than minIdle, missing instances will be
     *                           created. When the number of objects is greater than maxIdle, too many instances
     *                           will be removed.
     */
    public ObjectPool(final int minIdle, final int maxIdle, final long validationInterval) {

        // initialize pool
        initialize(minIdle);

        // check pool conditions in a separate thread
        executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new Runnable() {

            @Override
            public void run() {
                int size = pool.size();
                if (size < minIdle) {
                    int sizeToBeAdded = minIdle - size;
                    for (int __ = 0; __ < sizeToBeAdded; __++) {
                        pool.add(createObject());
                    }
                } else if (size > maxIdle) {
                    int sizeToBeRemoved = size - maxIdle;
                    for (int __ = 0; __ < sizeToBeRemoved; __++) {
                        pool.poll();
                    }
                }
            }
        }, validationInterval, validationInterval, TimeUnit.SECONDS);
    }

    /**
     * Gets the next free object from the pool. If the pool doesn't contain any objects, a new object will be created
     * and returned.
     *
     * @return T borrowed object
     */
    public T borrowObject() {
        T object = pool.poll();
        if (object == null) {
            object = createObject();
        }
        return object;
    }

    /**
     * Returns object back to the pool.
     *
     * @param object object to be returned
     */
    public void returnObject(T object) {
        if (object != null) {
            pool.offer(object);
        }
    }

    /**
     * Shutdown this pool.
     */
    public void shutdown() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /**
     * Creates a new object.
     *
     * @return T new object
     */
    protected abstract T createObject();

    private void initialize(final int minIdle) {
        pool = new ConcurrentLinkedQueue<>();
        for (int __ = 0; __ < minIdle; __++) {
            pool.add(createObject());
        }
    }
}
