package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSpaceType;

public class GetAttributeSubIfcSpaceType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSpaceType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcSpaceType) object).getPredefinedType());
			 //1IfcSpaceTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcSpaceType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcSpaceType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcSpaceType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcSpaceType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcSpaceType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcSpaceType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcSpaceType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcSpaceType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcSpaceType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcSpaceType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcSpaceType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcSpaceType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcSpaceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcSpaceType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcSpaceType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcSpaceType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
