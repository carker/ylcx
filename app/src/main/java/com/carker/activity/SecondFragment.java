package com.carker.activity;


import android.os.Bundle;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.carker.adapter.HospitalAdapter;
import com.carker.bean.HospitalEntity;
import com.carker.myapplication.OnTabReselectListener;
import com.carker.myapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements OnTabReselectListener {
    boolean isSendMessage=false;
    final static int UPDATE=1;
    private Spinner spin_province,spin_city;
    ArrayAdapter<String> provinceAdapter,cityAdapter;
    String[] province=null;
    String[][] city=null;
    static int provincePosition = 0;
    static int cityPosition=0;
    ListView tv;
    HospitalAdapter hospitalAdapter;
    List<HospitalEntity> list;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case UPDATE:
                    list.add(new HospitalEntity(province[provincePosition].toString(),city[provincePosition][cityPosition].toString()));
                    hospitalAdapter.notifyDataSetChanged();
                    break;

            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list=new ArrayList<HospitalEntity>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        initVIew(view);
        return view;

    }

    public void initVIew(View view){
        tv= (ListView) view.findViewById(R.id.listview);
        spin_province = (Spinner) view.findViewById(R.id.spin_province);
        spin_city = (Spinner) view.findViewById(R.id.spin_city);
        getData();
        provinceAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,province);
        spin_province.setAdapter(provinceAdapter);
        spin_province.setSelection(0,true);
        cityAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,city[0]);
        spin_city.setAdapter(cityAdapter);
        spin_city.setSelection(0,true);
        HospitalEntity hosE=new HospitalEntity(spin_province.getSelectedItem().toString(),spin_city.getSelectedItem().toString());
        list.add(hosE);
        hospitalAdapter=new HospitalAdapter(getActivity(),list);
        tv.setAdapter(hospitalAdapter);
        setListener();

    }

    private void setListener() {

        spin_province.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                isSendMessage=false;
                cityAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,city[position]);
                spin_city.setAdapter(cityAdapter);
                provincePosition=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spin_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                isSendMessage=true;
                cityPosition=position;
                if(isSendMessage) {
                    Message msg = new Message();
                    msg.what = UPDATE;
                    handler.sendMessage(msg);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public void getData(){
        //省级选项值
         province = new String[] {"北京","上海","天津","广东"};//,"重庆","黑龙江","江苏","山东","浙江","香港","澳门"};
        //地级选项值
          city = new String[][]
                {
                        { "东城区", "西城区", "崇文区", "宣武区", "朝阳区", "海淀区", "丰台区", "石景山区", "门头沟区",
                                "房山区", "通州区", "顺义区", "大兴区", "昌平区", "平谷区", "怀柔区", "密云县",
                                "延庆县" },
                        { "长宁区", "静安区", "普陀区", "闸北区", "虹口区" },
                        { "和平区", "河东区", "河西区", "南开区", "河北区", "红桥区", "塘沽区", "汉沽区", "大港区",
                                "东丽区" },
                        { "广州", "深圳", "韶关" // ,"珠海","汕头","佛山","湛江","肇庆","江门","茂名","惠州","梅州",
                                // "汕尾","河源","阳江","清远","东莞","中山","潮州","揭阳","云浮"
                        }
                };
    }
    @Override
    public void onTabReselect() {
        Toast.makeText(getActivity().getApplicationContext(), "Second", Toast.LENGTH_SHORT).show();
    }
}
