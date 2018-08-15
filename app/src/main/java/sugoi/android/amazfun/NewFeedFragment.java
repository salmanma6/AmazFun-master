package sugoi.android.amazfun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Adil on 23-09-2017.
 */

public class NewFeedFragment extends Fragment {


    private String[] titles = {"How do we expand business?",
            "How is branding different from marketing?",
            "How did u start business",
            "Who is the best business ever?",
            "Strange business strategies?",
            "Mind blowing decisions?",
            "How did you start at amazon?",
            "Experience at amazon?","How is Amazon better than Flipcart?",
            "How to develop a Brand?"
    };

    private String[] details = {"Here are six small business expansion strategies that may help you grow your business to the next level:\n" +
            "1.Add new products and services to your mix. ...\n" +
            "2Sell more products and services to your existing customers. ...\n" +
            "3Expand into new territories. ...\n" +
            "4Target new customer markets. ...\n" +
            "5Tap into new sales and delivery channels.",
            "Branding is strategic. Marketing is tactical.\n" +
                    "\n" +
                    "Marketing may contribute to a brand, but the brand is bigger than any particular marketing effort. The brand is what remains after the marketing has swept through the room. It’s what sticks in your mind associated with a product, service, or organization—whether or not, at that particular moment, you bought or did not buy.\n" +
                    "\n" +
                    "The brand is ultimately what determines if you will become a loyal customer or not. The marketing may convince you to buy a particular Toyota, and maybe it’s the first foreign car you ever owned, but it is the brand that will determine if you will only buy Toyotas for the rest of your life.\n" +
                    "\n" +
                    "The brand is built from many things. Very important among these things is the lived experience of the brand. Did that car deliver on its brand promise of reliability? Did the maker continue to uphold the quality standards that made them what they are? Did the sales guy or the service center mechanic know what they were talking about?\n" +
                    "\n" +
                    "Marketing unearths and activates buyers. Branding makes loyal customers, advocates, even evangelists, out of those who buy.", "Brainstorm ideas. Every new business starts with an idea. ...\n" +
            "Build a business plan. ...\n" +
            "Assess your finances. ...\n" +
            "Determine your legal business structure. ...\n" +
            "Register with the government and IRS. ...\n" +
            "Select your technology. ...\n" +
            "Purchase an insurance policy. ...\n" +
            "Choose your partners.",
            "Meet Ram, he has a turnover of ru..", "I saw a person doing weird advertising..",
            "A decision I took, turned the tides..", "Now when I see amazon, I feel like..",
            "Woah! way better than westros..","Now demands more controversy and then eve..",
            "It is sometimes very difficult to focus on.. "
    };

    private int[] images = { R.drawable.jorah,
            R.drawable.dany,
            R.drawable.arya,
            R.drawable.tyrion,
            R.drawable.little,
            R.drawable.jon,
            R.drawable.night,
            R.drawable.jaime, R.drawable.sam, R.drawable.olenna};

    private String[] names={"Ser Jorah Mormont","Daenerys Targareyn",
            "Arya Stark","Tyrion Lannister","Loard Baelish","Jon Snow",
            "Long Night","Jamie Lannister","Samwell Tarly","Olenna Tyrel"};

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;


    public NewFeedFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.activity_card_demo, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View v=getView();
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        Intent intent=new Intent(getActivity(), OmniFeedActivity.class);
                        intent.putExtra("Name:",names[position]);
                        intent.putExtra("Title:",titles[position]);
                        intent.putExtra("Image:",images[position]);
                        intent.putExtra("Content:",details[position]);
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    }
}
