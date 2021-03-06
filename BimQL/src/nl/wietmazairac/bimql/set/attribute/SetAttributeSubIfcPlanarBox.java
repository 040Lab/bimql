package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPlanarBox;

public class SetAttributeSubIfcPlanarBox {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPlanarBox() {
	}

	public SetAttributeSubIfcPlanarBox(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("Placement")) {
			//1NoEList
			 //1void
			 //1IfcAxis2Placement
		}
		else if (attributeName.equals("SizeInX")) {
			//2NoEList
			((IfcPlanarBox) object).setSizeInX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("SizeInY")) {
			//2NoEList
			((IfcPlanarBox) object).setSizeInY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("SizeInXAsString")) {
			//2NoEList
			((IfcPlanarBox) object).setSizeInXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("SizeInYAsString")) {
			//2NoEList
			((IfcPlanarBox) object).setSizeInYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else {
		}
	}
}
