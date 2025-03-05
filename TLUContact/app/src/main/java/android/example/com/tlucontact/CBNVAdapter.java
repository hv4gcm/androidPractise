package android.example.com.tlucontact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CBNVAdapter extends RecyclerView.Adapter<CBNVAdapter.CBNVViewHolder> {
    CBNV[] canbo;

    public CBNVAdapter(CBNV[] canbo) {
        this.canbo = canbo;
    }

    @NonNull
    @Override
    public CBNVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_entry,parent,false);
        return new CBNVViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull CBNVViewHolder holder, int position) {
        holder.bind(canbo[position],position);
    }

    @Override
    public int getItemCount() {
        return canbo.length;
    }

    static class CBNVViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView phone_number;
        private TextView lbname;
        private TextView lbphonenumber;

        public CBNVViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_name);
            phone_number = itemView.findViewById(R.id.txt_phone_number);
            lbname = itemView.findViewById(R.id.lb_name);
            lbphonenumber = itemView.findViewById(R.id.lb_phone_number);
        }
        public void bind(CBNV canbo, int position){
            name.setText(canbo.name);
            phone_number.setText(canbo.phone_number);
            lbname.setText("Họ tên: ");
            lbphonenumber.setText("Số điện thoại: ");
        }
    }

}
