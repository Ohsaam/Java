package com.composite;

public class File extends Node{
	private long size;
	
	public File(String name, long size)
	{
		super(name);
		this.size = size;
	}
	
	@Override
	public long getsize()
	{
		return this.size;
	}
	
	@Override
	public boolean isFolder()
	{
		return false;
	}
	
	
}
