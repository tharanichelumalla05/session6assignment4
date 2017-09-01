/*program for showing how the unreferenced object are collected by the garbage collector*/

package session6;// here I have created a package as session6
public class GarbageCollector {
	//declares a class called GarbageCollector
		//classes are the basics of opps(object oriented programming)
	 
		 public void finalize(){
			 //public is a access modifier which defines who can access this method
			 //void is used to define return type of the method
			 
			 System.out.println("object is garbage collected");
			 } 
		//system is used to return code
		 //out is a static number
			//Println is used to print text object is garbage collected and gives output
		 public static void main(String args[]){ 
			//TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
			 
			 GarbageCollector  s1=new GarbageCollector(); //initializing new GarbageCollector s1 
			 GarbageCollector  s2=new GarbageCollector(); //initializing new GarbageCollector s2
			 s1=null;  //s1 equals to null or empty
			 s2=null;  //s2 equals to null or empty
		  System.gc();//returns  gc  
		 }  
		}  

//here I have created a package as assignment8// here I have created a package as assignment8