package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcSubedge;

public class GetAttributeSubIfcSubedge {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcSubedge(Object object, String string) {
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
		if (string.equals("ParentEdge")) {
			resultList.add(((IfcSubedge) object).getParentEdge());
			 //1IfcEdge
		}
		else if (string.equals("EdgeStart")) {
			resultList.add(((IfcSubedge) object).getEdgeStart());
			 //2IfcVertex
		}
		else if (string.equals("EdgeEnd")) {
			resultList.add(((IfcSubedge) object).getEdgeEnd());
			 //2IfcVertex
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcSubedge) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcSubedge) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcSubedge) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcSubedge) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
