package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcRightCircularCylinder {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRightCircularCylinder(Object object, String string) {
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
		if (string.equals("HeightAsString")) {
			resultList.add(((IfcRightCircularCylinder) object).getHeightAsString());
			 //1String
		}
		else if (string.equals("RadiusAsString")) {
			resultList.add(((IfcRightCircularCylinder) object).getRadiusAsString());
			 //1String
		}
		else if (string.equals("Radius")) {
			resultList.add(((IfcRightCircularCylinder) object).getRadius());
			 //1double
		}
		else if (string.equals("Height")) {
			resultList.add(((IfcRightCircularCylinder) object).getHeight());
			 //1double
		}
		else if (string.equals("Dim")) {
			resultList.add(((IfcRightCircularCylinder) object).getDim());
			 //2int
		}
		else if (string.equals("Position")) {
			resultList.add(((IfcRightCircularCylinder) object).getPosition());
			 //2IfcAxis2Placement3D
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcRightCircularCylinder) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcRightCircularCylinder) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcRightCircularCylinder) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcRightCircularCylinder) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}