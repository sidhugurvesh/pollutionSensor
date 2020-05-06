A ‘pollution index’ sensor is used to measure how much pollution is detected in the air.

 

You have been hired to write a PollutionSensor class that can store 100 readings and perform some basic analysis of these readings.  Read through ALL of the instructions below BEFORE ATTEMPTING the question.

This PollutionSensor class will have the following:

Instance Variables:

a serialNumber of type int (This is the way that a PollutionSensor can be identified.)
an array of doubles called pollutionReadings that can accommodate 100 doubles – Each of these doubles represents an ‘amount of pollution in the air’ reading taken by the sensor when the recordReading method is called.
an int called numReadings - This variable contains the count of how many readings have been stored in the pollutionReadings array so far
Methods 

(Write ONLY the methods listed below – You do not have to write getters/setters unless asked to):
A constructor which can accept either no arguments or one argument used to set the serialNumber.
A setter for serialNumber. 
A method called retrieveAllReadings that accepts no arguments and returns a String containing all of the pollutionReadings array readings that have been stored in the sensor in the following format:
Readings for <serialNumber> :  <reading 0>, <reading 1>, <reading 2>…
Example:
pollution readings for sensor SN#425: 45.26,  25.41, 12.58, …

Bonus – Make each reading show only 2 decimal places using String.format – Remember, %.2f will give you 2 digits after the decimal.  Don’t do this until you are done everything else!
A method called recordReading which will accept no arguments and return no values.  When called, this method will add a random ‘pollution reading’ (between 0-100) to the next empty spot in the pollutionReadings array. 
Hint 1– numReadings should always hold the count of how many readings have already been stored.
Hint 2- Recall that, after instantiating a Random object and assigning it to a reference variable called rnd, the syntax to get a double between 0-100 is: rnd.nextDouble()*100;
A method called getLargestReading that will return the highest value currently stored in pollutionReadings array.
A method called getReadingsOver that will accept a double and will return a count of how many values in the pollutionReadings array are larger than the value passed in.
For example, if we pass 39 to getReadingsOver, it will return a count of how many values in pollutionReadings are over 39.  Your code must work for any value passed.
Now, overload getReadingsOver so that it can be called with no arguments passed to it.  If it is called in this fashion, assume that the threshold is 40 and that the method will return a count of how may values in the pollutionReadings array are more than 40.
Next, write a class called Exam1 that has a main method and:

 will instantiate a PollutionSensor object using constructor injection to set the serialNumber to “425”.
Next, call recordReading 35 times to have the PollutionSensor store 35 ‘pollution index’ readings.
Now print out the largest ‘pollution index’ that has been recorded
Next, print out the number of readings that over 46.
Finally, print out the number of ‘pollution index’ readings that are over 30 but don’t pass any value to the method that you call.  Your overloaded method should handle this.