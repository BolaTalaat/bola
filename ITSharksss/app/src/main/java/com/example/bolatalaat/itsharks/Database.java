package com.example.bolatalaat.itsharks;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Database extends SQLiteOpenHelper
{
    final static String Database_Name="It_database";
    final static int Database_version=1;
    final static String TABLE_COURSES="courses";
    final static String COURSE_ID="id";
    final static String COURSE_NAME="name";
    final static String COURSE_IMAGE="image";
    final static String COURSE_HOURS="hours";
    final static String COURSE_WEEKS="weeks";
    final static String COURSE_CONTENT="content";
    final static String COURSE_SESSION="session";
    //////////////////////////////////////////////////
    final static String TABLE_INSTRUCTORS="instructors";
    final static String INSTRUCTOR_NAME="name";
    final static String INSTRUCTOR_ID="id";
    final static String INSTRUCTOR_IMAGE="image";
    final static String INSTRUCTOR_COURSE="course";
    public Database(Context context)
    {
        super(context,Database_Name,null,Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        String CREATE_TABLE_COURSE=
                "CREATE TABLE " + TABLE_COURSES + " ("+COURSE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COURSE_NAME + " TEXT UNIQUE NOT NULL, "+
                        COURSE_HOURS + " TEXT NOT NULL, "+
                        COURSE_CONTENT + " TEXT NOT NULL, "+
                        COURSE_IMAGE + " INTEGER NOT NULL, "+
                        COURSE_SESSION + " TEXT NOT NULL, "+
                        COURSE_WEEKS + " TEXT NOT NULL "+");";
        String CREATE_TABLE_INSTRUCTORS=
                "CREATE TABLE " + TABLE_INSTRUCTORS + " ("+INSTRUCTOR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        INSTRUCTOR_NAME + " TEXT UNIQUE NOT NULL, "+
                        INSTRUCTOR_COURSE + " TEXT NOT NULL, "+
                        INSTRUCTOR_IMAGE + " INTEGER NOT NULL "+");";

        db.execSQL(CREATE_TABLE_COURSE);
        db.execSQL(CREATE_TABLE_INSTRUCTORS);
        int[] c_images= new int[]{R.drawable.java,R.drawable.android,R.drawable.asp,R.drawable.php,R.drawable.cpp,R.drawable.ccna,R.drawable.ccnp,R.drawable.oracle,R.drawable.adf,R.drawable.web_design,R.drawable.oop,R.drawable.data_structure,R.drawable.python};
        String[] c_names=new String[]{"Java","Android","C#/ASP.Net","PhP","C/C++","CCNA","CCNP","Oracle","Oracle ADF","Web Design","Object Orinted","Data Structure","Python"};
        String[] c_hours=new String[]{"104 Hours","92 Hours","100 Hours","98 Hours","40 Hours","80 Hours","80 Hours","120 Hours","114 Hours","48 Hours","35 Hours","35 Hours","46 Hours"};
        String[] c_weeks=new String[]{"9 Weeks","8 Weeks","9 Weeks","9 Weeks","4 Weeks","7 Weeks","7 Weeks","10 Weeks","10 Weeks","4 Weeks","3 Weeks","3 Weeks","4 Weeks"};
        String[] c_session=new String[]{"3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week","3 per week"};
        String[] c_content=new String[]{"JAVA \n"+"Introduction And Overview \n" +
                "\n" +
                "introduction to stand-alone application\n" +
                "overview about JDK,JVM,JRE\n" +
                "How to compile code into bytecode\n" +
                "overview about IDE\n" +
                "overview about libraries\n" +
                "Declaring and initializing variables\n" +
                "Datatypes\n" +
                "How to print in Console\n" +
                "How to scan values from user\n" +
                " Control Structure \n" +
                "\n" +
                "If, if-else statements\n" +
                "While loop\n" +
                "Do while loop\n" +
                "For & foreach loop\n" +
                "Switch statement\n" +
                "Introduction to  Dialogs and message boxes.\n" +
                " Arrays \n" +
                "\n" +
                "Arrays\n" +
                "String\n" +
                "OOP \n" +
                "\n" +
                "Overview about traditional programming,\n" +
                "Access Modifiers,\n" +
                "Introduction to classes and methods,\n" +
                "Introduction to object oriented programming\n" +
                "Encapsulation\n" +
                "Inheritance\n" +
                "Polymorphism\n" +
                "Abstraction\n" +
                "Interfaces\n" +
                "GUI \n" +
                "\n" +
                "Introduction to Graphics User Interface,\n" +
                "How to use components(Swing UI)\n" +
                " SQL \n" +
                "\n" +
                "Introduction to SQL,\n" +
                "Submitting SQL statements,\n" +
                "Retrieving and processing results.\n" +
                "JDBC \n" +
                "\n" +
                "Introduction to JDBC,\n" +
                "Choosing database drivers,\n" +
                " Connecting to a database.\n" +
                "Application Using JDBC \n" +
                "\n" +
                "Implementing application using JDBC\n" +
                "Storing And Retrieving Data With File I/O\n" +
                "\n" +
                "Reading and writing files.\n" +
                "Creating, deleting and renaming files.\n" +
                "Obtaining directory and file information.\n" +
                "Exception Handling And Threads\n" +
                "\n" +
                "Handling exceptions with try and catch.\n" +
                "Threads.\n" +
                "Project \n" +
                "\n" +
                "Project In windows Form \n" +
                "Group of 2-3 persons select an idea.\n" +
                "The lecturer discusses the code with you.",
                "ANDROID \n " +
                "Java What's Java ?\n" +
                "Java history.\n" +
                "Java Bytecode.\n" +
                "Java virtual machine.\n" +
                "JRE(Java runtime environment ).\n" +
                "JDK (Java Development kit ).\n" +
                "SDK(Software Development Kit ).\n" +
                "API(Application Programming Interfaces ).\n" +
                "Variables Data Types.\n" +
                "Strings.\n" +
                "Input-output.\n" +
                "Comments.\n" +
                "Math Operations.\n" +
                "Conditional statement (if- switch).\n" +
                "Looping.\n" +
                "Exceptions.\n" +
                "Streams (input stream- output stream).\n" +
                "Casting.\n" +
                "OOP\n" +
                "\n" +
                "Class.\n" +
                "Object Member.\n" +
                "Variable Member.\n" +
                "method.\n" +
                "Constructor.\n" +
                "Access Control Modifiers.\n" +
                "Inheritance.\n" +
                "Polymorphism.\n" +
                "Interfaces.\n" +
                "Abstraction  Introduction to Android\n" +
                "\n" +
                "What’s Android.\n" +
                "Why Android.\n" +
                "Android Market.\n" +
                "Android Versions.\n" +
                " Android Architecture\n" +
                "\n" +
                "Android Stack.\n" +
                "Android Features.\n" +
                "Android Architecture layer.\n" +
                " Tools\n" +
                "\n" +
                "SDK (software development kit ).\n" +
                "JDK (java development kit ).\n" +
                "IDE (integrated development environment.\n" +
                " Android Studio\n" +
                "\n" +
                "Setup Android Studio.\n" +
                "Android Manifest.\n" +
                "Important Folders.\n" +
                "Important Buttons.\n" +
                "LogCat.\n" +
                "Emulator  and genymotion.\n" +
                "Android Components\n" +
                "\n" +
                "Activities.\n" +
                "Services.\n" +
                "Broadcast Receivers.\n" +
                "Content Providers.\n" +
                " Building Application UI\n" +
                "\n" +
                "Material design concept.\n" +
                "Layouts.\n" +
                "Layout types.\n" +
                "View class.\n" +
                "Attributes.\n" +
                " Activities\n" +
                "\n" +
                "Life Cycle.\n" +
                "Call Back.\n" +
                "Methods Interacting with UI.\n" +
                "Resources.\n" +
                " Intents\n" +
                "\n" +
                "Explicit Intents.\n" +
                "Implicit Intent.\n" +
                "Intent Filter.\n" +
                "listView\n" +
                "\n" +
                "Adapter.\n" +
                "Listview.\n" +
                "CustomListView.\n" +
                "Networking\n" +
                "\n" +
                "Threads.\n" +
                "AsyncTask.\n" +
                "Volley library.\n" +
                "JSON Parsing.\n" +
                "Data Storing\n" +
                "\n" +
                "Shared preferences.\n" +
                "Internal storage.\n" +
                "External storage.\n" +
                "SQLite.\n" +
                "Services\n" +
                "\n" +
                "Overview of services in Android.\n" +
                "Implementing a Service.\n" +
                "a Service lifecycle.\n" +
                "Fragments\n" +
                "\n" +
                "Static.\n" +
                "Dynamic.\n" +
                "Android Fragments Tabs.\n" +
                "Camera\n" +
                "\n" +
                "Working with camera.\n" +
                "Multimedia in Android\n" +
                "\n" +
                "Simple Media Player APP.\n" +
                "Simple video playback.\n" +
                "Menus\n" +
                "\n" +
                "Context Menu.\n" +
                "Popup Menu.\n" +
                "Option Menus.\n" +
                "Notifications\n" +
                "\n" +
                "Notification properties.\n" +
                "Attach Actions to notification.\n" +
                "Pending Intent.\n" +
                "Maps and Locations\n" +
                "\n" +
                "Working with Google Maps.\n" +
                "Finding current location and listening for changes in location.\n" +
                "Working with GPS.",
                "C# / ASP.NET \n"+
                "Introduction and Principles \n" +
                "\n" +
                "Introduction\n" +
                "Reading and writing to a console\n" +
                "Built-in data types\n" +
                "String data type\n" +
                "Control Structure \n" +
                "\n" +
                "Operators\n" +
                "Nullable Types\n" +
                "Datatype conversions\n" +
                "Comments\n" +
                "If statement\n" +
                "Switch statement\n" +
                "While loop\n" +
                "Do while loop\n" +
                "For & foreach loop\n" +
                " Functions, Arrays\n" +
                "\n" +
                "arrays(one & two dimension).\n" +
                "Methods.\n" +
                "Method parameters.\n" +
                "passing array to function.\n" +
                " Classes \n" +
                "\n" +
                "Class - Introduction\n" +
                "Static & Instance members\n" +
                "Method hiding \n" +
                "Structs\n" +
                "Classes Vs Structs\n" +
                " OOP\n" +
                "\n" +
                "Encapsulations\n" +
                "Polymorphism\n" +
                "Method overriding Vs hiding\n" +
                "Method overloading. \n" +
                "Inheritance.\n" +
                "Diamond Problem\n" +
                "Multiple inheritance \n" +
                "Classes Properties \n" +
                "\n" +
                "Interfaces\n" +
                "Explicit interface implementation\n" +
                "Abstract Classes\n" +
                "Abstract Classes Vs Interfaces\n" +
                " Delegates, Exception Handling \n" +
                "\n" +
                "Delegates\n" +
                "Multicast Delegates\n" +
                "Exception Handling\n" +
                "Inner Exceptions\n" +
                "Custom Exceptions\n" +
                "Exception Handling Abuse\n" +
                "Preventing Exception Handling Abuse\n" +
                "Enums, Modifiers, Reflection\n" +
                "\n" +
                "Enums\n" +
                "Enums Concepts\n" +
                "Types vs Type Members\n" +
                "Access Modifiers - Private, Public and Protected\n" +
                "Access Modifiers - Internal and Protected Internal\n" +
                "Access Modifiers for types ,Attributes\n" +
                "Reflection\n" +
                "Late binding using reflection\n" +
                " Generics\n" +
                "\n" +
                "Generic Collections\n" +
                "Difference between Convert.ToString() and ToString() method\n" +
                "Difference between string and stringbuilder\n" +
                "Dictionary, list, Lambada\n" +
                "\n" +
                "dictionary\n" +
                "List collection class \n" +
                "When to use a dictionary over list\n" +
                "Anonymous methods\n" +
                "Lambda expression\n" +
                " ADO\n" +
                "\n" +
                "What is ADO.NET\n" +
                "SQLConnection object in ADO.NET\n" +
                "Storing and retrieving connection\n" +
                "SqlCommand in ado.net\n" +
                "Calling a stored procedure with output parameters\n" +
                "SqlDataReader object in ADO.NET\n" +
                "SqlDataReader object's NextResult() method\n" +
                "SqlDataAdapter in ADO.NET\n" +
                " Project \n" +
                "\n" +
                "Project In windows Form \n" +
                "Group of 2-3 persons select an idea.\n" +
                "The lecturer discusses the code with you.\n" +
                "Introduction to web programming and ASP.NET.\n" +
                "Create web application using Visual Studio and C#.\n" +
                "Create and add code-behind file to an ASP.NET web form.\n" +
                "Examine common ASP.NET Controls\n" +
                "Controls\n" +
                "\n" +
                "Connecting to a Database in an ASP.NET application\n" +
                "ASP.NET Data Controls.\n" +
                "Session management.\n" +
                "Validation controls.\n" +
                " Master Pages\n" +
                "\n" +
                "Master pages.\n" +
                "Configuring and deploying an ASP.NET web application\n" +
                " MVC \n" +
                "\n" +
                "Introduction to MVC 4.\n" +
                "Adding a Controller.\n" +
                "Adding a View.\n" +
                "Adding a Model.\n" +
                "Accessing your Model's data from a Controller.\n" +
                "Examining the Edit Methods and Edit View.\n" +
                "Adding new Fields.\n" +
                "Adding Validations,\n" +
                "Delete Methods\n" +
                " Database Concepts\n" +
                "\n" +
                "SQL Basics.\n" +
                "DDL,DML,DCL.\n" +
                "Join.\n" +
                "Procedures.\n" +
                "Functions.\n" +
                "Views.\n" +
                "Triggers.\n" +
                "ADO.Net\n" +
                "\n" +
                "ADO.NET Architecture.\n" +
                "Connection Object.\n" +
                "Command Object.\n" +
                "DataReader Object.\n" +
                "DataAdapter Object.\n" +
                "DataSet Object.\n" +
                "DataView Object.\n" +
                "Use ADO.NET to access data in an application.\n" +
                " LINQ\n" +
                "\n" +
                "Building to LINQ to Objects.\n" +
                "Entity Frame Work.\n" +
                "Lambada Expression ;\n" +
                "LINQ to XML.\n" +
                "LINQ to SQL.\n" +
                "Project\n" +
                "\n" +
                "Group of 2-3 persons select an idea.\n" +
                "The lecturer discusses the code with you.","Introduction\n" +
                "Introduction to World Wide Web.\n" +
                "Understanding the difference between web design and web development\n" +
                "Understanding the rules of dynamic website\n" +
                "History Understanding client/server roles Apache, PHP, MySQL, Wamp Installation, PHP Basic syntax.\n" +
                "PHP Fundamentals\n" +
                "PHP data Types.\n" +
                "PHP Variables.\n" +
                "echo / print.\n" +
                "PHP Operators.\n" +
                "Control statements\n" +
                "Conditional statements.\n" +
                "If-else\n" +
                "switch\n" +
                " Loops.\n" +
                "While\n" +
                "For\n" +
                "PHP Arrays\n" +
                "PHP Enumerated Arrays.\n" +
                "PHP Associative Arrays.\n" +
                "Array Iteration.\n" +
                "PHP Multi-Dimensional Arrays.\n" +
                "Array Functions.\n" +
                "Foreach loop\n" +
                "Array functions\n" +
                "PHP Functions \n" +
                "Understand the difference between user-defined and built-in functions\n" +
                "PHP Functions. Syntax, Arguments, Variables, References.\n" +
                "Return Values, Variable Scope.\n" +
                "How to divide your code\n" +
                "PHP include().\n" +
                "PHP require().\n" +
                "PHP Forms\n" +
                "PHP Form handling.\n" +
                "PHP GET, PHP POST, PHP Form Validation.\n" +
                "PHP Form Sanitization.\n" +
                "File uploading.\n" +
                "XSS filtering\n" +
                "How to filter your data\n" +
                "PHP Strings Handling \n" +
                "Strings and Patterns.\n" +
                "Matching, Extracting.\n" +
                "Searching Replacing.\n" +
                "Formatting, PCRE.\n" +
                "MySQL\n" +
                "Intro to the history of database\n" +
                "Difference between DBMS, DB and SQL\n" +
                "DDL \"Data Definition Language\"\n" +
                "How to design Database\n" +
                "Understanding ERD \"Entity Relationship Diagram\"\n" +
                "Understanding the relations between tables\n" +
                "How to create, alter and drop the tables\n" +
                "DML \"Data Manipulation Language\"\n" +
                "Study insert statement\n" +
                "Study update statement\n" +
                "Study delete statement\n" +
                "Study select statement\n" +
                "Select types\n" +
                "How to search in database\n" +
                "Condition operators\n" +
                "Sorting data\n" +
                "Aggregation functions\n" +
                "Joins\n" +
                "How to connect PHP with MYSQL\n" +
                "Understand the lifecycle of connection\n" +
                "Difference between MYSQL, MYSQLI and PDO\n" +
                "Implement CRUD functions for tables\n" +
                "OOP [Object Oriented Concepts]\n" +
                "Understanding the theory of OOP\n" +
                "Understanding Encapsulation\n" +
                "Inheritance\n" +
                "Polymorphism\n" +
                "Abstraction\n" +
                "PHP Cookies & PHP Sessions\n" +
                "PHP Cookie handling.\n" +
                "PHP Session Handling.\n" +
                "PHP Login Session.\n" +
                "Managing user ACL,PHP Cookie handling.\n" +
                "PHP Session Handling.\n" +
                "PHP Login Session.\n" +
                "Managing user ACL.\n" +
                "PHP AJAX and JSON\n" +
                "Submit form using AJAX and JSON\n" +
                "How to distribute you code natively to pure MVC\n" +
                "Frameworks and CMS\n" +
                "Intro to wordpress CMS\n" +
                "Intro to Codeigniter or Yii2 or Laravel framework\n" +
                "Project\n" +
                "Implementing full CMS web site\n" +
                "Hosting\n" +
                "how to book a domain?\n" +
                "how to purchase a hosting?\n" +
                "how to publish your web site","Introduction and Principles \n" +
                "What is programming language?\n" +
                "How the programs run?\n" +
                "Output functions.\n" +
                "Variables and Data types.\n" +
                "Read value from user and process it.\n" +
                "Mathematical basics.\n" +
                "Control Structure \n" +
                "Sequence Control structure.\n" +
                "Selection Control Structures.\n" +
                "If-else.\n" +
                "Dangling-else Problem\n" +
                "Repetition (Loops) \n" +
                "For, while, do-while.\n" +
                "Counter-Controlled Repetition.\n" +
                "Sentinel-Controlled Repetition.\n" +
                "Break and continue Statements.\n" +
                "Nested Control Statements.\n" +
                "Workshop 1:\n" +
                "Implementing ATM System\n" +
                "Functions \n" +
                "Function Prototypes, built in functions and user defined functions.\n" +
                "References and Reference Parameters, Scope Rules.\n" +
                "Function overloading, and Function Templates.\n" +
                "Inline Functions and recursive functions.\n" +
                "Math Library Functions.\n" +
                "Arrays\n" +
                "Introduction to arrays.\n" +
                "Passing arrays to functions.\n" +
                "Searching Arrays with Linear Search.\n" +
                "2-D arrays.\n" +
                "Multidimensional arrays. \n" +
                "Workshop 2:\n" +
                "Implementing XO game\n" +
                "Pointers\n" +
                "Call by reference, Call by value, and const member functions.\n" +
                "Pointer Variable Declarations and Initialization.\n" +
                "Pointer Operators.\n" +
                "Passing Arguments to Functions by Reference with Pointers.\n" +
                "Relationship between Pointers and Arrays.\n" +
                "Pointer-Based String Processing.\n" +
                "Advanced Topics (Search, Sort ...)\n" +
                "Bubble sort function.\n" +
                "Bubble sort using array.\n" +
                "Pointer to functions.\n" +
                "Linear search.\n" +
                "BINARYsearch.\n" +
                "Search by recursion.\n" +
                "Structures, Union and Enumeration\n" +
                "Define struct.\n" +
                "Use structs with functions.\n" +
                "Union\n" +
                "Enumeration\n" +
                "Workshop 3:\n" +
                "Implementing Pharmacy system\n" +
                "Files Streaming\n" +
                "Files and Streams.\n" +
                "Creating a Sequential File, Create, read and update file.\n" +
                "Random-Access Files.\n" +
                "Writing Data Randomly to a Random-Access File.\n" +
                "Memory Allocation and Bitwise Operators\n" +
                "Dynamic Memory allocation.\n" +
                "Bitwise Operators.\n" +
                "Function with dynamic numbers of arguments\n" +
                "Workshop 4: Project \n" +
                "Group of 2-3 persons select an idea.\n" +
                "The lecturer discusses the code with you.","Intoduction \n" +
                "OSI &TCP/IP layer.\n" +
                "Transport Layer: TCP and UDP.\n" +
                "Network Layer: IPv4 Addressing and Routing.\n" +
                "Fundamentals of Ethernet LANs.\n" +
                "Cisco Device & Cable.\n" +
                "Wireless.\n" +
                "Basic Configuration.\n" +
                "Routing\n" +
                "RIPV1&2.\n" +
                "IGRP.\n" +
                "EIGRP.\n" +
                "OSPF.\n" +
                "ISIS.\n" +
                "BGP.\n" +
                "Switching\n" +
                "Introduction.\n" +
                "VLAN.\n" +
                "VTP.\n" +
                "STP.\n" +
                "RSTP.\n" +
                "PVST+.\n" +
                "rapid-PVST+.\n" +
                "EtherChannel.\n" +
                "WAN\n" +
                "Wid Area Network.\n" +
                "ISDN.\n" +
                "HDLC & PPP.\n" +
                "Fram Relay.\n" +
                "MPLS\n" +
                "Manage IP Service\n" +
                "DNS.\n" +
                "NAT & PAT.\n" +
                "DHCP.\n" +
                "CDP.\n" +
                "VRRP.\n" +
                "HSRP.\n" +
                "GLBP.\n" +
                "Network Management\n" +
                "IOS management.\n" +
                "Backup and restore Cisco IOS .\n" +
                "Password Recovery.\n" +
                "Telnet.\n" +
                "Ping and tarceroute.\n" +
                "SNMP.\n" +
                "syslog.\n" +
                "NetFlow.\n" +
                "Security\n" +
                "Security Devices.\n" +
                "VPN.\n" +
                "Switch Security.\n" +
                "ACL Standered and Extended.\n" +
                "IPV6\n" +
                "IP Network Connectivity.\n" +
                "Communication type .\n" +
                "Translation from IPV4 to IP V6.\n" +
                "IPV6 routing Type.\n" +
                "VLAN.\n" +
                "Subnetting.","CCNP SWITCH \n" +
                "\n" +
                "Module 1: Basic Concepts and Network Design.\n" +
                "Module 2: Campus Network Architecture.\n" +
                "Module 3: Spanning Tree Implementation.\n" +
                "Module 4: Configuring Inter-VLAN Routing.\n" +
                "Module 5: Implementing High Availability Networks.\n" +
                "Module 6: First Hop Redundancy Implementation.\n" +
                "Module 7: Campus Network Security.\n" +
                "CCNP Routing  \n" +
                "\n" +
                "Module 1: Basic Network and Routing Concepts.\n" +
                "Module 2: EIGRP Implementation.\n" +
                "Module 3: OSPF Implementation.\n" +
                "Module 4: Configuration of Redistribution.\n" +
                "Module 5: Path Control Implementation.\n" +
                "Module 6: Enterprise Internet Connectivity.\n" +
                "Module 7: Routers and Routing Protocol Hardening.\n" +
                "CCNP TShoot \n" +
                "\n" +
                "Module 1: Tools and Methodologies of Troubleshooting.\n" +
                "Module 2: Troubleshooting at SECHNIK Networking Ltd.\n" +
                "Module 3: Troubleshooting at TINC Garbage Disposal Ltd.\n" +
                "Module 4: Troubleshooting at PILE Forensic Accounting Ltd.\n" +
                "Module 5: Troubleshooting at Bank of POLONA Ltd.\n" +
                "Module 6: Troubleshooting at RADULKO Transport Ltd.","Retrieving Data using the SQL SELECT Statement\n" +
                "\n" +
                "Restricting and Sorting Data\n" +
                "\n" +
                "Using Single-Row Functions to Customize Output\n" +
                "\n" +
                "Using Conversion Functions and Conditional Expressions\n" +
                "\n" +
                "Reporting Aggregated Data Using the Group Functions\n" +
                "\n" +
                "Displaying Data from Multiple Tables Using Joins\n" +
                "\n" +
                "Using Subqueries to Solve Queries\n" +
                "\n" +
                "Using the SET Operators\n" +
                "\n" +
                "Managing Tables using DML statements\n" +
                "\n" +
                "Introduction to Data Definition Language\n" +
                "\n" +
                "Introduction to Data Dictionary Views\n" +
                "\n" +
                "Creating Sequences, Synonyms, Indexes\n" +
                "\n" +
                "Creating Views\n" +
                "\n" +
                "Managing Schema Objects\n" +
                "\n" +
                "Retrieving Data by Using Subqueries\n" +
                "\n" +
                "Manipulating Data by Using Subqueries\n" +
                "\n" +
                "Controlling User Access\n" +
                "\n" +
                "Manipulating Data\n" +
                "\n" +
                "Managing Data in Different Time Zones PL/SQL Programming Concepts Review\n" +
                "\n" +
                "Designing PL/SQL Code\n" +
                "\n" +
                "Using Collections\n" +
                "\n" +
                "Manipulating Large Objects\n" +
                "\n" +
                "Using Advanced Interface Methods\n" +
                "\n" +
                "Performance and Tuning\n" +
                "\n" +
                "Improving Performance with Caching\n" +
                "\n" +
                "Analyzing PL/SQL Code\n" +
                "\n" +
                "Profiling and Tracing PL/SQL Code\n" +
                "\n" +
                "Implementing VPD with Fine-Grained Access Control\n" +
                "\n" +
                "Safeguarding Your Code Against SQL Injection Attacks","Introduction and Overview Control Structure\n" +
                "Datatypes\n" +
                "If, if-else statements\n" +
                "While loop\n" +
                "Do while loop\n" +
                "For & foreach loop\n" +
                "Arrays\n" +
                "Arrays\n" +
                "String\n" +
                "OOP\n" +
                "Overview about traditional programming,\n" +
                "Access Modifiers,\n" +
                "Introduction to classes and methods,\n" +
                "Introduction to object oriented programming\n" +
                "Encapsulation\n" +
                "Inheritance\n" +
                "Polymorphism\n" +
                "Abstraction\n" +
                "Interfaces Introduction to servlet\n" +
                "Introduction to Application Server\n" +
                "Servlet life cycle methods\n" +
                "Accessing servlet environment variables\n" +
                "Adding text fields and drop-down lists\n" +
                "Retrieving form data in the servlet\n" +
                "Accessing Databases with Servelets\n" +
                "Connecting to the database.\n" +
                "Submitting SQL statements\n" +
                "Retrieving and processing data",
                "Intro to web fundamentals\n" +
                        "Intro for Hyper Text Markup Language\n" +
                        "Understanding the web page structure\n" +
                        "How pages are executed and compiled?\n" +
                        "What the component of web pages\n" +
                        "HTML4\n" +
                        "Study the Tags of HTML4\n" +
                        "How to make good design page using HTML4\n" +
                        "HTML5\n" +
                        "Study removed tags in HTML4\n" +
                        "Study new tags in HTML5\n" +
                        "Building full structured web page using HTML4 and HTML5\n" +
                        "CSS2\n" +
                        "Study the difference between CSS [Cascading Style Sheets] and HTML\n" +
                        "The structure of CSS code\n" +
                        "How to link between HTML and CSS\n" +
                        "Study the selectors and what are their priorities\n" +
                        "Study the formatting and values of each priorities\n" +
                        "CSS3\n" +
                        "Study removed properties in CSS2\n" +
                        "Study new properties in CSS3\n" +
                        "Building full well designed web pages using HTML4, HTML5, CSS2 and CSS3\n" +
                        "PSD to HTML\n" +
                        "Understand the basics of Photoshop\n" +
                        "How you can get a free PSD template\n" +
                        "Study the principles, you should follow to convert PSD image to HTML code\n" +
                        "Workshop with converting a PSD to website\n" +
                        "JavaScript\n" +
                        "Study the principles of programming\n" +
                        "Variables\n" +
                        "Loops\n" +
                        "Conditional statements\n" +
                        "Understand DOM\n" +
                        "How to design and animate page using JavaScript\n" +
                        "How to build a plugin from scratch\n" +
                        "JQuery\n" +
                        "What and why is JQuery?\n" +
                        "The slogan of JQuery\n" +
                        "How to use JQuery\n" +
                        "What is the CDN?\n" +
                        "Study the main functions of JQuery library to animate your page\n" +
                        "How to build a plugin\n" +
                        "How to use ready plugins, how to get it and how to edit or customize it?\n" +
                        "Bootstrap\n" +
                        "Understand the concepts of responsive design\n" +
                        "Why should use bootstrap?\n" +
                        "How to build first web page using bootstrap?\n" +
                        "Understanding the grid system\n" +
                        "Study the classes of bootstrap and how to use its documentation?\n" +
                        "Project\n" +
                        "Building a web site that fits all screen devices\n" +
                        "Using all learnt technologies\n" +
                        "Workshop\n" +
                        "full day in IT Sharks, Implemting real projects as like as in a company","Introduction \n" +
                "\n" +
                "Introduction.\n" +
                "OOP History.\n" +
                "Main OOP Concepts.\n" +
                "Abstract Data types.\n" +
                "Mapping real world objects.\n" +
                "Classes And Objects\n" +
                "\n" +
                "Class Definitions, Define Objects.\n" +
                "Accessing the Class Members.\n" +
                "Member Functions and Data Members.\n" +
                "Access specifiers.\n" +
                "Constructors with Default Arguments.\n" +
                " Data Abstraction And Encapsulation\n" +
                "\n" +
                "Benefits of Data Abstraction.\n" +
                "Data Encapsulation.\n" +
                "Separating Interface from Implementation.\n" +
                "friend Functions and friend Classes.\n" +
                "Using the this Pointer.\n" +
                "Dynamic Memory Management with Operators new and delete.\n" +
                "Inheritance \n" +
                "\n" +
                "Base  Derived Classes. \n" +
                "Access Control and Inheritance.\n" +
                "Type of Inheritance. \n" +
                "Multiple Inheritances.\n" +
                "Relationship between Base Classes and Derived Classes.\n" +
                "Constructors and Destructors in Derived Classes.\n" +
                "Classes Relations \n" +
                "\n" +
                "Association.\n" +
                "Aggregation.\n" +
                "Composition.\n" +
                "Overloading(Operator And Function) \n" +
                "\n" +
                "Function overloading.\n" +
                "Operators overloading.\n" +
                "Overloadable/Non-overloadable Operators. \n" +
                "Polymorphism \n" +
                "\n" +
                "Polymorphism Concept.\n" +
                "Virtual Function.\n" +
                "Pure Virtual Functions.\n" +
                "Abstract Class.\n" +
                "Project \n" +
                "\n" +
                "Practical project.\n" +
                "Group of 2-3 persons select an idea.","Module One: Data Structure Basics \n" +
                "\n" +
                "General discussion on programming principles and software engineering Ch. 1,2.\n" +
                "The importance of Data Structures will be motivated. HW: big program involving files.\n" +
                "Growth of functions.\n" +
                "Complexity: Sec. 3.2, 3.3 from Rosen.\n" +
                "Module Two: Stack\n" +
                "\n" +
                "The concept of ADT and Stacks: contiguous implementation. (Ch. 3). \n" +
                "Stacks: linked implementation. (Ch.3).\n" +
                "Module Three: Recursion \n" +
                "\n" +
                "Recursion, Recursion vs. iteration, tail recursion, unnecessarily recursion (Ch. 3). \n" +
                "Module Four: Queues \n" +
                "\n" +
                "More on ADT and queues (contiguous implementation) Ch. 4. \n" +
                "Queues: linked implementation. \n" +
                "General lists: contiguous implementation. Ch. 4, Ch. 5.\n" +
                "Module Five: Lists \n" +
                "\n" +
                "General lists: linked implementation.\n" +
                "Sequential search Ch.5, Ch.6.\n" +
                "Module Six: Binary Search And Tree\n" +
                "\n" +
                "BINARYsearch Ch. 6. \n" +
                "Some tree terminology and rigorous analysis of BINARY search, and proving important theorems.\n" +
                "Trees and BST Ch. 9.\n" +
                "BST (cont.) including deleting nodes. \n" +
                "Graph representation and Breadth first and depth first traversal.\n" +
                "Module Seven: Project \n" +
                "\n" +
                "Group of 2-3 persons select an idea. \n" +
                "The lecturer discusses the code with you.\n" +
                "Guide you to reach for the best practical project.","Introduction and Overview \n" +
                "\n" +
                "Introduction to stand-alone application\n" +
                "Overview about Python applications\n" +
                "overview about libraries\n" +
                "Declaring and initializing variables\n" +
                "How to print in Console\n" +
                "How to scan values from user\n" +
                "Control Structure and Dictionaries\n" +
                "\n" +
                "If, if-else statements\n" +
                "While loop\n" +
                "Foreach loop\n" +
                "Switch statement\n" +
                "Introduction to  Dialogs and message boxes.\n" +
                "Built-in Functions\n" +
                "Sets\n" +
                "Dictionaries\n" +
                "Inverting a Dictionary\n" +
                "Lists And Strings\n" +
                "\n" +
                "Lists and Indices\n" +
                "Modifying Lists\n" +
                "Built-in Functions on Lists\n" +
                "Processing List Items\n" +
                "Slicing\n" +
                "Aliasing\n" +
                "Strings\n" +
                "OOP \n" +
                "\n" +
                "Overview about traditional programming,\n" +
                "Introduction to classes and methods.\n" +
                "Introduction to object oriented programming\n" +
                "Encapsulation\n" +
                "Inheritance\n" +
                "GUI\n" +
                "\n" +
                "Introduction to Graphics User Interface,\n" +
                "Tkinter Module\n" +
                "Basic GUI Construction\n" +
                "Models, Views, and Controllers\n" +
                "Style\n" +
                "SQL \n" +
                "\n" +
                "Introduction to SQL,\n" +
                "Submitting SQL statements,\n" +
                "Retrieving and processing results.\n" +
                "Python MySQldb\n" +
                "\n" +
                "Introduction to MySQl\n" +
                "Connecting to a database.\n" +
                "Retrieving Data\n" +
                "Updating and Deleting\n" +
                "Transactions\n" +
                "Application Using MySQldb \n" +
                "\n" +
                "Implementing application using MySQldb\n" +
                "Storing and Retrieving Data with File I/O\n" +
                "\n" +
                "Reading and writing files.\n" +
                "Creating, deleting and renaming files.\n" +
                "Obtaining directory and file information.\n" +
                "Handling exceptions with try and except.\n" +
                "Project \n" +
                "\n" +
                "Project In windows Form \n" +
                "Group of 2-3 persons select an idea.\n" +
                "The lecturer discusses the code with you."};

        ContentValues values=new ContentValues();

        values.put(Database.COURSE_NAME,c_names[0]);
        values.put(Database.COURSE_HOURS,c_hours[0]);
        values.put(Database.COURSE_WEEKS,c_weeks[0]);
        values.put(Database.COURSE_CONTENT,c_content[0]);
        values.put(Database.COURSE_IMAGE,c_images[0]);
        long temp=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp",temp+"");

        values.put(Database.COURSE_NAME,c_names[1]);
        values.put(Database.COURSE_HOURS,c_hours[1]);
        values.put(Database.COURSE_WEEKS,c_weeks[1]);
        values.put(Database.COURSE_CONTENT,c_content[1]);
        values.put(Database.COURSE_IMAGE,c_images[1]);
        long temp1=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp1",temp1+"");

        values.put(Database.COURSE_NAME,c_names[2]);
        values.put(Database.COURSE_HOURS,c_hours[2]);
        values.put(Database.COURSE_WEEKS,c_weeks[2]);
        values.put(Database.COURSE_CONTENT,c_content[2]);
        values.put(Database.COURSE_IMAGE,c_images[2]);
        long temp2=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp2",temp2+"");

        values.put(Database.COURSE_NAME,c_names[3]);
        values.put(Database.COURSE_HOURS,c_hours[3]);
        values.put(Database.COURSE_WEEKS,c_weeks[3]);
        values.put(Database.COURSE_CONTENT,c_content[3]);
        values.put(Database.COURSE_IMAGE,c_images[3]);
        long temp3=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp3",temp3+"");

        values.put(Database.COURSE_NAME,c_names[4]);
        values.put(Database.COURSE_HOURS,c_hours[4]);
        values.put(Database.COURSE_WEEKS,c_weeks[4]);
        values.put(Database.COURSE_CONTENT,c_content[4]);
        values.put(Database.COURSE_IMAGE,c_images[4]);
        long temp4=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp4",temp4+"");

        values.put(Database.COURSE_NAME,c_names[5]);
        values.put(Database.COURSE_HOURS,c_hours[5]);
        values.put(Database.COURSE_WEEKS,c_weeks[5]);
        values.put(Database.COURSE_CONTENT,c_content[5]);
        values.put(Database.COURSE_IMAGE,c_images[5]);
        values.put(Database.COURSE_SESSION,c_session[5]);
        long temp5=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp5",temp5+"");

        values.put(Database.COURSE_NAME,c_names[6]);
        values.put(Database.COURSE_HOURS,c_hours[6]);
        values.put(Database.COURSE_WEEKS,c_weeks[6]);
        values.put(Database.COURSE_CONTENT,c_content[6]);
        values.put(Database.COURSE_IMAGE,c_images[6]);
        long temp6=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp6",temp6+"");

        values.put(Database.COURSE_NAME,c_names[7]);
        values.put(Database.COURSE_HOURS,c_hours[7]);
        values.put(Database.COURSE_WEEKS,c_weeks[7]);
        values.put(Database.COURSE_CONTENT,c_content[7]);
        values.put(Database.COURSE_IMAGE,c_images[7]);
        long temp7=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp7",temp7+"");

        values.put(Database.COURSE_NAME,c_names[8]);
        values.put(Database.COURSE_HOURS,c_hours[8]);
        values.put(Database.COURSE_WEEKS,c_weeks[8]);
        values.put(Database.COURSE_CONTENT,c_content[8]);
        values.put(Database.COURSE_IMAGE,c_images[8]);
        long temp8=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp8",temp8+"");

        values.put(Database.COURSE_NAME,c_names[9]);
        values.put(Database.COURSE_HOURS,c_hours[9]);
        values.put(Database.COURSE_WEEKS,c_weeks[9]);
        values.put(Database.COURSE_CONTENT,c_content[9]);
        values.put(Database.COURSE_IMAGE,c_images[9]);
        long temp9=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp9",temp9+"");

        values.put(Database.COURSE_NAME,c_names[10]);
        values.put(Database.COURSE_HOURS,c_hours[10]);
        values.put(Database.COURSE_WEEKS,c_weeks[10]);
        values.put(Database.COURSE_CONTENT,c_content[10]);
        values.put(Database.COURSE_IMAGE,c_images[10]);
        long temp10=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp10",temp10+"");

        values.put(Database.COURSE_NAME,c_names[11]);
        values.put(Database.COURSE_HOURS,c_hours[11]);
        values.put(Database.COURSE_WEEKS,c_weeks[11]);
        values.put(Database.COURSE_CONTENT,c_content[11]);
        values.put(Database.COURSE_IMAGE,c_images[11]);
        long temp11=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp11",temp11+"");

        values.put(Database.COURSE_NAME,c_names[12]);
        values.put(Database.COURSE_HOURS,c_hours[12]);
        values.put(Database.COURSE_WEEKS,c_weeks[12]);
        values.put(Database.COURSE_CONTENT,c_content[12]);
        values.put(Database.COURSE_IMAGE,c_images[12]);
        long temp12=db.insert(Database.TABLE_COURSES,null,values);
        Log.d("temp12",temp12+"");

        int[]inst_images=new int[]{R.drawable.ahmedshaban,R.drawable.mahmoudahmed,R.drawable.abdelaziz,R.drawable.reham,R.drawable.mohammed,R.drawable.eslam,R.drawable.mohammedfesal,R.drawable.ahmednasser};
        String[]inst_names=new String[]{"Ahmed Shaaaban Elgendy","Mahmoud Ahmed Elsafty","Abdel-Aziz Aboul-Soud","Reham mokhtar mohamed","Muhammed Sweelam","Eslam Yousuf","Mohamed Faesal","Ahmed Nasser"};
        String[]inst_courses=new String[]{"Php Course","asp.net Diploma","Oralce Financial Course","Android Diploma","Full Java Diploma","Full Java Diploma","Course C/C++","Web Design Course"};

        ContentValues values2=new ContentValues();

        values2.put(Database.INSTRUCTOR_NAME,inst_names[0]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[0]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[0]);
        long ttemp=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp",ttemp+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[1]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[1]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[1]);
        long ttemp2=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp2",ttemp2+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[2]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[2]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[2]);
        long ttemp3=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp3",ttemp3+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[3]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[3]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[3]);
        long ttemp4=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp4",ttemp4+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[4]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[4]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[4]);
        long ttemp5=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp5",ttemp5+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[5]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[5]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[5]);
        long ttemp6=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp6",ttemp6+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[6]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[6]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[6]);
        long ttemp7=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp7",ttemp7+"");

        values2.put(Database.INSTRUCTOR_NAME,inst_names[7]);
        values2.put(Database.INSTRUCTOR_COURSE,inst_courses[7]);
        values2.put(Database.INSTRUCTOR_IMAGE,inst_images[7]);
        long ttemp8=db.insert(Database.TABLE_INSTRUCTORS,null,values2);
        Log.d("ttemp8",ttemp8+"");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
