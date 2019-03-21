package com.czb.administrator.czbappandroid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.R;


public class SyGridAdapter extends BaseAdapter
{
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public SyGridAdapter(Context context)
    {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    static class ViewHolder
    {
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        //111
        ViewHolder holder = null;
        if (view == null)
        {
            view = mLayoutInflater.inflate(R.layout.layout_grid_item, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv_grid);
            holder.textView = view.findViewById(R.id.iv_title);
            view.setTag(holder);
        }
        else
            holder = (ViewHolder) view.getTag();
        //1=
        switch (i){
            case 0:
                holder.textView.setText("首页");
                holder.imageView.setImageResource(R.drawable.tabbar_usercenter_default);
                break;
            case 1:
                holder.textView.setText("我的");
                holder.imageView.setImageResource(R.drawable.tabbar_index_default);
                break;
        }


        return view;
    }
}
