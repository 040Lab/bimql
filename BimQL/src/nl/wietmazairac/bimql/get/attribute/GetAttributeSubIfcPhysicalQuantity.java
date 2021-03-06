package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPhysicalQuantity;

public class GetAttributeSubIfcPhysicalQuantity {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPhysicalQuantity(Object object, String string) {
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
		if (string.equals("PartOfComplex")) {
			//3xxx
			for (int i = 0; i < ((IfcPhysicalQuantity) object).getPartOfComplex().size(); i++) {
				resultList.add(((IfcPhysicalQuantity) object).getPartOfComplex().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPhysicalQuantity) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPhysicalQuantity) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
