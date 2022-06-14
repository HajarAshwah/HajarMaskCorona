package MyData;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.amitshekhar.tflite.R;

public class Adapter {

    public void getView(int position, @NonNull View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.withoutmask_item_layout, parent, false);
        WithoutMask item = getItem(position);
        ImageView img= v.findViewById(R.id.itmImg);
        ImageView delete = v.findViewById(R.id.itmButtonDelete);
    }

    private WithoutMask getItem(int position) {
    }
}

