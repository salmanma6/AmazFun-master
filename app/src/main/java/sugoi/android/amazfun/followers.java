package sugoi.android.amazfun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class followers extends AppCompatActivity {
    RecyclerView recyclerView;
    followadapt adapter;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followers);
        getActionBar().setTitle("Followers");
        getActionBar().setHomeButtonEnabled(true);
        recyclerView=(RecyclerView)findViewById(R.id.rvinfws);;
        ArrayList<follwgu> a1=new ArrayList<follwgu>();
        a1.add(new follwgu(R.drawable.sauban,"Syed Sauban","SYED PVT LTD"));
        a1.add(new follwgu(R.drawable.rishab,"Rishab Awasthi","AWASTI PVT LTD"));
        a1.add(new follwgu(R.drawable.aadil,"Aadil Shaik","AADIL PVT LTD"));
        a1.add(new follwgu(R.drawable.salman,"Salman","Salman PVT LTD"));
        adapter =new followadapt(a1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
