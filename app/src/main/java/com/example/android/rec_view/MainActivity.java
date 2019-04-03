package com.example.android.rec_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: started.");

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.esa.int/var/esa/storage/images/esa_multimedia/images/2017/05/vesuvius/16957609-1-eng-GB/Vesuvius.jpg");
        mNames.add("Mount Vesuvius");

        mImageUrls.add("http://4.bp.blogspot.com/-Rd-Iywy8Vxc/T7d2Jpqfb1I/AAAAAAAAAgw/LeVTGH4qNPE/s1600/mount+everest+image.jpg");
        mNames.add("Mount Everest");

        mImageUrls.add("https://www.travelplanet.in/wp-content/uploads/2016/03/291425-mount-fuji.jpg");
        mNames.add("Mount Fuji");

        mImageUrls.add("https://travelingportals.com/wp-content/uploads/2016/10/Kilimanjaro-Summit-View.jpg");
        mNames.add("Mount Kilimanjaro");

        mImageUrls.add("http://4.bp.blogspot.com/-rMYJQXfCW1U/TxK-xy2FpqI/AAAAAAAAAUE/yVwZH-_BHbc/s1600/08+Mount+Kailash+Close+Up+from+The+Kangnyi+Chorten+Tarboche+Area+On+Mount+Kailash+Outer+Kora.jpg");
        mNames.add("Mount Kailash");

        initRecyclerView();
    }

    private void initRecyclerView() {
        Log.d(TAG,"initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.rec_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames,mImageUrls,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
