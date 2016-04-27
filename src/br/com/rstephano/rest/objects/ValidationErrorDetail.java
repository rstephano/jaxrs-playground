package br.com.rstephano.rest.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValidationErrorDetail {
	private String field;
	private String constraintName;
	private String messageTemplate;

	public ValidationErrorDetail() {
		super();
	}

	public ValidationErrorDetail(String field, String constraintName, String messageTemplate) {
		super();
		this.field = field;
		this.constraintName = constraintName;
		this.messageTemplate = messageTemplate;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getConstraintName() {
		return constraintName;
	}

	public void setConstraintName(String constraintName) {
		this.constraintName = constraintName;
	}

	public String getMessageTemplate() {
		return messageTemplate;
	}

	public void setMessageTemplate(String messageTemplate) {
		this.messageTemplate = messageTemplate;
	}
}
