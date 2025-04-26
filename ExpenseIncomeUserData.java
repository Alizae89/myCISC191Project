{\rtf1\ansi\ansicpg1252\cocoartf2761
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs24 \cf0 /**\
* Lead Author(s):\
* @author alizae; student ID\
* @author Full name; student ID\
* <<Add additional lead authors here>>\
*\
* Other Contributors:\
* Full name; student ID or contact information if not in class\
* <<Add additional contributors (mentors, tutors, friends) here, with contact information>>\
*\
* References:\
* Morelli, R., & Walde, R. (2016).\
* Java, Java, Java: Object-Oriented Problem Solving\
* https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving\
*\
* <<Add more references here>>\
*\
* Version: 2025-04-26\
*/\
package myCISC191Project;\
\
/**\
 * Purpose: The reponsibility of ExpenseIncomeUserData is ...\
 *\
 * ExpenseIncomeUserData is-a ...\
 * ExpenseIncomeUserData is ...\
 * \
 * I have started the layout of the project by implementing the user data for budgeting app.\
 * This will be similar like any type of banking app that lets users add data to view and examine\
 * their monthly spending on their expenses alongside their monthly/weekly wages.\
 */\
public class ExpenseIncomeUserData\
\{\
	private String date;\
	private String description;\
	private double transaction;\
	private String type;\
	\
	\
	\
	public ExpenseIncomeUserData(String date, String description, double transaction, String type)\
	\{\
		this.date = date;\
		this.description = description;\
		this.transaction = transaction;\
		this.type = type;\
	\}\
	\
	public String retrieveDate()\
	\{\
		return date;\
	\}\
	public String retrieveDescription()\
	\{\
		return description;\
	\}\
	public double retrieveTransaction()\
	\{\
		return transaction;\
	\}\
	public String retrieveType()\
	\{\
		return type;\
	\}\
\}\
\
}