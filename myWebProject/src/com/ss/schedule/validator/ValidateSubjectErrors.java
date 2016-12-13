package com.ss.schedule.validator;

public class ValidateSubjectErrors {
private String nameError;
private String typeError;
private String idError;
private String courseError;
public String getNameError() {
	return nameError;
}
public void setNameError(String nameError) {
	this.nameError = nameError;
}
public String getTypeError() {
	return typeError;
}
public void setTypeError(String typeError) {
	this.typeError = typeError;
}
public String getIdError() {
	return idError;
}
public void setIdError(String idError) {
	this.idError = idError;
}
public String getCourseError() {
	return courseError;
}
public void setCourseError(String courseError) {
	this.courseError = courseError;
}

@Override
public String toString() {
    return "ValidateSubjectErrors{" +
            "nameError='" + nameError + '\'' +
            ", typeError='" + typeError + '\'' +
            ", idError='" + idError + '\'' +
            ", courseError='" + courseError;
}

}
