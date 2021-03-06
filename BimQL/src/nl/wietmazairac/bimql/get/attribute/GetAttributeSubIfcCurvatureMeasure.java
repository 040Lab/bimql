package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcCurvatureMeasure;

public class GetAttributeSubIfcCurvatureMeasure {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcCurvatureMeasure(Object object, String string) {
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
		if (string.equals("WrappedValue")) {
			resultList.add(((IfcCurvatureMeasure) object));
			 //1double
		}
		else if (string.equals("WrappedValueAsString")) {
			resultList.add(((IfcCurvatureMeasure) object).getWrappedValueAsString());
			 //1String
		}
		return resultList;
	}
}
