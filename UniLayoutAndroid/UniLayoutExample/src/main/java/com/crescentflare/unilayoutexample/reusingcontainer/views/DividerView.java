package com.crescentflare.unilayoutexample.reusingcontainer.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;

import com.crescentflare.unilayout.containers.UniFrameContainer;
import com.crescentflare.unilayout.helpers.UniLayoutParams;
import com.crescentflare.unilayout.views.UniView;
import com.crescentflare.unilayoutexample.R;

/**
 * Reusing container example: divider view
 * A view type in the reusing container showing a divider for styling purposes
 */
public class DividerView extends UniFrameContainer
{
    // ---
    // Members
    // ---

    private UniView lineView;


    // ---
    // Initialization
    // ---

    public DividerView(Context context, boolean bottom)
    {
        super(context);

        LayoutInflater.from(getContext()).inflate(R.layout.view_divider, this, true);
        lineView = (UniView)findViewById(R.id.view_divider_line);
        if (!bottom)
        {
            ((UniLayoutParams)lineView.getLayoutParams()).verticalGravity = 1;
        }
    }

    @Override
    public void setLayoutParams(LayoutParams params)
    {
        params.width = LayoutParams.MATCH_PARENT;
        params.height = (int)(getResources().getDisplayMetrics().density * 6);
        super.setLayoutParams(params);
    }
}
