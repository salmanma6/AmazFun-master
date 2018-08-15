package sugoi.android.amazfun;

/**
 * Created by Junaid Kamran on 23-09-2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class followadapt extends RecyclerView.Adapter<followadapt.RecyclerViewHolder>
{
    private ArrayList<follwgu> arrayList=new ArrayList<follwgu>();
    public followadapt(ArrayList<follwgu> arrayList)
    {
        this.arrayList=arrayList;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.follower_item,parent,false);
        RecyclerViewHolder recyclerViewHolder=new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        follwgu mc=arrayList.get(position);
        holder.img.setImageResource(mc.getPro());
        holder.nam.setText(mc.getName());
        holder.des.setText(mc.getDes());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        de.hdodenhof.circleimageview.CircleImageView img;
        TextView nam,des;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            img=(de.hdodenhof.circleimageview.CircleImageView)itemView.findViewById(R.id.prodinfwr);
            nam = (TextView)itemView.findViewById(R.id.profnaminfwr);
            des = (TextView)itemView.findViewById(R.id.desinfwr);
        }
    }
}
