package nl.wietmazairac.bimql.set.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class SetAttributeSubIfcQuantityWeight {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcQuantityWeight() {
	}

	public SetAttributeSubIfcQuantityWeight(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("WeightValueAsString")) {
			//1NoEList
			((IfcQuantityWeight) object).setWeightValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WeightValue")) {
			//1NoEList
			((IfcQuantityWeight) object).setWeightValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("Unit")) {
			//2NoEList
			 //2void
			 //2IfcNamedUnit
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcQuantityWeight) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcQuantityWeight) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}