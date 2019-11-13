package com.piyushmaheswari.imageloader.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.piyushmaheswari.imageloader.Model.ImageLoader;
import com.piyushmaheswari.imageloader.R;

public class LazyAdapter extends BaseAdapter {

    private String[] data;
    private static LayoutInflater inflater=null;
    private ImageLoader imageLoader;

    public LazyAdapter(Activity a, String[] d) {
        data=d;
        inflater = (LayoutInflater) a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        imageLoader=new ImageLoader(a.getApplicationContext());
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vi=view;
        if(view==null)
            vi = inflater.inflate(R.layout.list_item, null);

        ImageView image=vi.findViewById(R.id.image);
        imageLoader.DisplayImage(data[i], image);
        return vi;
    }
}
