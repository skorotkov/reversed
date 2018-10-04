package fi.polar.polarflow.sensor.fusedgps;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedQueue<T> extends ConcurrentLinkedQueue<T> {
    private int mSizeBound;
    public BoundedQueue(int sizeBound) {
        mSizeBound = sizeBound;
    }

    @Override
    public boolean add(T o) {
        if (this.size() == mSizeBound)
            remove();
        return super.add(o);
    }
}
