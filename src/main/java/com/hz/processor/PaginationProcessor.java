package com.hz.processor;

import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.engine.AttributeName;
import org.thymeleaf.model.IProcessableElementTag;
import org.thymeleaf.processor.element.AbstractAttributeTagProcessor;
import org.thymeleaf.processor.element.IElementTagStructureHandler;
import org.thymeleaf.templatemode.TemplateMode;

/**
 * @author OS
 *
 */
public class PaginationProcessor extends AbstractAttributeTagProcessor {

	private static final String ATTR_NAME = "pagination";
	private static final int PRECEDENCE = 10000;
	private static final String TAG_NAME = "tags/PaginationProcessorTag";

	/**
	 * @param templateMode
	 * @param dialectPrefix
	 * @param elementName
	 * @param prefixElementName
	 * @param attributeName
	 * @param prefixAttributeName
	 * @param precedence
	 * @param removeAttribute
	 */
	public PaginationProcessor(String dialectPrefix) {
		super(TemplateMode.HTML, dialectPrefix, null, false, ATTR_NAME, true, PRECEDENCE, true);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.thymeleaf.processor.element.AbstractAttributeTagProcessor#doProcess(org.
	 * thymeleaf.context.ITemplateContext,
	 * org.thymeleaf.model.IProcessableElementTag,
	 * org.thymeleaf.engine.AttributeName, java.lang.String,
	 * org.thymeleaf.processor.element.IElementTagStructureHandler)
	 */
	@Override
	protected void doProcess(ITemplateContext arg0, IProcessableElementTag arg1, AttributeName arg2, String arg3,
			IElementTagStructureHandler structurehandler) {
		structurehandler.setBody("<h1>Hello nha</h1>", true);

	}

}
