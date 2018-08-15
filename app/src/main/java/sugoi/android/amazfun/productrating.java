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

public class productrating extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphs);
        BarChart bb=(BarChart)findViewById(R.id.barchart);
        TextView tt=(TextView)findViewById(R.id.graphhead);
        tt.setText("Rating of different products in year 2017");
        MaterialSearchView materialSearchView=(MaterialSearchView)findViewById(R.id.search_viewingrh);
        materialSearchView.setVisibility(View.GONE);
        FrameLayout fm=(FrameLayout)findViewById(R.id.toolbar_container);
        fm.setVisibility(View.GONE);
        ArrayList<BarEntry> barEntryArrayList=new ArrayList<>();
        barEntryArrayList.add(new BarEntry(5f,0));
        barEntryArrayList.add(new BarEntry(5f,1));
        barEntryArrayList.add(new BarEntry(4f,2));
        barEntryArrayList.add(new BarEntry(4f,3));
        barEntryArrayList.add(new BarEntry(3f,4));
        barEntryArrayList.add(new BarEntry(4f,5));
        barEntryArrayList.add(new BarEntry(4f,6));
        barEntryArrayList.add(new BarEntry(3f,7));
        BarDataSet barDataSet=new BarDataSet(barEntryArrayList,"    Bats");
        TypedArray ta = getApplicationContext().getResources().obtainTypedArray(R.array.forgraph);
        int[] colors = new int[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            colors[i] = ta.getColor(i, 0);
        }
        barDataSet.setColors(colors);
        ArrayList<String> states=new ArrayList<>();
        states.add("ADS");
        states.add("NKE");
        states.add("SS");
        states.add("GNS");
        states.add("GM");
        states.add("SG");
        states.add("PMA");
        states.add("RBK");
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
        entries.add(new Entry(5f,0));
        entries.add(new Entry(5f,1));
        entries.add(new Entry(4f,2));
        entries.add(new Entry(4f,3));
        entries.add(new Entry(3f,4));
        entries.add(new Entry(4f,5));
        entries.add(new Entry(4f,6));
        entries.add(new Entry(3f,7));
        PieChart pieChart=(PieChart)findViewById(R.id.piiechart);
        PieDataSet dataset = new PieDataSet(entries, "");
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Adidas");
        labels.add("Nike");
        labels.add("SS");
        labels.add("Gray Nicolas");
        labels.add("GM");
        labels.add("SG");
        labels.add("Puma");
        labels.add("Reebok");
        PieData data = new PieData(labels, dataset);
        dataset.setColors(colors);
        pieChart.setDescription("Max rating is 5");
        pieChart.setData(data);
        pieChart.animateY(1500);
    }
}
