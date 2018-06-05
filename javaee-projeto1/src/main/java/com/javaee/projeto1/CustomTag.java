package com.javaee.projeto1;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag extends SimpleTagSupport{
	private boolean visible = true;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		StringBuilder sb = new StringBuilder();
		
		if(isVisible()) {
			sb.append("<button type='submit' style='color:blue; font-size:'50px'' name='botao'>Gravar ou Salvar</button>");
			getJspContext().getOut().write(sb.toString());
		}
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
