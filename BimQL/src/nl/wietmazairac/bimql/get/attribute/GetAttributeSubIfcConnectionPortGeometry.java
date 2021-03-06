package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcConnectionPortGeometry;

public class GetAttributeSubIfcConnectionPortGeometry {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConnectionPortGeometry(Object object, String string) {
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
		if (string.equals("ProfileOfPort")) {
			resultList.add(((IfcConnectionPortGeometry) object).getProfileOfPort());
			 //1IfcProfileDef
		}
		else if (string.equals("LocationAtRelatingElement")) {
			resultList.add(((IfcConnectionPortGeometry) object).getLocationAtRelatingElement());
			 //1IfcAxis2Placement
		}
		else if (string.equals("LocationAtRelatedElement")) {
			resultList.add(((IfcConnectionPortGeometry) object).getLocationAtRelatedElement());
			 //1IfcAxis2Placement
		}
		return resultList;
	}
}
