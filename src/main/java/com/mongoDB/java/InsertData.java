package com.mongoDB.java;
import com.mongodb.MongoClient;  
import com.mongodb.client.MongoCollection;  
import com.mongodb.client.MongoDatabase;  
import org.bson.Document; 

public class InsertData {  
public static void main(String[] args){  
try{  
//---------- Connecting DataBase -------------------------//  
MongoClient mongoClient = new MongoClient( "localhost" , 27017 );  
//---------- Creating DataBase ---------------------------//  
MongoDatabase db = mongoClient.getDatabase("test");  
//---------- Creating Collection -------------------------//  
MongoCollection<Document> table = db.getCollection("primerdataset");  
//---------- Creating Document ---------------------------//    
Document doc = new Document("name", "Peter John");  
doc.append("id",12);  
doc.append("Department","IT");
//----------- Inserting Data ------------------------------//  
table.insertOne(doc);  
mongoClient.close();
}catch(Exception e){  
System.out.println(e);  
} } }  