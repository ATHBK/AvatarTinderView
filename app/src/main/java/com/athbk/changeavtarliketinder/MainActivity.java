package com.athbk.changeavtarliketinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athbk.avatarview.TinderRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinderRecyclerView recyclerView = (TinderRecyclerView) findViewById(R.id.recyclerView);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(R.drawable.anh1);
        listInt.add(R.drawable.anh2);
        listInt.add(R.drawable.anh3);
        listInt.add(R.drawable.anh1);
        listInt.add(R.drawable.anh2);
        listInt.add(R.drawable.anh3);
        listInt.add(R.drawable.anh1);
        listInt.add(R.drawable.anh2);
        listInt.add(R.drawable.anh3);

        List<String> listString = new ArrayList<>();
        listString.add("http://sohanews.sohacdn.com/2016/photo-7-1467618024092.jpg");
        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
        listString.add("https://s-media-cache-ak0.pinimg.com/736x/be/0a/b7/be0ab7e1a7f2f5a319e190ec0bad1e31.jpg");
        listString.add("https://tapchianhdep.com/wp-content/uploads/2016/07/girl-xinh-11.jpg");
        listString.add("http://sohanews.sohacdn.com/2016/photo-7-1467618024092.jpg");
        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
        listString.add("https://tapchianhdep.com/wp-content/uploads/2016/07/girl-xinh-11.jpg");
        listString.add("http://sohanews.sohacdn.com/2016/photo-7-1467618024092.jpg");
        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");

        AvatarAdapter adapter = new AvatarAdapter(this, listString);
        recyclerView.initRecyclerView(this, adapter);
    }
}
