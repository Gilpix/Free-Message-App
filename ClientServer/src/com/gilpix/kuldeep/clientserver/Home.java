package com.gilpix.kuldeep.clientserver;

import static android.text.Html.fromHtml;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		 
		
		
		 // Button shareButton = (Button) findViewById(R.id.button2);
		  final EditText text=(EditText) findViewById(R.id.editText1);
		/*  
	        shareButton.setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) { 
	          	
	          	 

	          	  
	              
	              Intent sharingIntent = new Intent(Intent.ACTION_SEND);
	              sharingIntent.setType("text/Plain");
	              sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, fromHtml("<p>This is the text that will be shared.</p>"));
	              startActivity(Intent.createChooser(sharingIntent,"Share using"));
		
	              
	            }
	        });  
	       
	      */  
	        final String msg=text.getText().toString();
	        
	        
	        
	        
	        Button shareButton1 = (Button) findViewById(R.id.button3);
			
			  
		        shareButton1.setOnClickListener(new OnClickListener() {
		            @Override
		            public void onClick(View v) { 

		    	        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND); 
		    	        sharingIntent.setType("text/plain");
		    	        
		    	      /*  String shareBody ="<div class=" + "wrapper" + ">"+
		    	        "<marquee behavior=" +"alternate" + "><span class="+"marquee"+">"+settext(msg)+"</span></marquee>"+
		    	        "</div>"+ settext(msg);
		    	        */
		    	        String shareBody =settext(msg);
		    	        
		    	        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
		    	        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
		    	        startActivity(Intent.createChooser(sharingIntent, "Share via"));
		    	        
		              
		            }

					private String settext(String msg) {
						// TODO Auto-generated method stub
						msg=text.getText().toString();
						return msg;
					}
		        });   
		        
	        
	        
	        
	        
	        
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}



/*
Button shareButton = (Button) findViewById(R.id.button2);
EditText text=(EditText) findViewById(R.id.editText1);

  shareButton.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) { 
    	
    	 

    	  
        
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/Plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>This is the text that will be shared.</p>"));
        startActivity(Intent.createChooser(sharingIntent,"Share using"));

        
      }
  });  */