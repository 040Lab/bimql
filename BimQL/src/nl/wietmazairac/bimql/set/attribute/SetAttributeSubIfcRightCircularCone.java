package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRightCircularCone;

public class SetAttributeSubIfcRightCircularCone {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRightCircularCone() {
	}

	public SetAttributeSubIfcRightCircularCone(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Height")) {
			//1NoEList
			((IfcRightCircularCone) object).setHeight(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("HeightAsString")) {
			//1NoEList
			((IfcRightCircularCone) object).setHeightAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BottomRadius")) {
			//1NoEList
			((IfcRightCircularCone) object).setBottomRadius(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BottomRadiusAsString")) {
			//1NoEList
			((IfcRightCircularCone) object).setBottomRadiusAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Dim")) {
			//2NoEList
			 //2void
			 //2int
		}
		else if (attributeName.equals("Position")) {
			//2NoEList
			 //2void
			 //2IfcAxis2Placement3D
		}
		else {
		}
	}
}
