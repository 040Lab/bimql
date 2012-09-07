package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;
import java.util.List;

import org.bimserver.ifc.*;
import org.bimserver.emf.*;
import org.bimserver.models.ifc2x3.*;

public class GetAttributeSubIfcLibraryInformation {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLibraryInformation(Object object, String string) {
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
		if (string.equals("VersionDate")) {
			resultList.add(((IfcLibraryInformation) object).getVersionDate());
			 //1IfcCalendarDate
		}
		else if (string.equals("LibraryReference")) {
			//3xxx
			for (int i = 0; i < ((IfcLibraryInformation) object).getLibraryReference().size(); i++) {
				resultList.add(((IfcLibraryInformation) object).getLibraryReference().get(i));
			}
			 //1EList
		}
		else if (string.equals("Publisher")) {
			resultList.add(((IfcLibraryInformation) object).getPublisher());
			 //1IfcOrganization
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcLibraryInformation) object).getName());
			 //1String
		}
		else if (string.equals("Version")) {
			resultList.add(((IfcLibraryInformation) object).getVersion());
			 //1String
		}
		return resultList;
	}
}