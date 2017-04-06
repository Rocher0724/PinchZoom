package choongyul.android.com.pinchzoom;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;


public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.aaa).into(imageView);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView2);
        Glide.with(this).load(R.drawable.aaa).into(photoView);


    }
}
