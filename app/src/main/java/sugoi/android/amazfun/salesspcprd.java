package sugoi.android.amazfun;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.Toast;

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

public class salesspcprd extends AppCompatActivity {
    BarDataSet bd[]=new BarDataSet[7];
    PieDataSet ds[]=new PieDataSet[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graphs);
        final TextView tt=(TextView)findViewById(R.id.graphhead);
        tt.setText("Sales of Adidas bat in year 2017");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        final MaterialSearchView materialSearchView=(MaterialSearchView)findViewById(R.id.search_viewingrh);
        materialSearchView.setVisibility(View.VISIBLE);
        materialSearchView.setSuggestions(getResources().getStringArray(R.array.Bats));
        materialSearchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });
        materialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //Do some magic
                switch(query)
                {
                    case "Adidas":
                                   tt.setText("Sales of Adidas bat in year 2017");
                        finsh(0);
                        break;

                    case "Nike": tt.setText("Sales of Nike bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList2=new ArrayList<>();
                        ArrayList<Entry> entries2 = new ArrayList<>();
                        barEntryArrayList2.add(new BarEntry(70f,0));
                        barEntryArrayList2.add(new BarEntry(90f,1));
                        barEntryArrayList2.add(new BarEntry(20f,2));
                        barEntryArrayList2.add(new BarEntry(110f,3));
                        barEntryArrayList2.add(new BarEntry(120f,4));
                        barEntryArrayList2.add(new BarEntry(130f,5));
                        barEntryArrayList2.add(new BarEntry(110f,6));
                        barEntryArrayList2.add(new BarEntry(90f,7));
                        bd[1]=new BarDataSet(barEntryArrayList2," ");
                        //piechart
                        entries2.add(new Entry(70f,0));
                        entries2.add(new Entry(90f,1));
                        entries2.add(new Entry(20f,2));
                        entries2.add(new Entry(110f,3));
                        entries2.add(new Entry(120f,4));
                        entries2.add(new Entry(130f,5));
                        entries2.add(new Entry(110f,6));
                        entries2.add(new Entry(90f,7));
                        ds[1]= new PieDataSet(entries2, " ");
                        finsh(1);
                        break;
                    case  "SS":
                        ArrayList<BarEntry> barEntryArrayList3=new ArrayList<>();
                        ArrayList<Entry> entries3 = new ArrayList<>();
                        tt.setText("Sales of SS bat in year 2017");
                        barEntryArrayList3.add(new BarEntry(10f,0));
                        barEntryArrayList3.add(new BarEntry(20f,1));
                        barEntryArrayList3.add(new BarEntry(30f,2));
                        barEntryArrayList3.add(new BarEntry(10f,3));
                        barEntryArrayList3.add(new BarEntry(150f,4));
                        barEntryArrayList3.add(new BarEntry(90f,5));
                        barEntryArrayList3.add(new BarEntry(130f,6));
                        barEntryArrayList3.add(new BarEntry(90f,7));
                        bd[2]=new BarDataSet(barEntryArrayList3," ");
                        //piechart
                        entries3.add(new Entry(10f,0));
                        entries3.add(new Entry(20f,1));
                        entries3.add(new Entry(30f,2));
                        entries3.add(new Entry(10f,3));
                        entries3.add(new Entry(150f,4));
                        entries3.add(new Entry(90f,5));
                        entries3.add(new Entry(130f,6));
                        entries3.add(new Entry(90f,7));
                        ds[2]= new PieDataSet(entries3, "");
                        finsh(2);
                        break;
                    case  "Gray Nicolas":
                        tt.setText("Sales of GrayNicolas bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList4=new ArrayList<>();
                        ArrayList<Entry> entries4 = new ArrayList<>();
                        barEntryArrayList4.add(new BarEntry(20f,0));
                        barEntryArrayList4.add(new BarEntry(40f,1));
                        barEntryArrayList4.add(new BarEntry(10f,2));
                        barEntryArrayList4.add(new BarEntry(110f,3));
                        barEntryArrayList4.add(new BarEntry(80f,4));
                        barEntryArrayList4.add(new BarEntry(90f,5));
                        barEntryArrayList4.add(new BarEntry(100f,6));
                        barEntryArrayList4.add(new BarEntry(90f,7));
                        bd[3]=new BarDataSet(barEntryArrayList4," ");
                        //piechart
                        entries4.add(new Entry(20f,0));
                        entries4.add(new Entry(40f,1));
                        entries4.add(new Entry(10f,2));
                        entries4.add(new Entry(110f,3));
                        entries4.add(new Entry(80f,4));
                        entries4.add(new Entry(90f,5));
                        entries4.add(new Entry(100f,6));
                        entries4.add(new Entry(90f,7));
                        ds[3]= new PieDataSet(entries4, " ");
                        finsh(3);
                        break;
                    case "GM":
                        tt.setText("Sales of GM bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList5=new ArrayList<>();
                        ArrayList<Entry> entries5 = new ArrayList<>();
                        barEntryArrayList5.add(new BarEntry(140f,0));
                        barEntryArrayList5.add(new BarEntry(160f,1));
                        barEntryArrayList5.add(new BarEntry(20f,2));
                        barEntryArrayList5.add(new BarEntry(120f,3));
                        barEntryArrayList5.add(new BarEntry(120f,4));
                        barEntryArrayList5.add(new BarEntry(110f,5));
                        barEntryArrayList5.add(new BarEntry(120f,6));
                        barEntryArrayList5.add(new BarEntry(130f,7));
                        bd[4]=new BarDataSet(barEntryArrayList5," ");
                        //piechart
                        entries5.add(new Entry(140f,0));
                        entries5.add(new Entry(160f,1));
                        entries5.add(new Entry(20f,2));
                        entries5.add(new Entry(120f,3));
                        entries5.add(new Entry(120f,4));
                        entries5.add(new Entry(110f,5));
                        entries5.add(new Entry(120f,6));
                        entries5.add(new Entry(130f,7));
                        ds[4]= new PieDataSet(entries5, " ");
                        finsh(4);
                        break;
                    case  "SG":
                        tt.setText("Sales of SG bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList6=new ArrayList<>();
                        ArrayList<Entry> entries6 = new ArrayList<>();
                        barEntryArrayList6.add(new BarEntry(180f,0));
                        barEntryArrayList6.add(new BarEntry(60f,1));
                        barEntryArrayList6.add(new BarEntry(20f,2));
                        barEntryArrayList6.add(new BarEntry(110f,3));
                        barEntryArrayList6.add(new BarEntry(100f,4));
                        barEntryArrayList6.add(new BarEntry(90f,5));
                        barEntryArrayList6.add(new BarEntry(30f,6));
                        barEntryArrayList6.add(new BarEntry(90f,7));
                        bd[5]=new BarDataSet(barEntryArrayList6," ");
                        //piechart
                        entries6.add(new Entry(180f,0));
                        entries6.add(new Entry(60f,1));
                        entries6.add(new Entry(20f,2));
                        entries6.add(new Entry(110f,3));
                        entries6.add(new Entry(100f,4));
                        entries6.add(new Entry(90f,5));
                        entries6.add(new Entry(30f,6));
                        entries6.add(new Entry(90f,7));
                        ds[5]= new PieDataSet(entries6, " ");
                        finsh(5);
                        break;
                    case "Puma":
                        tt.setText("Sales of Puma bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList7=new ArrayList<>();
                        ArrayList<Entry> entries7 = new ArrayList<>();
                        barEntryArrayList7.add(new BarEntry(60f,0));
                        barEntryArrayList7.add(new BarEntry(60f,1));
                        barEntryArrayList7.add(new BarEntry(20f,2));
                        barEntryArrayList7.add(new BarEntry(120f,3));
                        barEntryArrayList7.add(new BarEntry(150f,4));
                        barEntryArrayList7.add(new BarEntry(140f,5));
                        barEntryArrayList7.add(new BarEntry(120f,6));
                        barEntryArrayList7.add(new BarEntry(90f,7));
                        bd[6]=new BarDataSet(barEntryArrayList7," ");
                        //piechart
                        entries7.add(new Entry(60f,0));
                        entries7.add(new Entry(60f,1));
                        entries7.add(new Entry(20f,2));
                        entries7.add(new Entry(120f,3));
                        entries7.add(new Entry(150f,4));
                        entries7.add(new Entry(140f,5));
                        entries7.add(new Entry(120f,6));
                        entries7.add(new Entry(90f,7));
                        ds[6]= new PieDataSet(entries7, " ");
                        finsh(6);
                        break;
                    case "Reebok":
                        tt.setText("Sales of Reebok bat in year 2017");
                        ArrayList<BarEntry> barEntryArrayList8=new ArrayList<>();
                        ArrayList<Entry> entries8 = new ArrayList<>();
                        barEntryArrayList8.add(new BarEntry(180f,0));
                        barEntryArrayList8.add(new BarEntry(160f,1));
                        barEntryArrayList8.add(new BarEntry(20f,2));
                        barEntryArrayList8.add(new BarEntry(120f,3));
                        barEntryArrayList8.add(new BarEntry(15f,4));
                        barEntryArrayList8.add(new BarEntry(190f,5));
                        barEntryArrayList8.add(new BarEntry(30f,6));
                        barEntryArrayList8.add(new BarEntry(190f,7));
                        bd[7]=new BarDataSet(barEntryArrayList8," ");
                        //piechart
                        entries8.add(new Entry(180f,0));
                        entries8.add(new Entry(160f,1));
                        entries8.add(new Entry(20f,2));
                        entries8.add(new Entry(120f,3));
                        entries8.add(new Entry(15f,4));
                        entries8.add(new Entry(190f,5));
                        entries8.add(new Entry(30f,6));
                        entries8.add(new Entry(190f,7));
                        ds[7]= new PieDataSet(entries8, " ");
                        finsh(7);
                        break;
                     default:
                                 Toast.makeText(getApplicationContext(),"No products available",Toast.LENGTH_SHORT).show();
                                 break;
                }
                materialSearchView.clearFocus();
                materialSearchView.dismissSuggestions();
                InputMethodManager in = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(materialSearchView.getWindowToken(), 0);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                return false;
            }
        });
        ArrayList<BarEntry> barEntryArrayList1=new ArrayList<>();
        ArrayList<Entry> entries1 = new ArrayList<>();
        barEntryArrayList1.add(new BarEntry(80f,0));
        barEntryArrayList1.add(new BarEntry(60f,1));
        barEntryArrayList1.add(new BarEntry(20f,2));
        barEntryArrayList1.add(new BarEntry(120f,3));
        barEntryArrayList1.add(new BarEntry(150f,4));
        barEntryArrayList1.add(new BarEntry(190f,5));
        barEntryArrayList1.add(new BarEntry(130f,6));
        barEntryArrayList1.add(new BarEntry(90f,7));
        bd[0]=new BarDataSet(barEntryArrayList1," ");
        //piechart
        entries1.add(new Entry(80f,0));
        entries1.add(new Entry(60f,1));
        entries1.add(new Entry(20f,2));
        entries1.add(new Entry(120f,3));
        entries1.add(new Entry(150f,4));
        entries1.add(new Entry(190f,5));
        entries1.add(new Entry(130f,6));
        entries1.add(new Entry(90f,7));
        ds[0]= new PieDataSet(entries1, "  ");
        finsh(0);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        MaterialSearchView materialSearchView = (MaterialSearchView) findViewById(R.id.search_viewingrh);

        materialSearchView.setMenuItem(item);

        return true;
    }
    public void finsh(int cc)
    {
        BarChart bb=(BarChart)findViewById(R.id.barchart);
        TypedArray ta = getApplicationContext().getResources().obtainTypedArray(R.array.forgraph);
        int[] colors = new int[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            colors[i] = ta.getColor(i, 0);
        }
        bd[cc].setColors(colors);
        ArrayList<String> states=new ArrayList<>();
        states.add("Jan");
        states.add("Feb");
        states.add("Mar");
        states.add("Aprl");
        states.add("May");
        states.add("Jun");
        states.add("July");
        states.add("Aug");
        BarData barData=new BarData(states,bd[cc]);
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
        PieChart pieChart=(PieChart)findViewById(R.id.piiechart);
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("January");
        labels.add("February");
        labels.add("March");
        labels.add("April");
        labels.add("May");
        labels.add("June");
        labels.add("July");
        labels.add("August");
        PieData data = new PieData(labels,ds[cc]);
        ds[cc].setColors(colors); //
        pieChart.setDescription("Bat Sales in units");
        pieChart.setData(data);
        pieChart.animateY(1500);
    }
}
