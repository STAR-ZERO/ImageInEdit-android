package com.zero.star.imageinedit.sample;

import com.zero.star.imageinedit.ImageInEdit;
import com.zero.star.imageinedit.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SampleActivity extends Activity {

	private ImageInEdit mImageEdit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.sample_layout);

		mImageEdit = (ImageInEdit) findViewById(R.id.image_edit);

		((Button) findViewById(R.id.btn_resource)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageEdit.insertResourceImage(SampleActivity.this, R.drawable.sample);
			}
		});

		((Button) findViewById(R.id.btn_assets)).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mImageEdit.insertAssetsImage(SampleActivity.this, "sample.png");
			}
		});

	}

}
