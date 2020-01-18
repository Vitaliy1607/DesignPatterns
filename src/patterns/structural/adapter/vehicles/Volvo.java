package patterns.structural.adapter.vehicles;

import patterns.structural.adapter.interfaces.Track;

public class Volvo implements Track {
    @Override
    public void clean() {
        System.out.println("track is cleaning");
    }
}
