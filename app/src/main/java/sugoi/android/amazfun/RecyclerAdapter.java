package sugoi.android.amazfun;

/**
 * Created by Shade on 5/9/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



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

    private String[] details = {"It is tricky at times to expand a business..",
            "Branding is quality assurance, whereas..", "If I start shelling out strategies soon..",
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

    class ViewHolder extends RecyclerView.ViewHolder{

        Context context;

        public ViewHolder(View itemView, Context context) {
            super(itemView);
            this.context = context;
        }

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
        public TextView itemName;
        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail =(TextView)itemView.findViewById(R.id.content);
            itemName=(TextView) itemView.findViewById(R.id.name);

        }
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemName.setText(names[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
