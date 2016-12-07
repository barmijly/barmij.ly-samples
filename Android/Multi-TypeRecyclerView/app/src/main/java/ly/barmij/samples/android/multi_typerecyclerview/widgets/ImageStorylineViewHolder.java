package ly.barmij.samples.android.multi_typerecyclerview.widgets;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import ly.barmij.samples.android.multi_typerecyclerview.R;
import ly.barmij.samples.android.multi_typerecyclerview.data.entities.ImageStoryline;
import ly.barmij.samples.android.multi_typerecyclerview.data.entities.TextStoryline;

/**
 * Created by Mohammad on 12/6/2016.
 */

public class ImageStorylineViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView imageCaptionView;

    public ImageStorylineViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image_story_line);
        imageCaptionView = (TextView) itemView.findViewById(R.id.image_caption);
    }

    public void bindStoryLine(ImageStoryline storyline) {
        imageCaptionView.setText(
                storyline.getCaption()
        );
    }
}
