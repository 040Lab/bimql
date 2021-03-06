package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPlanarExtent;

public class GetAttributeSubIfcPlanarExtent {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPlanarExtent(Object object, String string) {
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
		if (string.equals("SizeInXAsString")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInXAsString());
			 //1String
		}
		else if (string.equals("SizeInYAsString")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInYAsString());
			 //1String
		}
		else if (string.equals("SizeInX")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInX());
			 //1double
		}
		else if (string.equals("SizeInY")) {
			resultList.add(((IfcPlanarExtent) object).getSizeInY());
			 //1double
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarExtent) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcPlanarExtent) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPlanarExtent) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcPlanarExtent) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
