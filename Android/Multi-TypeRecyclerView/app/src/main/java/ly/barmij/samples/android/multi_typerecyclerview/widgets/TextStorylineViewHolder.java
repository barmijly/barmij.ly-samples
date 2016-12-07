package ly.barmij.samples.android.multi_typerecyclerview.widgets;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import ly.barmij.samples.android.multi_typerecyclerview.R;
import ly.barmij.samples.android.multi_typerecyclerview.data.entities.TextStoryline;

/**
 * Created by Mohammad on 12/6/2016.
 */

public class TextStorylineViewHolder extends RecyclerView.ViewHolder {

    private TextView storyView;

    public TextStorylineViewHolder(View itemView) {
        super(itemView);
        storyView = (TextView) itemView.findViewById(R.id.text_story_line);
    }

    public void bindStoryLine(TextStoryline storyline) {
        storyView.setText(
                storyline.getStory()
        );
    }
}
