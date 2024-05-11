Payment Deposite and Withdraw Operation. 

Problem Statement - (3 Hrs)
1) Write an application based on below details,
1. The application when executed should show menu like the one given
below,
Customer
1. Customer Login
2. New Customer Sign in
3. Exit
● When selected with option “1”, you have to get the CustName and
Password from the Customer, and validate the data with the value
stored inside the database(as given when the option 2 of the menu
gets executed).
● If CustName and Password is valid, display a message “Welcome
‘CustName(As you received from the Customer)’…..
○ After displaying message , show menu like below
Account Details
a) Amount Deposit
b) Amount Withdrawal
c) Check Balance
d) Exit
❖ After displaying the menu as above,
● If the user selects the option as ‘a’, get the amount to be
deposited from the user.
○ The amount entered by the user should be greater than 0
and should not be a negative number, if it is, you have to
get the amount from the user till he entered a valid
amount.
○ After entering the amount display the current balance of
the user and display the below menu again,
Account Details
e) Amount Deposit
f) Amount Withdrawal
g) Check Balance
h) Exit
● If the user selects the option as ‘b’, get the amount to be withdrawn from the
user.
● The amount entered by the user should be greater than 0 and should not be a
negative number, if it is, you have to get the amount from the user till he
entered a valid amount.
● After entering the amount to be withdrawn, deduct the amount from the
current balance (If the amount entered by user is greater than the current
balance of the user, display proper message and request the user to enter the
amount to be withdrawn again).
● If withdrawn successfully, Display the current balance of the user and display
the below menu again,
Account Details
i) Amount Deposit
j) Amount Withdrawal
k) Check Balance
l) Exit
● If the user selects the option as ‘c’, display the current balance of the user.
○ Display the current balance of the user and display the below menu
again,
Account Details
m)Amount Deposit
n) Amount Withdrawal
o) Check Balance
p) Exit
● If the user selects the option as ‘d’, exit the menu and display the below menu,
➢ Customer
■ Customer Login
■ New Customer Sign in
■ Exit
❖ When selected with option “2”, read the customer details from the customer
and store inside a database table (Design the database table as per the fields
required for storing the customer details). Have to do the proper validations
for all the details entered from the customer to the database table.
❖ If CustName and Password are not valid, display a message “Not a valid
customer… “
❖ After displaying the above message, show the below menu
Customer
4. Customer Login
5. New Customer Sign in
6. Exit
❖ If option 3 selected come out of the application, Display a message,
“Exited Application successfully…”
❖ Follow the object-oriented concepts of Python/Java as required in program,
exceptions and include comments.
