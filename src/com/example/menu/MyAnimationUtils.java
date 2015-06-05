package com.example.menu;

import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

public class MyAnimationUtils {

	public static void viewHide(RelativeLayout view) {

		/*
		 * 旋转动画 为顺时针 方向 要实现 本例的效果 那么它的旋转度数为 0--189度 实现效果关键是看
		 * 旋转度数，定义不同的旋转度数，可以实现不同的效果 旋转角度起始角度，旋转点（x,y）
		 */
		RotateAnimation animation = new RotateAnimation(0, 180,
				view.getWidth() / 2, view.getHeight());
		animation.setDuration(300); // 设置动画时间
		animation.setFillAfter(true); // 动画执行完之后保证当前状态
		// animation.setStartOffset(200); // 设置旋转的延时效果，用在多个动画不同时显示效果时使用
		view.startAnimation(animation); // 开始动画

	}

	public static void viewShow(RelativeLayout view) {

		RotateAnimation animation = new RotateAnimation(180, 360,
				view.getWidth() / 2, view.getHeight());
		animation.setDuration(300);
		animation.setFillAfter(true);
		view.startAnimation(animation);

	}

}
