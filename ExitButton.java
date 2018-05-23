//Lets we create a method for exit button called "appExit()". (you can use any name for it as you wish. I named it as appExit.)
//this is the java code for exit button in MainActivity.java in Android Studio.

public void appExit(){
    Button exit = (Button) findViewById(R.id.exit);    //"exit" is the id of exit button.
    exit.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
            finish();
            System.exit(0);
        }
    });
}

//now in your activity-main.xml type below code under your exit button.

android:onClick = "appExit";

//now all done. you can use your exit button for your android app.