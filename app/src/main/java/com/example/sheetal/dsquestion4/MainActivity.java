package com.example.sheetal.dsquestion4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    Button btn;
    private String flag = null;
   public TextView textView,textView1,textView2,textView3;
    String[] FruitNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.FruitsName);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        FruitNames = getResources().getStringArray(R.array.Fruit_name);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, FruitNames);
        autoCompleteTextView.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            String data = null;
            String finaldata = null;
            String value = null;
            @Override
            public void onClick(View view) {
                data=  autoCompleteTextView.getText().toString();
               finaldata = showDetails(data);
             //  String k[]= finaldata.split("-");
               //value =k[0];
              // textView.setText(k[0]);
                notfound(data);
                Toast.makeText(MainActivity.this, finaldata,Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void notfound(String data) {
        if(data.equals("Ap")||(data.equals("A")||(data.equals("App")))){
            textView.setText("Do you mean?");
            textView1.setText("Apple");
            textView2.setText("Almond");
            textView3.setText("Ant");
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," A kind of fruit",Toast.LENGTH_SHORT).show();
                }
            });

            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," A kind of dry fruit",Toast.LENGTH_SHORT).show();
                }
            });

            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," A kind of animal",Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(data.equals("Ba")||(data.equals("Bana")||(data.equals("Ban")))){
            textView.setText("Do you mean?");
            textView1.setText("Banana");
            textView2.setText("Boy");
            textView3.setText("Ball");
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," A kind of fruit",Toast.LENGTH_SHORT).show();
                }
            });

            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," Gender",Toast.LENGTH_SHORT).show();
                }
            });

            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this," A kind of playing Thing",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    private String showDetails(String data) {


        if (data.equals("Apple")) {
            clearText();
            return "A kind of fruit.";
        }
        if (data.equals("Banana")) {
            clearText();
            return "A kind of fruit";
        }
        if (data.equals("Cat")) {
            clearText();
            return "A kind of animal";
        }
        if (data.equals("Dog")) {
            clearText();
            return "A kind of animal";
        }
        if (data.equals("Eye")) {
            clearText();
            return "Body part.";
        }
        if (data.equals("Frog")) {
            clearText();
            return "A kind of animal";
        }
        if (data.equals("Goat")) {
            clearText();
            return "A kind of animal";
        }
        if (data.equals("Hen")) {
            clearText();
            return "A kind of Bird";
        }
        if (data.equals("Ice")) {
            clearText();
            return "Water in solid state";
        }

        if (data.equals("Jam")) {
            clearText();
            return "Breakfast Item";
        }
        if (data.equals("Kite")) {
            clearText();
            return "A kind of Bird";
        }
        if (data.equals("Love")) {
            clearText();
            return "A kind of Feeling";
        }
        if (data.equals("Monkey")) {
            clearText();
            return "A kind of animal";
        }
        if (data.equals("Null")) {
            clearText();
            return "Nothing";
        }
        if (data.equals("Owl")) {
            clearText();
            return "A kind of Bird";
        }
        if (data.equals("Parrot")) {
            clearText();
            return "A kind of bird";
        }
        if (data.equals("Queen")) {
            clearText();
            return "King's Wife";
        }
        if (data.equals("Rat")) {
            clearText();
            return "A kind of Animal";
        }
        if (data.equals("Saturday")) {
            clearText();
            return "A day in week";
        }
        if (data.equals("Ten")) {
            clearText();
            return "Spelling of  number 10";
        }
        if (data.equals("Umbrella")) {
            clearText();
            return "Protector ";
        }
        if (data.equals("Van")) {
            clearText();
            return "A kind of Bus";
        }
        if (data.equals("Watch")) {
            clearText();
            return "A kind of time telling Machine";
        }
        if (data.equals("Xmas")) {
            clearText();
            return "A kind of tree";
        }
        if (data.equals("Yogurt")) {
            clearText();
            return "Eatable thing";
        }
        if (data.equals("Zebra")) {
            clearText();
            return "A kind of animal";
        } else {
            return "Not present in list.";
        }
    }

    public void clearText() {
        textView.setText("");
        textView1.setText("");
        textView2.setText("");
        textView3.setText("");

    }
}