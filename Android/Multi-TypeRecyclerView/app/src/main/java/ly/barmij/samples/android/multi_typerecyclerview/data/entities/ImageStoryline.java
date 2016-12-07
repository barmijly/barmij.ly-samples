package ly.barmij.samples.android.multi_typerecyclerview.data.entities;

import java.util.Date;

/**
 * Created by Mohammad on 12/6/2016.
 */

public class ImageStoryline {

    private String imageUrl;
    private String caption;
    private Date date;

    public ImageStoryline(String imageUrl, String caption, Date date) {
        this.imageUrl = imageUrl;
        this.caption = caption;
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
