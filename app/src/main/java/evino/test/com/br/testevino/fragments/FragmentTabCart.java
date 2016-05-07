package evino.test.com.br.testevino.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.List;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.adapter.ListCartAdapter;
import evino.test.com.br.testevino.models.Purchase;
import evino.test.com.br.testevino.models.Wine;

/**
 * Created by techresult on 05/05/2016.
 */
public class FragmentTabCart extends Fragment {

    private RecyclerView recyclerView;
    private ListCartAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        RelativeLayout layout = (RelativeLayout) inflater.inflate(R.layout.fragment_tab_cart, container, false);

        // TODO Dummy data purchases ->>>> Change this with the data provenient from the nertwork
        List<Purchase> purchases = new ArrayList<>();

        Wine wine1 = new Wine();
        wine1.setName("Casal Garcia Branco Vinho Verde DOC 2014");
        wine1.setPrice(75.90);

        Wine wine2 = new Wine();
        wine2.setName("Casa Silva Santa Tierra Estate Cabernet Sauvignon 2014");
        wine2.setPrice(90.20);

        Purchase purchase1 = new Purchase();
        purchase1.setWine(wine1);
        purchase1.setQuantity(1);

        Purchase purchase2 = new Purchase();
        purchase2.setWine(wine2);
        purchase2.setQuantity(3);

        purchases.add(purchase1);
        purchases.add(purchase2);

        // --------------------------------------- //

        adapter = new ListCartAdapter(purchases);

        recyclerView = (RecyclerView) layout.findViewById(R.id.recycler);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return layout;
    }

}
