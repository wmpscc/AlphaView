package com.wmpscc.alphaview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;


public class AlphaRecycleView extends Fragment {

    private RecyclerView recyclerView;
    private MultiTypeAdapter adapter;
    private View root;
    private Items items;


    public AlphaRecycleView() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root=inflater.inflate(R.layout.fragment_alpha_recycle_view,container,false);
        recyclerView=root.findViewById(R.id.rvlist);
        adapter=new MultiTypeAdapter();
        adapter.register(card.class,new cardViewBinder());
        items=new Items();
        recyclerView.setAdapter(adapter);
        items.add(new card());
        for(int i=0;i<50;i++){
            items.add(new card());
        }

        adapter.setItems(items);
        adapter.notifyDataSetChanged();

        return root;
    }
}

