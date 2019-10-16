package com.pandy.desigin.pattern.orderpattern.pro;

import com.pandy.designpattern.orderpattern.pro.Command;

public class ConcreteCommand1 extends Command {

	
	private Receiver receiver;
	
	public ConcreteCommand1(Receiver _receiver) {
		// TODO Auto-generated constructor stub
		
		this.receiver = _receiver;
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
