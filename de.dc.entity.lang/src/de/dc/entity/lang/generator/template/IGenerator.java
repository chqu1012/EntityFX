package de.dc.entity.lang.generator.template;

public interface IGenerator<T> {

	String gen(T t);
	
	String filename(T t);
}
