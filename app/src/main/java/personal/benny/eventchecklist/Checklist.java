package personal.benny.eventchecklist;

import java.util.ArrayList;

/**
 * Created by benny on 2017-11-25.
 */

public class Checklist {
    private String title;
    private ArrayList<AbstractTaskItem> tasks;

    public Checklist(String title) {
        this.title = title;
        this.tasks = new ArrayList<AbstractTaskItem>();
    }
}
