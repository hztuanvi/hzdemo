package com.hz.dialects;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.hz.processor.PaginationProcessor;

/**
 * @author OS
 *
 */
public class CustomDialect extends AbstractProcessorDialect {

	private static final String DIALECT_NAME = "Custom Dialect";
	private static final String PREFIX = "tag";

	public CustomDialect() {
		super(DIALECT_NAME, PREFIX, StandardDialect.PROCESSOR_PRECEDENCE);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.thymeleaf.dialect.IProcessorDialect#getProcessors(java.lang.String)
	 */
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new PaginationProcessor(dialectPrefix));
		return processors;
	}

}
