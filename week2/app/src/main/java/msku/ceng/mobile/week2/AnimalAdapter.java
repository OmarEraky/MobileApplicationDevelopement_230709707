package msku.ceng.mobile.week2;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class AnimalAdapter extends BaseAdapter {
    private final List<Animal> animals;
    private final LayoutInflater mInflatar;

    public AnimalAdapter(Context context, List<Animal> animals) {
        this.animals = animals;
        this.mInflatar = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE
        );
    }

    @Override
    public int getCount() {
        return animals.size();
    }

    @Override
    public Object getItem(int i) {
        return animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    View rowView;
    rowView = mInflatar.inflate(R.layout.listview_row, null);
    TextView textView = (TextView) rowView.findViewById(R.id.label);
    ImageView  imageView = (ImageView) rowView.findViewById(R.id.pic);
    Animal animal = animals.get(i);
    textView.setText(animal.getType());
    imageView.setImageResource(animal.getPicId());
        return rowView;
    }
}
