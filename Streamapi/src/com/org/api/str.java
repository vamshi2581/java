package com.org.api;

import java.io.File;
import java.lang.reflect.Executable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class str {

	try {
		Stream <String> stream=Files.lines(Paths.get("/home/labuser/Desktop/vamshi/text.txt"))
				{
			stream.forEach(System.out::println);
				}catch(Exception e ) {
					e.printStackTrace(e);
				}
	}
}
