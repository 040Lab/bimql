package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcStructuralLoadSingleForceWarping;

public class SetAttributeSubIfcStructuralLoadSingleForceWarping {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcStructuralLoadSingleForceWarping() {
	}

	public SetAttributeSubIfcStructuralLoadSingleForceWarping(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("WarpingMoment")) {
			//1NoEList
			((IfcStructuralLoadSingleForceWarping) object).setWarpingMoment(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("WarpingMomentAsString")) {
			//1NoEList
			((IfcStructuralLoadSingleForceWarping) object).setWarpingMomentAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ForceX")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ForceY")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ForceZ")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentX")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentX(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentY")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentY(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("MomentZ")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentZ(Double.parseDouble(attributeNewValue));
			 //2void
			 //2double
		}
		else if (attributeName.equals("ForceXAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ForceYAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ForceZAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setForceZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentXAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentXAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentYAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentYAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("MomentZAsString")) {
			//2NoEList
			((IfcStructuralLoadSingleForceWarping) object).setMomentZAsString(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcStructuralLoadSingleForceWarping) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
