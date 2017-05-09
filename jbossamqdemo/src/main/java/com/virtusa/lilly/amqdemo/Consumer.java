/**
 * Copyright (c) 2017 Eli Lilly and Company.  All rights reserved.
 */
package com.virtusa.lilly.amqdemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 * @author C241920
 *
 */
public class Consumer implements Processor{

	/* (non-Javadoc)
	 * @see org.apache.camel.Processor#process(org.apache.camel.Exchange)
	 */
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("consumed message is"+exchange.getIn().getBody());
	}

}
