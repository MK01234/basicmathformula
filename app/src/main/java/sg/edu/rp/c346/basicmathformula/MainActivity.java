package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvmath;
    ArrayList<FormulaList> almath;
    CustomAdapter camath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvmath=findViewById(R.id.listViewmath);

        almath = new ArrayList<>();
        FormulaList math1 = new FormulaList("Area of rectangle", "Length x Length", "Formula type is: Area");
        FormulaList math2 = new FormulaList("Area of triangle", "(Length of base x Length)/2", "Formula type is: Area");
        FormulaList math3 = new FormulaList("Volume of cube", "Length x Length x Length", "Formula type is: Volume");
        almath.add(math1);
        almath.add(math2);
        almath.add(math3);

        camath = new CustomAdapter(this, R.layout.mathlis, almath);

        lvmath.setAdapter(camath);


    }
}