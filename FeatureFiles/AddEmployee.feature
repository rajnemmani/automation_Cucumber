Feature:
As admin user add new Employee
@addEmp
Scenario Outline:
Add Employee with Multiple Data
Given User navigates url as "http://orangehrm.qedgetech.com/" in a browser
When user logs as "Admin" in username
And user logs as "Qedge123!@#" in password
And user click login button
Then user login success
When user clicks PIM
When user click Add button
When user enter as "<FirstName>" in frame
And user enter as "<MiddleName>" in mname
And user enter as "<LastName>" in lname
And user capture Eid before adding
And user click on save button
And user capture Eid after adding
Then user validates Eid
Then user close Browser
Examples:
|FirstName|MiddleName|LastName|
|Yashwanth1|Kumar1|Singh1|
|Yashwanth2|Kumar2|Singh2|
|Yashwanth3|Kumar3|Singh3|
|Yashwanth4|Kumar4|Singh4|
|Yashwanth5|Kumar5|Singh5|
|Yashwanth6|Kumar6|Singh6|

