package evino.test.com.br.testevino.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.models.Wine;

/**
 * Created by techresult on 05/05/2016.
 */
public class ListWinesAdapter extends RecyclerView.Adapter<ListWinesAdapter.ViewHolder> {

    private List<Wine> wines;

    public ListWinesAdapter(List<Wine> wines){
        this.wines = wines;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgWine;
        public TextView tvWineName, tvWineInfo;

        public ViewHolder(View itemView) {
            super(itemView);
            imgWine = (ImageView) itemView.findViewById(R.id.img_wine);
            tvWineName = (TextView) itemView.findViewById(R.id.tv_wine_name);
            tvWineInfo = (TextView) itemView.findViewById(R.id.tv_wine_info);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.wine_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Wine wine = wines.get(position);
        holder.imgWine.setImageResource(android.R.drawable.ic_menu_gallery);
        holder.tvWineName.setText(wine.getName());

        String basicInfo = "";

        for(String info : wine.getBasicInfo()){
            basicInfo += "* " + info + " ";
        }

        holder.tvWineInfo.setText(basicInfo);
    }

    @Override
    public int getItemCount() {
        return wines.size();
    }


}
