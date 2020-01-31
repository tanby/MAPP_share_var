package edu.sp.p0123456.mapp_share_var;

import java.util.LinkedList;

//-- class to store variables to be shared with different classes
// eg, Activities, Adapters, SQLiteOpenHelper
public class MyData {
    public static int myvar = 100;
    public static String special = "User";
    // a sample linked list of objects of custom class User
    public static LinkedList<User> users = new LinkedList<>();
}
