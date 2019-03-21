package com.czb.administrator.czbappandroid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.R;


public class VehicleGridAdapter extends BaseAdapter
{
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public VehicleGridAdapter(Context context)
    {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount()
    {
        return 8;
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
                holder.textView.setText("补铁牌");
                holder.imageView.setImageResource(R.drawable.jdc_icon_btp);
                break;
            case 1:
                holder.textView.setText("年审");
                holder.imageView.setImageResource(R.drawable.jdc_icon_ns);
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.jdc_icon_bhxsz);
                holder.textView.setText("补换行驶证");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.jdc_icon_bdjb);
                holder.textView.setText("补登记本");
                break;
            case  4:
                holder.imageView.setImageResource(R.drawable.jdc_icon_qctd);
                holder.textView.setText("迁出提档");
                break;
            case 5:
                holder.imageView.setImageResource(R.drawable.jdc_icon_spgh);
                holder.textView.setText("上牌过户");
                break;
            case 6:
                holder.imageView.setImageResource(R.drawable.jdc_icon_cdfdjh);
                holder.textView.setText("重打发动机号");
                break;
            case 7:
                holder.imageView.setImageResource(R.drawable.jdc_icon_bgcsys);
                holder.textView.setText("变更车身颜色");
                break;
        }


        return view;
    }
}
