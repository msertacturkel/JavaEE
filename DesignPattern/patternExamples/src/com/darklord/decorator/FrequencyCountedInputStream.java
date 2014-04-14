package com.darklord.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

public class FrequencyCountedInputStream extends FilterInputStream implements Iterable<String> {

	public FrequencyCountedInputStream(InputStream in) {
		super(in); 
		
		word = "";
		wordFrequencies = new HashMap<String, Integer>();
	}

	@Override
	public int read() throws IOException {
		int ic = super.read();
		char c = (char)ic;
		
		if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
			word = word.trim();
			
			if (word == "")
				return ic;
			
			putWord(word);
			
			word = "";
		}
		else
			word += c;
				
		return ic;
	}
	
	@Override
	public int read(byte[] buffer, int offset, int length) throws IOException {
		int result = super.read(buffer, offset, length);
		String word = "";
		char c;
		
		for (int i = offset; i < offset + result; ++i)
		{
			c = (char)buffer[i];
			
			if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
				word = word.trim();
				
				if (word == "")
					continue;
				
				putWord(word);
				
				word = "";
			}
			else
				word += c;
		}
		
		return result;
	}

	void putWord(String word) {
		Integer value = wordFrequencies.get(word);
		
		if (value == null)
			value = 0;
		
		wordFrequencies.put(word, value + 1);
	}
	
	@Override
	public Iterator<String> iterator() {
		return wordFrequencies.keySet().iterator();
	}
	
	public int getValue(String word) {
		return wordFrequencies.get(word);
	}
	
	String word;
	HashMap<String, Integer> wordFrequencies;
	
}
