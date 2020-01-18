package patterns.structural.adapter.wrapper;

import patterns.structural.adapter.interfaces.Car;
import patterns.structural.adapter.interfaces.Track;


//It`s my wrapper which transform my truck in car and we can use it for Car Washing
public class TrackWrapper implements Car {
    Track track;

    public TrackWrapper(Track track) {
        this.track = track;
    }

    @Override
    public void wash() {
        track.clean();
    }
}
