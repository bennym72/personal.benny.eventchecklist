package personal.benny.eventchecklist;

/**
 * Created by benny on 2017-11-25.
 */

public abstract class AbstractTaskItem {
    private String title;
    private boolean isSelected;

    AbstractTaskItem (String title, boolean isSelected) {
        this.title = title;
        this.isSelected = isSelected;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getIsSelected() {
        return this.isSelected;
    }
}
