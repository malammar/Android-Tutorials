package com.cloudstew.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity
{
	public final static String EXTRA_MESSAGE = "com.cloudstew.myfirstapp.MESSAGE";

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_main );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate( R.menu.activity_main,
				menu );
		return true;
	}

	/** Called when user clicks the send button */
	public void sendMessage(View view)
	{
		// Create an intent
		Intent intent = new Intent( this,
				DisplayMessageActivity.class );
		// Get the text field
		EditText editText = (EditText) findViewById( R.id.edit_message );
		// Get it's text string
		String message = editText.getText().toString();
		// Put the string in the intent
		intent.putExtra( EXTRA_MESSAGE, message );
		// Start the activity with the intent
		startActivity( intent );
	}
}