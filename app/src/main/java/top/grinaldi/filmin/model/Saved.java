package top.grinaldi.filmin.model;

/**
 * Created by Rehan on 14/05/2017.
 */

public class Saved {
    String title;
    String desc;

    public Saved() {
    }

    public Saved(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
