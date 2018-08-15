package sugoi.android.amazfun;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
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

public class Userbase extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphs);
        BarChart bb=(BarChart)findViewById(R.id.barchart);
        TextView tt=(TextView)findViewById(R.id.graphhead);
        tt.setText("Customer base in year 2017");
        ScrollView scrollView=(ScrollView)findViewById(R.id.scrollingraph);
        MaterialSearchView materialSearchView=(MaterialSearchView)findViewById(R.id.search_viewingrh);
        materialSearchView.setVisibility(View.GONE);
        FrameLayout fm=(FrameLayout)findViewById(R.id.toolbar_container);
        fm.setVisibility(View.GONE);
        ArrayList<BarEntry> barEntryArrayList=new ArrayList<>();
        barEntryArrayList.add(new BarEntry(212f,0));
        barEntryArrayList.add(new BarEntry(522f,1));
        barEntryArrayList.add(new BarEntry(220f,2));
        barEntryArrayList.add(new BarEntry(320f,3));
        barEntryArrayList.add(new BarEntry(230f,4));
        barEntryArrayList.add(new BarEntry(190f,5));
        BarDataSet barDataSet=new BarDataSet(barEntryArrayList,"     Customers");
        TypedArray ta = getApplicationContext().getResources().obtainTypedArray(R.array.forgraph);
        int[] colors = new int[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            colors[i] = ta.getColor(i, 0);
        }
        barDataSet.setColors(colors);
        ArrayList<String> states=new ArrayList<>();
        states.add("TS");
        states.add("AP");
        states.add("KR");
        states.add("TN");
        states.add("KA");
        states.add("MH");
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
        entries.add(new Entry(212, 0));
        entries.add(new Entry(522, 1));
        entries.add(new Entry(220, 2));
        entries.add(new Entry(320, 3));
        entries.add(new Entry(230, 4));
        entries.add(new Entry(190, 5));
        PieChart pieChart=(PieChart)findViewById(R.id.piiechart);
        PieDataSet dataset = new PieDataSet(entries, " ");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("TS");
        labels.add("AP");
        labels.add("KR");
        labels.add("TN");
        labels.add("KA");
        labels.add("MH");
        PieData data = new PieData(labels, dataset);
        dataset.setColors(colors); //
        pieChart.setDescription("Others states have low base");
        pieChart.setData(data);
        pieChart.animateY(1500);
    }
}
