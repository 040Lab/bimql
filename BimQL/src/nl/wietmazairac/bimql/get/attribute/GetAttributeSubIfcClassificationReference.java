package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcClassificationReference;

public class GetAttributeSubIfcClassificationReference {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcClassificationReference(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("ReferencedSource")) {
			resultList.add(((IfcClassificationReference) object).getReferencedSource());
			 //1IfcClassification
		}
		return resultList;
	}
}
