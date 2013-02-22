package com.example;

import com.example.demo.R;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class PhotoListAdapter extends BaseAdapter {

	private Bitmap bitmapList[];

	private String nameList[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i",
			"j" };

	private LayoutInflater inflator;

	public PhotoListAdapter(LayoutInflater inflator) {
		this.inflator = inflator;
		bitmapList = new Bitmap[10];
	}

	@Override
	public int getCount() {
		return 10;
	}

	@Override
	public Object getItem(int position) {
		return bitmapList[position];
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View arg1, ViewGroup arg2) {
		if (arg1 == null) {
			arg1 = inflator.inflate(R.layout.listelement_example, null);
		}

		TextView tv = (TextView) arg1.findViewById(R.id.textView);
		ImageView iv = (ImageView) arg1.findViewById(R.id.imageView);
		ProgressBar pb = (ProgressBar) arg1.findViewById(R.id.progressBar);

		tv.setText(nameList[position]);

		return arg1;
	}

}
