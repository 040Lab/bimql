package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesClassification;

public class GetAttributeSubIfcRelAssociatesClassification {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociatesClassification(Object object, String string) {
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
		if (string.equals("RelatingClassification")) {
			resultList.add(((IfcRelAssociatesClassification) object).getRelatingClassification());
			 //1IfcClassificationNotationSelect
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssociatesClassification) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociatesClassification) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociatesClassification) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociatesClassification) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociatesClassification) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociatesClassification) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociatesClassification) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
