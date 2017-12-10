package personal.benny.eventchecklist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by benny on 2017-11-25.
 */

public class TaskItemAdapter extends ArrayAdapter<AbstractTaskItem> {
    private Context context;
    private AbstractTaskItem[] taskItems = null;
    public TaskItemAdapter(@NonNull Context context, int resource, @NonNull AbstractTaskItem[] taskItems) {
        super(context, resource, taskItems);
        this.context = context;
        this.taskItems = taskItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) this.context).getLayoutInflater();
        convertView = inflater.inflate(R.layout.checklistrow, parent, false);
        // set up title
        TextView title = (TextView) convertView.findViewById(R.id.textView1);
        AbstractTaskItem taskItem = this.taskItems[position];
        title.setText(taskItem.getTitle());
        // set up check box
        CheckBox checkBox = (CheckBox) convertView.findViewById(R.id.checkBox1);
        checkBox.setChecked(taskItem.getIsSelected());

        return convertView;
    }
}
