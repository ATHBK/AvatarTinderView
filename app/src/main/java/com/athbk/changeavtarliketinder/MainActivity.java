package com.athbk.changeavtarliketinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        listString.add("https://image.freepik.com/free-icon/apple-logo_318-40184.jpg");
        listString.add("http://g.vatgia.vn/gallery_img/9/alz1492504789.jpg");
        listString.add("http://arena.fpt.edu.vn/wp-content/uploads/2010/11/wwf-logo-design.jpg");
        listString.add("https://image.freepik.com/free-vector/abstract-logo-with-colorful-leaves_1025-695.jpg");
        listString.add("https://s-media-cache-ak0.pinimg.com/736x/ed/de/11/edde11f4abdb1cd40f8b018f66a8710c.jpg");
        listString.add("https://image.freepik.com/free-vector/abstract-logo-in-flame-shape_1043-44.jpg");

//        listString.add("http://sohanews.sohacdn.com/2016/photo-7-1467618024092.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");
//        listString.add("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg");

        List<DataModel> listData = new ArrayList<>();
        DataModel data1 = new DataModel("http://sohanews.sohacdn.com/2016/photo-7-1467618024092.jpg", 0);
        DataModel data2 = new DataModel("http://cms.kienthuc.net.vn/zoom/1000/uploaded/manhtu/2015_12_21/tl/hot-girl-xinh-dep-khien-ai-ngam-cung-muon-phau-thuat-tham-my-hinh-9.jpg", 1);
        DataModel data3 = new DataModel("https://s-media-cache-ak0.pinimg.com/736x/be/0a/b7/be0ab7e1a7f2f5a319e190ec0bad1e31.jpg", 2);
        DataModel data4 = new DataModel("https://tapchianhdep.com/wp-content/uploads/2016/07/girl-xinh-11.jpg", 3);
        DataModel data5 = new DataModel("https://image.freepik.com/free-icon/apple-logo_318-40184.jpg", 4);
        DataModel data6 = new DataModel("http://g.vatgia.vn/gallery_img/9/alz1492504789.jpg", 5);
        DataModel data7 = new DataModel("http://arena.fpt.edu.vn/wp-content/uploads/2010/11/wwf-logo-design.jpg", 6);
        DataModel data8 = new DataModel("https://image.freepik.com/free-vector/abstract-logo-with-colorful-leaves_1025-695.jpg", 7);
        DataModel data9 = new DataModel("https://s-media-cache-ak0.pinimg.com/736x/ed/de/11/edde11f4abdb1cd40f8b018f66a8710c.jpg", 8);
        DataModel data10 = new DataModel("https://image.freepik.com/free-vector/abstract-logo-in-flame-shape_1043-44.jpg", 9);
        listData.add(data1);
        listData.add(data2);
        listData.add(data3);
        listData.add(data4);
        listData.add(data5);
        listData.add(data6);
        listData.add(data7);
        listData.add(data8);
        listData.add(data9);
        listData.add(data10);



        AvatarAdapter adapter = new AvatarAdapter(this, listData);
        recyclerView.initRecyclerView(this, adapter);

        adapter.setiFinishDrag(new IFinishDrag() {
            @Override
            public void updateListData(ArrayList<DataModel> listData) {
                for (int i=0; i< listData.size(); i++){
                    Log.e("TAG", "" + i + "/"+ listData.get(i).getLogo());
                }
            }
        });
    }
}
