package es.quizit.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View.OnClickListener commonOnClickListener = new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				showToast((String) ((Button)v).getText());
			}
		};

		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(commonOnClickListener);

		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(commonOnClickListener);

		Button button3 = (Button) findViewById(R.id.button3);
		button3.setOnClickListener(commonOnClickListener);

		Button button4 = (Button) findViewById(R.id.button4);
		button4.setOnClickListener(commonOnClickListener);

		Button button5 = (Button) findViewById(R.id.button5);
		button5.setOnClickListener(commonOnClickListener);

		Button button6 = (Button) findViewById(R.id.button6);
		button6.setOnClickListener(commonOnClickListener);
	}

	private void showToast(String app_to_show) {
		Toast.makeText(this, "This button will launch " + app_to_show +"!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
