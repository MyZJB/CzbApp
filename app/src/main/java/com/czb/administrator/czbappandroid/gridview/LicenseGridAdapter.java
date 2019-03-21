package com.czb.administrator.czbappandroid.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.czb.administrator.czbappandroid.R;


public class LicenseGridAdapter extends BaseAdapter
{
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public LicenseGridAdapter(Context context)
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
                holder.textView.setText("补换驾驶证");
                holder.imageView.setImageResource(R.drawable.jsz_icon_bhjsz);
                break;
            case 1:
                holder.textView.setText("迁驾驶证");
                holder.imageView.setImageResource(R.drawable.jsz_icon_qjsz);
                break;
            case 2:
                holder.imageView.setImageResource(R.drawable.jsz_icon_jszjj);
                holder.textView.setText("驾驶证降级");
                break;
            case 3:
                holder.imageView.setImageResource(R.drawable.jsz_icon_xwyd);
                holder.textView.setText("虚位已待");
                break;

        }


        return view;
    }
}
