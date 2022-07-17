package Tutorial2

import scala.io.StdIn.readInt

object Question5 extends App{

// Calculate normal hours
def Normal(hours:Int)= hours*250;

// Calculate OT hours
def OT(hours:Int)= hours*85;

//Calculate income
def Income(n_hour:Int,o_hour:Int)= Normal(n_hour) + OT(o_hour);

//Calculate tax
def Tax(income:Int) = income*.12;

//Calculate take home salary
def Take_Salary(n_hour:Int,o_hour:Int) = Income(n_hour,o_hour) - Tax(Income(n_hour,o_hour));

//Give normal hours
println("Enter the Normal working hours ");
var nrHours = readInt();

//Give OT nrHours
println("Enter the OT working hours ");
var OTHours = readInt();

printf("Take home salary is Rs. %.2f",Take_Salary(nrHours,OTHours));


}
