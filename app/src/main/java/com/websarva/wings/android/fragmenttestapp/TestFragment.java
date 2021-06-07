package com.websarva.wings.android.fragmenttestapp;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //所属するアクティビティオブジェクトを取得
        Activity parentActivity = getActivity();
        //表示する画面をXMLファイルからインフレ➖トする
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        //画面部品ListView取得
        ListView lvTest = view.findViewById(R.id.lvTest);
        //SimpleAdapterで使用するListオブジェクトを用意
        List<Map<String, String>> list = new ArrayList<>();

        //Mapオブジェクトの用意とlistへのデータ登録
        Map<String, String> data = new HashMap<>();
        data.put("small", "aaa");
        data.put("large", "AAA");
        list.add(data);

        data = new HashMap<>();
        data.put("small", "bbb");
        data.put("large", "BBB");
        list.add(data);

        data = new HashMap<>();
        data.put("small", "ccc");
        data.put("large", "CCC");
        list.add(data);

        data = new HashMap<>();
        data.put("small", "ddd");
        data.put("large", "DDD");
        list.add(data);

        data = new HashMap<>();
        data.put("small", "eee");
        data.put("large", "EEE");
        list.add(data);

        String[] from = {"small", "large"};
        int[] to = {android.R.id.text1, android.R.id.text2};

        //SimpleAdapter生成
        SimpleAdapter adapter = new SimpleAdapter(parentActivity, list, android.R.layout.simple_list_item_2, from, to);
        //アダプタ登録
        lvTest.setAdapter(adapter);

        return view;
    }
}