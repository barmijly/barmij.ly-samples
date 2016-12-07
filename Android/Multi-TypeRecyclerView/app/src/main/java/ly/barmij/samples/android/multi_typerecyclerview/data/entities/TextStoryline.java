package ly.barmij.samples.android.multi_typerecyclerview.data.entities;

import java.util.Date;

/**
 * Created by Mohammad on 12/6/2016.
 */

public class TextStoryline {

    private String story;
    private Date date;

    public TextStoryline(String story, Date date) {
        this.story = story;
        this.date = date;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
