package com.codeclan.example.toprubgygrounds;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 24/05/2017.
 */

public class TopGroundsAdapter extends ArrayAdapter<Ground> {

    public TopGroundsAdapter(Context context, ArrayList<Ground> grounds) {
        super(context, 0, grounds);
    }

    // We need to override the parent class's getView method

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView ==  null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.grounds_item, parent, false);
        }

        Ground currentGround = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentGround.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.groundName);
        name.setText(currentGround.getName());

        TextView capacity = (TextView) listItemView.findViewById(R.id.groundCapacity);
        capacity.setText(currentGround.getCapacity().toString());

        listItemView.setTag(currentGround);

        return listItemView;

    }


}
