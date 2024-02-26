package com.aazad.blog.services.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aazad.blog.services.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public String uploadImage(String path, MultipartFile file) throws IOException {
		String name = file.getOriginalFilename(); // file name -> abc.png

		String randomID = UUID.randomUUID().toString(); // random name generate file
		String fileName1 = randomID.concat(name.substring(name.lastIndexOf(".")));

		String filePath = path + File.separator + fileName1; // full path

		File fl = new File(path); // create folder if not created
		if (!fl.exists()) {
			fl.mkdir();
		}

		Files.copy(file.getInputStream(), Paths.get(filePath)); // file copy
		return fileName1;
	}

	@Override
	public InputStream getResource(String path, String fileName) throws FileNotFoundException {
		String filePath = path + File.separator + fileName;
		InputStream is = new FileInputStream(filePath);
		return is; // db logic to return inputStream
	}

}
