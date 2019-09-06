package com.example.unitconverterbeta;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import io.github.yavski.fabspeeddial.FabSpeedDial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FabSpeedDial sdFabLeft = findViewById(R.id.sdFabLeft);
        final TextView from = findViewById(R.id.from);
        from.setTextColor(Color.parseColor("Blue"));
        sdFabLeft.setMenuListener(new FabSpeedDial.MenuListener() {
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            public boolean onMenuItemSelected(MenuItem menuItem) {
                from.setText(menuItem.getTitle().subSequence(4, menuItem.getTitle().length()));
                return true;
            }

            public void onMenuClosed() {

            }
        });

        FabSpeedDial sdFabRight = findViewById(R.id.sdFabRight);
        final TextView to = findViewById(R.id.to);
        to.setTextColor(Color.parseColor("Blue"));
        sdFabRight.setMenuListener(new FabSpeedDial.MenuListener() {
            public boolean onPrepareMenu(NavigationMenu navigationMenu) {
                return true;
            }

            public boolean onMenuItemSelected(MenuItem menuItem) {
                to.setText(menuItem.getTitle().subSequence(2, menuItem.getTitle().length()));
                return true;
            }

            public void onMenuClosed() {

            }
        });

        ExtendedFloatingActionButton exFabConvert = findViewById(R.id.exFabConvert);
        final TextView output = findViewById(R.id.output);
        output.setTextColor(Color.parseColor("Red"));
        final EditText input = findViewById(R.id.input);
        exFabConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputString = input.getText().toString();
                if (inputString.isEmpty()) {
                    output.setText("Nothing to be converted!");
                } else {
                    double inputNumber = Double.parseDouble(inputString);
                    String inputUnit = from.getText().toString();
                    String outputUnit = to.getText().toString();
                    switch (inputUnit){
                        case " miles":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber * 1.609344));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber * 1609.344));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber * 1760));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber * 5280));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 63360));
                                    break;
                            }
                            break;
                        case " kilometers":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber / 1.609));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber * 1000));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber * 1093.613));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber * 3280.84));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 39370.079));
                                    break;
                            }
                            break;
                        case " meters":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber / 1609.344));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber / 1000));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber * 1.094));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber * 3.281));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 39.37));
                                    break;
                            }
                            break;
                        case " yards":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber / 1760));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber / 1093.613));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber / 1.094));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber * 3));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 36));
                                    break;
                            }
                            break;
                        case " feet":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber / 5280));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber / 3280.84));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber / 3.281));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber / 3));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 12));
                                    break;
                            }
                            break;
                        case " inches":
                            switch (outputUnit){
                                case " miles":
                                    output.setText(Double.toString(inputNumber / 63360));
                                    break;
                                case " kilometers":
                                    output.setText(Double.toString(inputNumber / 39370.079));
                                    break;
                                case " meters":
                                    output.setText(Double.toString(inputNumber / 39.37));
                                    break;
                                case " yards":
                                    output.setText(Double.toString(inputNumber / 36));
                                    break;
                                case " feet":
                                    output.setText(Double.toString(inputNumber / 12));
                                    break;
                                case " inches":
                                    output.setText(Double.toString(inputNumber * 1));
                                    break;
                            }
                            break;
                    }
                }
            }
        });
    }
}
