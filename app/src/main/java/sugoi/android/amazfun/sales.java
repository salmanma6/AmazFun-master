package sugoi.android.amazfun;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

public class sales extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphs);
        BarChart bb=(BarChart)findViewById(R.id.barchart);
        TextView tt=(TextView)findViewById(R.id.graphhead);
        tt.setText("Total Sales in year 2017");
        MaterialSearchView materialSearchView=(MaterialSearchView)findViewById(R.id.search_viewingrh);
        materialSearchView.setVisibility(View.INVISIBLE);
        FrameLayout fm=(FrameLayout)findViewById(R.id.toolbar_container);
        fm.setVisibility(View.GONE);
        ArrayList<BarEntry> barEntryArrayList=new ArrayList<>();
        barEntryArrayList.add(new BarEntry(80f,0));
        barEntryArrayList.add(new BarEntry(260f,1));
        barEntryArrayList.add(new BarEntry(120f,2));
        barEntryArrayList.add(new BarEntry(320f,3));
        barEntryArrayList.add(new BarEntry(130f,4));
        barEntryArrayList.add(new BarEntry(90f,5));
        barEntryArrayList.add(new BarEntry(30f,6));
        barEntryArrayList.add(new BarEntry(190f,7));
        BarDataSet barDataSet=new BarDataSet(barEntryArrayList,"    Months");
        TypedArray ta = getApplicationContext().getResources().obtainTypedArray(R.array.forgraph);
        int[] colors = new int[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            colors[i] = ta.getColor(i, 0);
        }
        barDataSet.setColors(colors);
        ArrayList<String> states=new ArrayList<>();
        states.add("Jan");
        states.add("Feb");
        states.add("Mar");
        states.add("Apr");
        states.add("May");
        states.add("Jun");
        states.add("July");
        states.add("Aug");
        BarData barData=new BarData(states,barDataSet);
        barData.setGroupSpace(4f);
        bb.setData(barData);
        bb.setScaleEnabled(false);
        bb.setTouchEnabled(true);
        bb.setDragEnabled(true);
        bb.setDescription("");
        XAxis xAxis = bb.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10f);
        xAxis.setTextColor(Color.BLACK);
        xAxis.setDrawAxisLine(true);
        xAxis.setDrawGridLines(false);
        bb.animateY(1500);
        //for pie chart
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(80f,0));
        entries.add(new Entry(260f,1));
        entries.add(new Entry(120f,2));
        entries.add(new Entry(320f,3));
        entries.add(new Entry(130f,4));
        entries.add(new Entry(90f,5));
        entries.add(new Entry(30f,6));
        entries.add(new Entry(190f,7));
        PieChart pieChart=(PieChart)findViewById(R.id.piiechart);
        PieDataSet dataset = new PieDataSet(entries, " ");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        labels.add("August");
        PieData data = new PieData(labels, dataset);
        dataset.setColors(colors); //
        pieChart.setDescription("Sales in units");
        pieChart.setData(data);
        pieChart.animateY(1500);
    }
}
