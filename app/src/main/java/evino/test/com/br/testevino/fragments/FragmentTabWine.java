package evino.test.com.br.testevino.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import evino.test.com.br.testevino.R;
import evino.test.com.br.testevino.adapter.ListWinesAdapter;
import evino.test.com.br.testevino.models.Wine;

/**
 * Created by techresult on 05/05/2016.
 */
public class FragmentTabWine extends Fragment {

    private List<Wine> wines;
    private RecyclerView recyclerView;
    private ListWinesAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_tab_wine, container, false);

        // TODO Dummy data wines ->>>> Change this with the data provenient from the nertwork
        List<String> infos1 = new ArrayList<>();
        infos1.add("Branco");
        infos1.add("Portugal");
        infos1.add("Vinho Verde");
        infos1.add("Várias uvas");

        Wine wine1 = new Wine();
        wine1.setName("Casal Garcia Branco Vinho Verde DOC 2014");
        wine1.setBasicInfo(infos1);

        List<String> infos2 = new ArrayList<>();
        infos2.add("Tinto");
        infos2.add("Chile");
        infos2.add("Vale do Colchágua");
        infos2.add("Cabernet Sauvignon");

        Wine wine2 = new Wine();
        wine2.setName("Casa Silva Santa Tierra Estate Cabernet Sauvignon 2014");
        wine2.setBasicInfo(infos2);

        List<String> infos3 = new ArrayList<>();
        infos3.add("Tinto");
        infos3.add("Itália");
        infos3.add("Sicília");
        infos3.add("Várias uvas");

        Wine wine3 = new Wine();
        wine3.setName("Firriato Santagostino Baglio Sorìa Sicilia 2011");
        wine3.setBasicInfo(infos3);

        List<String> infos4 = new ArrayList<>();
        infos4.add("Branco");
        infos4.add("França");
        infos4.add("Borgonha");
        infos4.add("Chardonnay");

        Wine wine4 = new Wine();
        wine4.setName("Marie Pierre Manciat Pouilly Fuisse Chardonnay");
        wine4.setBasicInfo(infos4);

        wines = new ArrayList<>();

        wines.add(wine1);
        wines.add(wine2);
        wines.add(wine3);
        wines.add(wine4);

        // --------------------------------------------------------------------- //

        adapter = new ListWinesAdapter(wines);

        recyclerView = (RecyclerView) layout.findViewById(R.id.recycler);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        return layout;
    }

}
