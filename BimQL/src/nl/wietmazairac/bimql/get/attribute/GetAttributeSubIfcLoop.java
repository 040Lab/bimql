package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLoop;

public class GetAttributeSubIfcLoop {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLoop(Object object, String string) {
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
		if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLoop) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLoop) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLoop) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLoop) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
