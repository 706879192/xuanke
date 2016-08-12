package qq.app01.com.a20160808guoyang;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import qq.app01.com.a20160808guoyang.beans.CourseModel;

/**
 * Created by 赵文杰 on 2016/8/9.
 */
public class CourseAdapter extends BaseAdapter {

    private LayoutInflater layoutInflater;
    private List<CourseModel> list;

    public void  setList(List<CourseModel> list){
        this.list = list;
    }
    public  CourseAdapter(Context context){
        layoutInflater = LayoutInflater.from(context);

    }
    @Override
    public int getCount() {
        return list == null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.course,null);
        TextView classno_textview = (TextView) view.findViewById(R.id.classno);
        TextView classname_textview = (TextView) view.findViewById(R.id.classname);
        TextView teachername_textview = (TextView) view.findViewById(R.id.teachername);
        TextView count_textview = (TextView) view.findViewById(R.id.count);

        CourseModel courseModel = list.get(position);
        classno_textview.setText(courseModel.getClassNo());
        classname_textview.setText(courseModel.getClassName());
        teachername_textview.setText(courseModel.getTeacher().getTeacherName());
        count_textview.setText(String.valueOf(courseModel.getStudents().size()));

        return view;
    }
}
