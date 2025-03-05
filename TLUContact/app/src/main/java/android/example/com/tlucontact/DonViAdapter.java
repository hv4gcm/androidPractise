package android.example.com.tlucontact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DonViAdapter extends RecyclerView.Adapter<DonViAdapter.DonViViewHolder> {
    DonVi[] donvi;

    public DonViAdapter(DonVi[] donvi) {
        this.donvi = donvi;
    }

    @NonNull
    @Override
    public DonViViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_entry, parent, false);
        return new DonViViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonViViewHolder holder, int position) {
        holder.bind(donvi[position],position);
    }

    @Override
    public int getItemCount() {
        return donvi.length;
    }

    static class DonViViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private TextView phone_number;
        private TextView lbname;
        private TextView lbphonenumber;
        public DonViViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_name);
            phone_number = itemView.findViewById(R.id.txt_phone_number);
            lbname = itemView.findViewById(R.id.lb_name);
            lbphonenumber = itemView.findViewById(R.id.lb_phone_number);
        }
        public void bind(DonVi donvi, int position){
            name.setText(donvi.name);
            phone_number.setText(donvi.phone_number);
            lbname.setText("Tên đơn vị: ");
            lbphonenumber.setText("Số điện thoại: ");
        }
    }
}
