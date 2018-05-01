package org.secuso.privacyfriendlyweather.ui.RecycleList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import org.secuso.privacyfriendlyweather.R;

/**
 * This class defines a separator for recycler views. The code has been taken from N J's answer from
 * http://stackoverflow.com/questions/31242812/how-can-a-divider-line-be-added-in-an-android-recyclerview
 * as of 2016-09-04 and was slightly modified.
 */
public class SimpleDividerItemDecoration extends RecyclerView.ItemDecoration {

    private Drawable mDivider;

    public SimpleDividerItemDecoration(Context context) {
        mDivider = ContextCompat.getDrawable(context, R.drawable.recycle_view_line_divider);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            Log.d("debug", "Top: " + String.valueOf(top));
            int bottom = top + mDivider.getIntrinsicHeight();
            Log.d("debug", "Bottom: " + String.valueOf(top));

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }

}
