package com.codeclan.example.toprubgygrounds;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopGrounds {

    private ArrayList<Ground> list;

    public TopGrounds() {
        list = new ArrayList<Ground>();
        list.add(new Ground(1, "FNB Stadium", 94_736));
        list.add(new Ground(2, "ANZ Stadium", 84_000));
        list.add(new Ground(3, "Twickenham Stadium", 82_000));
        list.add(new Ground(4, "Stade de France", 81_338));
        list.add(new Ground(5, "Principality Stadium", 74_500));
        list.add(new Ground(6, "Stadio Olimpico", 73_000));
        list.add(new Ground(7, "Murrayfield Stadium", 67_800));
        list.add(new Ground(8, "Ellis Park Stadium", 62_567));
        list.add(new Ground(9, "Stade Velodrome", 60_013));
        list.add(new Ground(10, "Etihad Stadium", 56_347));
    }

    public ArrayList<Ground> getList() {
        return new ArrayList<Ground>(list);
    }

}
