package com.weizhengzhou.androidtraining.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.weizhengzhou.androidtraining.R;
import com.weizhengzhou.androidtraining.main.bean.MainBean;

import java.util.List;


/**
 * Created by 75213 on 2017/12/6.
 */

public class MainAdapter extends BaseAdapter {
    private static final String TAG = MainAdapter.class.getSimpleName();

    private List<MainBean> nameBntItem;
    private Context mContext;

    public MainAdapter(Context context , List<MainBean> nameBntItem){
        this.mContext = context;
        this.nameBntItem = nameBntItem;
    }
    @Override
    public int getCount() {
        return nameBntItem.size();
    }

    @Override
    public Object getItem(int position) {
        return nameBntItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MainBean nameButton = nameBntItem.get(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.main_list_bnt_item , parent , false);
            viewHolder = new ViewHolder();
            viewHolder.nameButton = (TextView) view.findViewById(R.id.list_item_bnt);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.nameButton.setText(nameButton.getNameItem());
        return view;
    }

    class ViewHolder{
        TextView nameButton;
    }
}
