package edu.framgia.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

import model.InfoPerson;
import service.EditInfo;
import service.EditInfoImpl;

public class EditAction extends ActionSupport{


	private EditInfo  edit = new EditInfoImpl();

	private InfoPerson infoPerson;

	private String[] sportList = {"football", "baseball", "basketball","soccer","tennis", "volleyball","game"};

	private String [] addressList = {"ha noi","HCM", "Da Nang"};

	private String[] genderList = {"male","female","both"};

	public EditInfo getEdit() {
		return edit;
	}

	public void setEdit(EditInfo edit) {
		this.edit = edit;
	}

	public InfoPerson getInfoPerson() {
		return infoPerson;
	}

	public void setInfoPerson(InfoPerson infoPerson) {
		this.infoPerson = infoPerson;
	}



	public String[] getSportList() {
		return sportList;
	}

	public void setSportList(String[] sportList) {
		this.sportList = sportList;
	}

	public String[] getAddressList() {
		return addressList;
	}

	public void setAddressList(String[] addressList) {
		this.addressList = addressList;
	}

	public String[] getGenderList() {
		return genderList;
	}

	public void setGenderList(String[] genderList) {
		this.genderList = genderList;
	}

	public String execute() throws Exception{
		edit.saveInfoPerson(getInfoPerson());
		return SUCCESS;
	}

	public String input() throws Exception {
		setInfoPerson(edit.getInfoPerson());
		return INPUT;
	}
}
