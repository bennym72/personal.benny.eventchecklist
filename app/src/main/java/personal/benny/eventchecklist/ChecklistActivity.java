package personal.benny.eventchecklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChecklistActivity extends AppCompatActivity {
    private ListView taskListView;
    private ArrayList<AbstractTaskItem> taskListItems;
    private TaskItemAdapter taskListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checklist);

        taskListView = (ListView) findViewById(R.id.taskListView);
        taskListItems = new ArrayList<AbstractTaskItem>();
        AbstractTaskItem [] items = (AbstractTaskItem[]) taskListItems.toArray();
        taskListAdapter = new TaskItemAdapter(this, 0, items);
        taskListView.setAdapter(taskListAdapter);
    }
}
