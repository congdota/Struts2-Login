package service;

import model.InfoPerson;

public class EditInfoImpl implements EditInfo{

	private static InfoPerson info;
	private static String[] sports = {"soccer","tennis"};

	static {
		info = new InfoPerson();
		info.setAddress("ha noi");
		info.setAge(24);
		info.setFirstName("nguyen");
		info.setGender("nam");
		info.setLastName("cong");
		info.setPhoneNumbers("01672040295");
		info.setSport(sports);
	}

	public InfoPerson getInfoPerson() {
		// TODO Auto-generated method stub
		return EditInfoImpl.info;
	}

	public void saveInfoPerson(InfoPerson infoPerson) {
		// TODO Auto-generated method stub
		EditInfoImpl.info.setAddress(infoPerson.getAddress());
		EditInfoImpl.info.setAge(infoPerson.getAge());
		EditInfoImpl.info.setFirstName(infoPerson.getFirstName());
		EditInfoImpl.info.setGender(infoPerson.getGender());
		EditInfoImpl.info.setLastName(infoPerson.getLastName());
		EditInfoImpl.info.setPhoneNumbers(infoPerson.getPhoneNumbers());
		EditInfoImpl.info.setSport(info.getSport());
	}
}
