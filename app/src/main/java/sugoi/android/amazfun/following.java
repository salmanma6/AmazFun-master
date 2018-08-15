package sugoi.android.amazfun;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class following extends AppCompatActivity {

    RecyclerView recyclerView;
    followadapt adapter;
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_followers);
        getActionBar().setTitle("Following");
        getActionBar().setHomeButtonEnabled(true);
        recyclerView=(RecyclerView)findViewById(R.id.rvinfws);;
        ArrayList<follwgu> a1=new ArrayList<follwgu>();
        a1.add(new follwgu(R.drawable.jackman,"Jackman crom","Jackshop"));
        a1.add(new follwgu(R.drawable.maeen,"Maeen syed","Croman styles"));
        a1.add(new follwgu(R.drawable.joe,"Joe harry","Sports centre"));
        a1.add(new follwgu(R.drawable.mark,"Mark harry","Furniture"));
        adapter =new followadapt(a1);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
