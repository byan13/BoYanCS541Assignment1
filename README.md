# BoYanCS541Assignment1

This app is developed for conversion between different units of length.

In the main screen after the app is opened, there will be two speed dial floating action buttons for user to choose the two units, an input edit text box for user to enter the value to be converted, an extended floating action button to perform the conversion, three dynamic and a static text view widgets for displaying the two selected units and the result of conversion.

My idea for the app is that it should have a elegant but user-friendly GUI and a robust converting function for at least one type of units, so I decide to implement the converter for length and start with GUI design.

Since there are many units for length, I choose six most common ones for everyday life, they are mile, kilometer, meter, yard,
foot and inch.
The convertsion should be between any two from the six units mentioned above, so I decide to fisrt add two speed dial buttons, each has six units as menu items.
Then I add two text view widgets for the unit that the conversion is from and the unit that the conversion is to.
Then I add an input box for user to input the value to be converted, and a text view for user to see the result of the conversion.
Finaly, I add a extened fab as the trigger button for user to perform the conversion.
Unitil now, the view part for the app is done.

Then I started the model part.
I first link the two speed dial fabs to the two unit display text view widgets, so that every time when user choose a unit from either menu, the correponding display widget will change to the user's choice.
Then I link the extend fab to the actual conversion function to grab the current two units and convert form one to the other with the value user input.
Also, if the convert button is hit wihout input anything, an error message will pop up.
The function of this app is simple, Algorithms used are just multiplaction and division with different constant parameters.

More types of units such as weight and others will be added later, after I figure out how to do multiple screens activation and different menus layouts, it will be interesting.

