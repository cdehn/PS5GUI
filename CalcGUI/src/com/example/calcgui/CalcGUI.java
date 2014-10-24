package com.example.calcgui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcGUI extends Activity {

	EditText inputInvestmentAmount;
	EditText inputYears;
	EditText inputAnnualInterestRate;
	EditText displayFV;
	Button calculate;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calc_gui);
	


	calculate = (Button) findViewById(R.id.button1);
	calculate.setOnClickListener(new View.OnClickListener() {
		 
		@Override
		public void onClick(View v) {
			inputInvestmentAmount = (EditText) findViewById(R.id.inputInvestmentAmount);
			inputYears = (EditText) findViewById(R.id.inputYears);
			inputAnnualInterestRate = (EditText) findViewById(R.id.inputInterest);
						
			double investmentAmount = Double.parseDouble(inputInvestmentAmount.getText().toString());
			double years = Double.parseDouble(inputYears.getText().toString());
			double annualInterestRate = Double.parseDouble(inputAnnualInterestRate.getText().toString());
			
			double fv = Double.parseDouble(PS5engine.futureValue(investmentAmount, years, annualInterestRate));
			
			displayFV.setText(fv + "");
			

		}					
	});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calc_gui, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
