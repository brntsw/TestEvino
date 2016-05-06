package evino.test.com.br.testevino.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.models.Purchase;

/**
 * Created by techresult on 06/05/2016.
 */
public class ListCartAdapter extends RecyclerView.Adapter<ListCartAdapter.ViewHolder> {

    List<Purchase> purchases;

    public ListCartAdapter(List<Purchase> purchases){
        this.purchases = purchases;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgWine;
        public TextView tvWineName, tvWinePrice;
        public EditText editQuantity;
        public ImageButton imgBtnDelete;


        public ViewHolder(View itemView) {
            super(itemView);
            imgWine = (ImageView) itemView.findViewById(R.id.img_wine);
            tvWineName = (TextView) itemView.findViewById(R.id.tv_wine_name);
            tvWinePrice = (TextView) itemView.findViewById(R.id.tv_wine_price);
            editQuantity = (EditText) itemView.findViewById(R.id.edit_quantity);
            imgBtnDelete = (ImageButton) itemView.findViewById(R.id.bt_img_delete);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Purchase purchase = purchases.get(position);
        holder.imgWine.setImageResource(android.R.drawable.ic_menu_gallery);
        holder.tvWineName.setText(purchase.getWine().getName());
        holder.tvWinePrice.setText("R$ " + String.format("%.2f", purchase.getWine().getPrice()));
        holder.editQuantity.setText(String.valueOf(purchase.getQuantity()));
    }

    @Override
    public int getItemCount() {
        return purchases.size();
    }

}
