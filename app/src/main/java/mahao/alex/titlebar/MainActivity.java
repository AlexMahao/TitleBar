package mahao.alex.titlebar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ((TitleBar) findViewById(R.id.titlebar1)).setTitleBarClickListener(new TitleBar.TitleBarClickListener(){

            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this, "back", Toast.LENGTH_SHORT).show();
            }
        });

        ((TitleBar) findViewById(R.id.titlebar2)).setTitleBarClickListener(new TitleBar.TitleBarClickListener(){

            @Override
            public void onLeftClick() {
                Toast.makeText(MainActivity.this, "左菜单", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCenterClick() {
                Toast.makeText(MainActivity.this, "中", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRightClick() {
                Toast.makeText(MainActivity.this, "右", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
