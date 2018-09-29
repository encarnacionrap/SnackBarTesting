package ph.edu.encarnacion.raphael.snackbartesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastBn =(Button)findViewById(R.id.toastBtn);
        final Button snackBn =(Button)findViewById(R.id.snackBtn);
        Button snack2Bn =(Button)findViewById(R.id.snackBtn2);

        toastBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "TOAST";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(),message,duration).show();
            }
        });
        snackBn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_activity);
                String message = "Snackbar Message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view,message,duration);
            }
        });

        snack2Bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_activity);
                String message = "Snackbar Message with Action";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view,message,duration);
            }
        });


    }
    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view,message,duration).show();

    }
    public void showSnackbarAct(View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view,message,duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    }

