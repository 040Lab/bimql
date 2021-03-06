package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcClassificationItem;

public class GetAttributeSubIfcClassificationItem {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcClassificationItem(Object object, String string) {
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
		if (string.equals("Notation")) {
			resultList.add(((IfcClassificationItem) object).getNotation());
			 //1IfcClassificationNotationFacet
		}
		else if (string.equals("ItemOf")) {
			resultList.add(((IfcClassificationItem) object).getItemOf());
			 //1IfcClassification
		}
		else if (string.equals("IsClassifiedItemIn")) {
			//3xxx
			for (int i = 0; i < ((IfcClassificationItem) object).getIsClassifiedItemIn().size(); i++) {
				resultList.add(((IfcClassificationItem) object).getIsClassifiedItemIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsClassifyingItemIn")) {
			//3xxx
			for (int i = 0; i < ((IfcClassificationItem) object).getIsClassifyingItemIn().size(); i++) {
				resultList.add(((IfcClassificationItem) object).getIsClassifyingItemIn().get(i));
			}
			 //1EList
		}
		else if (string.equals("Title")) {
			resultList.add(((IfcClassificationItem) object).getTitle());
			 //1String
		}
		return resultList;
	}
}
