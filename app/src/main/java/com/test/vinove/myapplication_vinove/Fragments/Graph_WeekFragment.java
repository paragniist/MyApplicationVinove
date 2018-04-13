package com.test.vinove.myapplication_vinove.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.test.vinove.myapplication_vinove.R;


public class Graph_WeekFragment extends android.support.v4.app.Fragment {

    GraphView graphView;
    GridLabelRenderer gridLabel;
    LineGraphSeries<DataPoint> series;
    StaticLabelsFormatter staticLabelsFormatter;
    View view;

    public Graph_WeekFragment() {


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.week, container, false);

        graphView = view.findViewById(R.id.weekGraph);

        series = new LineGraphSeries<>(getDataPoint());
        graphView.getGridLabelRenderer().setGridStyle(GridLabelRenderer.GridStyle.HORIZONTAL);
        graphView.getViewport().setXAxisBoundsManual(true);
        graphView.getViewport().setMinX(1);
        graphView.getViewport().setMaxX(7);


        gridLabel = graphView.getGridLabelRenderer();
        gridLabel.setHorizontalAxisTitle("This Screen Is Under Construction");
        //graphView.setHorizontalLabels(new String[] {"2 days ago", "yesterday", "today", "tomorrow"});


        staticLabelsFormatter = new StaticLabelsFormatter(graphView);
        staticLabelsFormatter.setHorizontalLabels(new String[]{"S", "M", "T", "W", "T", "F", "S"});
//        staticLabelsFormatter.setVerticalLabels(new String[] {"low", "middle", "high"});
        graphView.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

        graphView.addSeries(series);

        series.setColor(Color.WHITE);
        series.setThickness(6);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(9);

        return view;

    }

    private DataPoint[] getDataPoint() {
        DataPoint[] dp = new DataPoint[]
                {
                        new DataPoint(0, 0.0),
                        new DataPoint(1, 0.0),
                        new DataPoint(1.6, 0.7),
                        new DataPoint(4.0, 1.6),
                        new DataPoint(5.4, 2),
                        new DataPoint(6.4, 2)
                };
        return dp;


    }
}