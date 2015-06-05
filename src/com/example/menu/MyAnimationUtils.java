package com.example.menu;

import android.view.animation.RotateAnimation;
import android.widget.RelativeLayout;

public class MyAnimationUtils {

	public static void viewHide(RelativeLayout view) {

		/*
		 * ��ת���� Ϊ˳ʱ�� ���� Ҫʵ�� ������Ч�� ��ô������ת����Ϊ 0--189�� ʵ��Ч���ؼ��ǿ�
		 * ��ת���������岻ͬ����ת����������ʵ�ֲ�ͬ��Ч�� ��ת�Ƕ���ʼ�Ƕȣ���ת�㣨x,y��
		 */
		RotateAnimation animation = new RotateAnimation(0, 180,
				view.getWidth() / 2, view.getHeight());
		animation.setDuration(300); // ���ö���ʱ��
		animation.setFillAfter(true); // ����ִ����֮��֤��ǰ״̬
		// animation.setStartOffset(200); // ������ת����ʱЧ�������ڶ��������ͬʱ��ʾЧ��ʱʹ��
		view.startAnimation(animation); // ��ʼ����

	}

	public static void viewShow(RelativeLayout view) {

		RotateAnimation animation = new RotateAnimation(180, 360,
				view.getWidth() / 2, view.getHeight());
		animation.setDuration(300);
		animation.setFillAfter(true);
		view.startAnimation(animation);

	}

}
