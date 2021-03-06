package com.cloudstew.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_display_message );

		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent
				.getStringExtra( MainActivity.EXTRA_MESSAGE );

		// Create a TextView widget
		TextView textView = new TextView( this );
		textView.setTextSize( 40 );
		textView.setGravity( Gravity.CENTER );
		textView.setText( message );

		// Set the text view as the activity layout (show it)
		setContentView( textView );
	}

}