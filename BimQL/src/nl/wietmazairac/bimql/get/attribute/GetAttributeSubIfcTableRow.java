package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcTableRow;

public class GetAttributeSubIfcTableRow {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcTableRow(Object object, String string) {
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
		if (string.equals("RowCells")) {
			//3xxx
			for (int i = 0; i < ((IfcTableRow) object).getRowCells().size(); i++) {
				resultList.add(((IfcTableRow) object).getRowCells().get(i));
			}
			 //1EList
		}
		else if (string.equals("IsHeading")) {
			resultList.add(((IfcTableRow) object).getIsHeading());
			 //1Tristate
		}
		else if (string.equals("OfTable")) {
			resultList.add(((IfcTableRow) object).getOfTable());
			 //1IfcTable
		}
		return resultList;
	}
}
