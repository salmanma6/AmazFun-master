package sugoi.android.amazfun;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import sugoi.android.amazfun.ui.activities.LoginActivity;

public class OmniFeedActivity extends AppCompatActivity {

    TextView title;
    TextView details;
    TextView name,pubdate;
    ImageView pro_pi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omni_feed);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pro_pi = (ImageView) findViewById(R.id.item_image);
        name = (TextView) findViewById(R.id.name_content);
        pubdate = (TextView) findViewById(R.id.txtPubDate);//no need
        title = (TextView) findViewById(R.id.Title_content);
        details = (TextView) findViewById(R.id.content_content);
        pro_pi.setImageResource(getIntent().getIntExtra("Image:",0));
        name.setText(getIntent().getStringExtra("Name:"));
        title.setText(getIntent().getStringExtra("Title:"));
        details.setText(getIntent().getStringExtra("Content:"));

    }

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }


