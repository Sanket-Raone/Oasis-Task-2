package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class area_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Square Meter";
    String toUnit = "Square Feet";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Square Meter",
            "Square Centimeter",
            "Square Kilometer",
            "Square Feet",
            "Acres", "Hectares"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(sqMeterToSqCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(sqMeterToSqKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(sqMeterToSqFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(sqMeterToAcres(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(sqMeterToHectares(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(sqCentimeterToSqMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(sqCentimeterToSqKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(sqCentimeterToSqFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(sqCentimeterToAcres(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(sqCentimeterToHectares(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(sqKilometerToSqMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(sqKilometerToSqCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(sqKilometerToSqFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(sqKilometerToAcres(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(sqKilometerToHectares(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(sqFeetToSqMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(sqFeetToSqCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(sqFeetToSqKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(sqFeetToAcres(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(sqFeetToHectares(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(AcresToSqMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(AcresToSqCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(AcresToSqKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(AcresToSqFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(AcresToHectares(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(HectaresToSqMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(HectaresToSqCentimeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(HectaresToSqKilometer(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(HectaresToSqFeet(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(HectaresToAcres(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Square Meter",
                        "Square Centimeter",
                        "Square Kilometer",
                        "Square Feet",
                        "Acres", "Hectares"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Square Meter",
                        "Square Centimeter",
                        "Square Kilometer",
                        "Square Feet",
                        "Acres", "Hectares"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });
    }

    //sqmeter
    private String sqMeterToSqCentimeter(double sqmeter) {
        double sqcentimeter = sqmeter*10000;
        return String.valueOf(sqcentimeter);
    }

    private String sqMeterToSqKilometer(double sqmeter) {
        double sqkilometer = sqmeter /1000000;
        return String.valueOf(sqkilometer);
    }

    private String sqMeterToSqFeet(double sqmeter) {
        double sqfeet = sqmeter *10.763;
        return String.valueOf(sqfeet);
    }

    private String sqMeterToAcres(double sqmeter) {
        double acres = sqmeter/4046.85;
        return String.valueOf(acres);
    }

    private String sqMeterToHectares(double sqmeter) {
        double hectares = sqmeter/ 10000;
        return String.valueOf(hectares);
    }

    //sqcentimeter
    private String sqCentimeterToSqMeter(double sqcentimeter) {
        double sqmeter = sqcentimeter*10000;
        return String.valueOf(sqmeter);
    }

    private String sqCentimeterToSqKilometer(double sqcentimeter) {
        double sqkilometer = sqcentimeter/1e+10;
        return String.valueOf(sqkilometer);
    }

    private String sqCentimeterToSqFeet(double sqcentimeter) {
        double sqfeet = sqcentimeter/929.0304;
        return String.valueOf(sqfeet);
    }

    private String sqCentimeterToAcres(double sqcentimeter) {
        double Acres = sqcentimeter/40468564;
        return String.valueOf(Acres);
    }

    private String sqCentimeterToHectares(double sqcentimeter) {
        double Hectares = sqcentimeter/100000000;
        return String.valueOf(Hectares);
    }

    //sqkilometer
    private String sqKilometerToSqMeter(double sqkilometer) {
        double sqmeter = sqkilometer * 1000000;
        return String.valueOf(sqmeter);
    }

    private String sqKilometerToSqCentimeter(double sqkilometer) {
        double sqcentimeter = sqkilometer*1e+10;
        return String.valueOf(sqcentimeter);
    }

    private String sqKilometerToSqFeet(double sqkilometer) {
        double sqfeet = sqkilometer* 10763910;
        return String.valueOf(sqfeet);
    }

    private String sqKilometerToAcres(double sqkilometer) {
        double Acres = sqkilometer* 247.1054;
        return String.valueOf(Acres);
    }

    private String sqKilometerToHectares(double sqkilometer) {
        double Hectares = sqkilometer*100;
        return String.valueOf(Hectares);
    }

    //sqfeet
    private String sqFeetToSqMeter(double rankine) {
        double sqmeter = rankine/10.763;
        return String.valueOf(sqmeter);
    }

    private String sqFeetToSqCentimeter(double rankine) {
        double sqcentimeter = rankine*929.0304;
        return String.valueOf(sqcentimeter);
    }

    private String sqFeetToSqKilometer(double rankine) {
        double sqkilometer = rankine/10763910;
        return String.valueOf(sqkilometer);
    }

    private String sqFeetToAcres(double rankine) {
        double Acres = rankine /43560;
        return String.valueOf(Acres);
    }

    private String sqFeetToHectares(double rankine) {
        double Hectares = rankine /107639.1;
        return String.valueOf(Hectares);
    }

    //Acres
    private String AcresToSqMeter(double Acres) {
        double sqmeter = Acres*4046.856;
        return String.valueOf(sqmeter);
    }

    private String AcresToSqCentimeter(double Acres) {
        double sqcentimeter = Acres *40468564 ;
        return String.valueOf(sqcentimeter);
    }

    private String AcresToSqKilometer(double Acres) {
        double sqkilometer = Acres /247.1054;
        return String.valueOf(sqkilometer);
    }

    private String AcresToSqFeet(double Acres) {
        double sqfeet = Acres*43560;
        return String.valueOf(sqfeet);
    }

    private String AcresToHectares(double Acres) {
        double Hectares = Acres /2.471054;
        return String.valueOf(Hectares);
    }

    //Hectares
    private String HectaresToSqMeter(double Hectares) {
        double sqmeter = Hectares*10000;
        return String.valueOf(sqmeter);
    }

    private String HectaresToSqCentimeter(double Hectares) {
        double sqcentimeter = Hectares/100000000;
        return String.valueOf(sqcentimeter);
    }

    private String HectaresToSqKilometer(double Hectares) {
        double sqkilometer = Hectares/100;
        return String.valueOf(sqkilometer);
    }

    private String HectaresToSqFeet(double Hectares) {
        double sqfeet = Hectares*107639.1;
        return String.valueOf(sqfeet);
    }

    private String HectaresToAcres(double Hectares) {
        double Acres = Hectares*2.471054;
        return String.valueOf(Acres);
    }
}