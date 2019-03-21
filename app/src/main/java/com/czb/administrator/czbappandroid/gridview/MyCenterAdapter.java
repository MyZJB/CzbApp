package com.czb.administrator.czbappandroid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.R;


public class MyCenterAdapter extends BaseAdapter
{
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyCenterAdapter(Context context)
    {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return 4;
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
        ViewHolder holder = null;
        if (view == null)
        {
            view = mLayoutInflater.inflate(R.layout.layout_centergrid_item, null);
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
                holder.textView.setText("订单");
                holder.imageView.setImageResource(R.drawable.user_center_icon_order);
                break;
            case 1:
                holder.textView.setText("驾驶证");
                holder.imageView.setImageResource(R.drawable.user_center_icon_driver_license);
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.user_center_motor_vehicle);
                holder.textView.setText("机动车");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.user_center_qr_code);
                holder.textView.setText("二维码");
                break;
        }


        return view;
    }
}
