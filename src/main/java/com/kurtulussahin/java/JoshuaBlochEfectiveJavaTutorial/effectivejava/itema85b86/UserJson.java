package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema85b86;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonView;

public class UserJson {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		User user = new User();
		user.setId(34);
		user.setName("Eric Clapton");
		
		String filePath = "/home/acer/IdeaProjects/java-education/src/com/kurtulussahin/java/JoshuaBlochEfectiveJavaTutorial/effectivejava/itema85b86/user.json";
		
		File file = new File(filePath);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, user);
		
		User deserializedUser = mapper.readValue(new File(filePath), User.class);
		
		System.out.println(deserializedUser.toString());
		
		
		/*
		 * eğer serial versiyon vermezsen sistem kendi yapısına göre kriptografik karma işlemiyle kendi oto üretir MALİYET
		 * Hata ve güvenlik açıklıkları
		 * 
		 * 
		 * 
		 */
		
	}
	
}
