package com.roundmelon.jv.bharatham2k17;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Joseph on 15/08/17.
 */

public class DetailedAdapter extends RecyclerView.Adapter<DetailedAdapter.ViewHolder> {
    private List<Details> details_array1;
    private List<Details> details_array2;
    private List<Details> details_array3;

//    private ArrayList<String> details_array1;
//    private ArrayList<String> details_array2;
//    private ArrayList<String> details_array3;

    private Context context;

public DetailedAdapter(Context context,List<Details> details_array1,List<Details> details_array2,List<Details> details_array3){
    this.context = context;
    this.details_array1 = details_array1;
    this.details_array2 = details_array2;
    this.details_array3 = details_array3;
}

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
//        public TextView txtHeader;
//        public TextView txtFooter;
        public TextView event_name;
        public TextView first_prize_group;
        public TextView second_prize_group;
        public TextView third_prize_group;

        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
//            txtHeader = (TextView) v.findViewById(R.id.firstLine);
//            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            event_name = (TextView) v.findViewById(R.id.event_name);
            first_prize_group = (TextView) v.findViewById(R.id.first_prize_group);
            second_prize_group = (TextView) v.findViewById(R.id.second_prize_group);
            third_prize_group = (TextView) v.findViewById(R.id.third_prize_group);
        }
    }

//    public void add(int position, String item) {
//        values.add(position, item);
//        notifyItemInserted(position);
//    }

//    public void remove(int position) {
//        values.remove(position);
//        notifyItemRemoved(position);
//    }

    // Provide a suitable constructor (depends on the kind of dataset)
//    public DetailedAdapter(List<String> myDataset) {
//        values = myDataset;
//    }

    // Create new views (invoked by the layout manager)
    @Override
    public DetailedAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        LayoutInflater inflater = LayoutInflater.from(
                parent.getContext());
        View v =
                inflater.inflate(R.layout.row_layout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Details det1 = details_array1.get(position);
        Details det2 = details_array2.get(position);
        Details det3 = details_array3.get(position);
        holder.event_name.setText(det1.getEventName());
        holder.first_prize_group.setText(det1.getName());
        holder.second_prize_group.setText(det2.getName());
        holder.third_prize_group.setText(det3.getName());




    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return details_array1.size();
    }

}