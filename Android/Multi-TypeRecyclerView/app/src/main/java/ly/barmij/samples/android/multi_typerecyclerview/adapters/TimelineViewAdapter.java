package ly.barmij.samples.android.multi_typerecyclerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import ly.barmij.samples.android.multi_typerecyclerview.R;
import ly.barmij.samples.android.multi_typerecyclerview.data.entities.ImageStoryline;
import ly.barmij.samples.android.multi_typerecyclerview.data.entities.TextStoryline;
import ly.barmij.samples.android.multi_typerecyclerview.widgets.ImageStorylineViewHolder;
import ly.barmij.samples.android.multi_typerecyclerview.widgets.TextStorylineViewHolder;

/**
 * Created by Mohammad on 12/6/2016.
 */

public class TimelineViewAdapter extends RecyclerView.Adapter {

    private List<Object> items;

    private final static int VIEW_TYPE_SIMPLE_TEXT_STORY = 0;
    private final static int VIEW_TYPE_IMAGE_STORY = 1;

    public TimelineViewAdapter() {
        items = new ArrayList<>();
        items.add(new TextStoryline(
                "Story line 1",
                Date.valueOf("2016-12-06")
        ));
        items.add(new TextStoryline(
                "Story line 2",
                Date.valueOf("2016-12-05")
        ));
        items.add(new ImageStoryline(
                "http://images.com/image1.jpg", // dummy invalid url
                "Image 1",
                Date.valueOf("2016-12-05")
        ));
        items.add(new TextStoryline(
                "Story line 3",
                Date.valueOf("2016-12-05")
        ));
        // Add as many items as needed
        items.add(new ImageStoryline(
                "http://images.com/image2.jpg", // dummy invalid url
                "Image 2",
                Date.valueOf("2016-12-05")
        ));
        items.add(new TextStoryline(
                "Story line 4",
                Date.valueOf("2016-12-05")
        ));
        items.add(new TextStoryline(
                "Story line 5",
                Date.valueOf("2016-12-05")
        ));
        items.add(new ImageStoryline(
                "http://images.com/image3.jpg", // dummy invalid url
                "Image 3",
                Date.valueOf("2016-12-05")
        ));
        items.add(new ImageStoryline(
                "http://images.com/image4.jpg", // dummy invalid url
                "Image 4",
                Date.valueOf("2016-12-05")
        ));
        items.add(new TextStoryline(
                "Story line 6",
                Date.valueOf("2016-12-05")
        ));
    }

    @Override
    public int getItemViewType(int position) {
        Object item = items.get(position);
        if (item instanceof TextStoryline) {
            return VIEW_TYPE_SIMPLE_TEXT_STORY;
        } else if (item instanceof ImageStoryline) {
            return VIEW_TYPE_IMAGE_STORY;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case VIEW_TYPE_SIMPLE_TEXT_STORY: {
                View view = LayoutInflater
                        .from(
                                parent.getContext()
                        )
                        .inflate(
                                R.layout.text_story_line_view_holder,
                                parent,
                                false
                        );
                return new TextStorylineViewHolder(view);
            }
            case VIEW_TYPE_IMAGE_STORY: {
                View view = LayoutInflater
                        .from(
                                parent.getContext()
                        )
                        .inflate(
                                R.layout.image_story_line_view_holder,
                                parent,
                                false
                        );
                return new ImageStorylineViewHolder(view);
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case VIEW_TYPE_SIMPLE_TEXT_STORY: {
                ((TextStorylineViewHolder) holder).bindStoryLine(
                        (TextStoryline) items.get(position)
                );
                return;
            }
            case VIEW_TYPE_IMAGE_STORY: {
                ((ImageStorylineViewHolder) holder).bindStoryLine(
                        (ImageStoryline) items.get(position)
                );
                return;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}