Sign Up
=====================
Created by chenli on 6/29/16

This page is testing search functionality in Amazon.

//    |firstName|lastName|email        |password|
//    |---------|--------|-------------|--------|
//    |janet    |li      |abc1@abc3.com|11111111|
//    |mike     |wang    |abc1@abc4.com|11111111|

table: src/test/testdata.csv

* Go to landing page
* Access to sign up page


Sign up a new user
----------------
Tags: signup-simple

*Input first name "chen"
*Input last name "li"
*Input email "abcd@abcd99.com"
*Input password "12345678"
*Input the confirm password "12345678"
*Click Sign up button
*Access to application successfully



Sign up new users with datatable
----------------
Tags: datatable

*Input first name <firstName>
*Input last name <lastName>
*Input email <email>
*Input password <password>
*Input the confirm password <password>
*Click Sign up button
*Access to application successfully

____________________
These are teardown steps
* Log out