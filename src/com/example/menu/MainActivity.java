package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity implements OnClickListener {

	private ImageView icon_menu;
	private ImageView icon_home;
	private RelativeLayout level1;
	private RelativeLayout level2;
	private RelativeLayout level3;

	private Boolean isLevel1showBoolean = true;
	private Boolean isLevel2showBoolean = true;
	private Boolean isLevel3showBoolean = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		icon_home = (ImageView) findViewById(R.id.home);
		icon_menu = (ImageView) findViewById(R.id.menu);

		level1 = (RelativeLayout) findViewById(R.id.level1);
		level2 = (RelativeLayout) findViewById(R.id.level2);
		level3 = (RelativeLayout) findViewById(R.id.level3);

		icon_home.setOnClickListener(this);
		icon_menu.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.home:
			if (isLevel2showBoolean) {
				MyAnimationUtils.viewHide(level2);
				isLevel2showBoolean = false;
				if (isLevel3showBoolean) {
					MyAnimationUtils.viewHide(level3);
					isLevel3showBoolean = false;
				}
			} else {
				MyAnimationUtils.viewShow(level2);
				isLevel2showBoolean = true;
			}

			break;
		case R.id.menu:
			if (isLevel3showBoolean) {
				MyAnimationUtils.viewHide(level3);
				isLevel3showBoolean = false;
			} else {
				MyAnimationUtils.viewShow(level3);
				isLevel3showBoolean = true;
			}
			break;

		default:
			break;
		}

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_MENU) {
			if (isLevel1showBoolean) {
				MyAnimationUtils.viewHide(level1);
				isLevel1showBoolean = false;
				if (isLevel2showBoolean) {
					MyAnimationUtils.viewHide(level2);
					isLevel2showBoolean = false;
					if (isLevel3showBoolean) {
						MyAnimationUtils.viewHide(level3);
						isLevel3showBoolean = false;

					}

				}
			} else {
				MyAnimationUtils.viewShow(level2);
				MyAnimationUtils.viewShow(level1);
				isLevel1showBoolean = true;
				isLevel2showBoolean = true;

			}

		}

		return super.onKeyDown(keyCode, event);
	}

}
