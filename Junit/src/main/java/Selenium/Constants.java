package Selenium;
import java.lang.reflect.Field;

public class Constants {

	
private ReadXmlFile readXml;
	
	public String search = "search";
	public String photo = "photo";
	public String serchbutton = "serchbutton";
	public String print = "print";
	public String pharmacymouseover = "pharmacymouseover";
	public String refillprescriptions = "refillprescriptions";
	public String register = "register";
	public String signup = "signup";
	public String firstname = "firstname";
	public String firstnamevalue = "firstnamevalue";
	public String lastname = "lastname";
	public String lastnamevalue = "lastnamevalue";
	public String email = "email";
	public String emailvaluve = "emailvaluve";
	public String confirmemailAddress = "confirmemailAddress";
	public String confirmemailAddressvalue = "confirmemailAddressvalue";
	public String password = "password";
	public String passwordvalue = "passwordvalue";
	public String confirmpassword = "confirmpassword";
	public String confirmpasswordvalue = "confirmpasswordvalue";
	
	

	public String submit = "submit";
	public String alertAccept ="alertAccept";

	
	public void xmlReader() {
		try {
			
			readXml.loadConstants();
			Field[] arrayOfField1 = super.getClass().getFields();
			Field[] arrayOfField2 = arrayOfField1;
			int i = arrayOfField2.length;
			for (int j = 0; j < i; ++j) {
				Field localField = arrayOfField2[j];
				Object localObject = localField.get(this);
				if (localObject instanceof String)
					localField
							.set(this, readXml.getValue((String) localObject));

			}
			
		} catch (Exception localException) {
			throw new RuntimeException("Loading "
					+ super.getClass().getSimpleName() + " failed",
					localException);
		}
	}

	public String getsearch() {
		return search;
	}

	
	public void setsearch(String search) {
		search = search;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getSerchbutton() {
		return serchbutton;
	}
	public void setSerchbutton(String serchbutton) {
		this.serchbutton = serchbutton;
	}
	
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}
	public Constants(){
		readXml = new ReadXmlFile();
	}
	
	public String getPharmacymouseover() {
		return pharmacymouseover;
	}

	public void setPharmacymouseover(String pharmacymouseover) {
		this.pharmacymouseover = pharmacymouseover;
	}
	

	public String getRefillprescriptions() {
		return refillprescriptions;
	}

	public void setRefillprescriptions(String refillprescriptions) {
		this.refillprescriptions = refillprescriptions;
	}
	
	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}
	
	public String getSignup() {
		return signup;
	}

	public void setSignup(String signup) {
		this.signup = signup;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstnamevalue() {
		return firstnamevalue;
	}

	public void setFirstnamevalue(String firstnamevalue) {
		this.firstnamevalue = firstnamevalue;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastnamevalue() {
		return lastnamevalue;
	}

	public void setLastnamevalue(String lastnamevalue) {
		this.lastnamevalue = lastnamevalue;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailvaluve() {
		return emailvaluve;
	}

	public void setEmailvaluve(String emailvaluve) {
		this.emailvaluve = emailvaluve;
	}

	public String getConfirmemailAddress() {
		return confirmemailAddress;
	}

	public void setConfirmemailAddress(String confirmemailAddress) {
		this.confirmemailAddress = confirmemailAddress;
	}

	public String getConfirmemailAddressvalue() {
		return confirmemailAddressvalue;
	}

	public void setConfirmemailAddressvalue(String confirmemailAddressvalue) {
		this.confirmemailAddressvalue = confirmemailAddressvalue;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordvalue() {
		return passwordvalue;
	}

	public void setPasswordvalue(String passwordvalue) {
		this.passwordvalue = passwordvalue;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getConfirmpasswordvalue() {
		return confirmpasswordvalue;
	}

	public void setConfirmpasswordvalue(String confirmpasswordvalue) {
		this.confirmpasswordvalue = confirmpasswordvalue;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getAlertAccept() {
		return alertAccept;
	}

	public void setAlertAccept(String alertAccept) {
		this.alertAccept = alertAccept;
	}


}


