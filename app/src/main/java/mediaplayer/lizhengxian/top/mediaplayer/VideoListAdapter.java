package mediaplayer.lizhengxian.top.mediaplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * ************************************************************
 * Copyright (C) 2005 - 2017 UCWeb Inc. All Rights Reserved
 * Description  :  mediaplayer.lizhengxian.top.mediaplayer.VideoListAdapter.java
 * <p>
 * Creation     : 2017/3/1
 * Author       : zhengxian.lzx@alibaba-inc.com
 * History      : Creation, 2017 lizx, Create the file
 * *************************************************************
 */

public class VideoListAdapter extends BaseAdapter {
    private final Context mContext;
    List<Video> mVideos;

    public VideoListAdapter(Context context, List<Video> videos) {
        this.mVideos = videos;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return mVideos.size();
    }

    @Override
    public Video getItem(int position) {
        return mVideos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_video, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mItemText.setText(getItem(position).getTitle());
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public TextView mItemText;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.mItemText = (TextView) rootView.findViewById(R.id.item_text);
        }

    }
}
