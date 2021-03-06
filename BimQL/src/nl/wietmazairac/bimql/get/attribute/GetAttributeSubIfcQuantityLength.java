package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcQuantityLength;

public class GetAttributeSubIfcQuantityLength {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcQuantityLength(Object object, String string) {
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
		if (string.equals("LengthValue")) {
			resultList.add(((IfcQuantityLength) object).getLengthValue());
			 //1double
		}
		else if (string.equals("LengthValueAsString")) {
			resultList.add(((IfcQuantityLength) object).getLengthValueAsString());
			 //1String
		}
		else if (string.equals("Unit")) {
			resultList.add(((IfcQuantityLength) object).getUnit());
			 //2IfcNamedUnit
		}
		else if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcQuantityLength) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcQuantityLength) object).getPartOfComplex().get(i));
			}
			 //3EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcQuantityLength) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcQuantityLength) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
