package com.mongoDB.java;

import java.io.File;

import org.bson.Document;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class InsertImage {
	public static void main(String[] args)  {

		try {

			MongoClient mongoClient = new MongoClient( "localhost" , 27017 );  
			DB db = mongoClient.getDB("test");
			//MongoCollection table = db.getCollection("dummyColl");  
			

			String newFileName = "mkyong-java-image";

			File imageFile = new File("C:\\Users\\ssc.rbapanapalli\\Desktop\\testImage.PNG");

			// create a "photo" namespace
			GridFS gfsPhoto = new GridFS(db, "photo");

			// get image file from local drive
			GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);

			// set a new filename for identify purpose
			gfsFile.setFilename(newFileName);

			// save the image file into mongoDB
			gfsFile.save();
			System.out.println(" image saved");

			// print the result
			/*DBCursor cursor = gfsPhoto.getFileList();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}

			// get image file by it's filename
			GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);

			// save it into a new image file
			imageForOutput.writeTo("c:\\JavaWebHostingNew.png");

			// remove the image file from mongoDB
			gfsPhoto.remove(gfsPhoto.findOne(newFileName));

			System.out.println("Done");*/

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
