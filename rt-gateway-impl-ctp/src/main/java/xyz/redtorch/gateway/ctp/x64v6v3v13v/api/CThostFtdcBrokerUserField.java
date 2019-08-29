/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcBrokerUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v13x64apiJNI.delete_CThostFtdcBrokerUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserID_get(swigCPtr, this);
  }

  public void setUserName(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserName_set(swigCPtr, this, value);
  }

  public String getUserName() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserName_get(swigCPtr, this);
  }

  public void setUserType(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserType_set(swigCPtr, this, value);
  }

  public char getUserType() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_UserType_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsActive_get(swigCPtr, this);
  }

  public void setIsUsingOTP(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsUsingOTP_set(swigCPtr, this, value);
  }

  public int getIsUsingOTP() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsUsingOTP_get(swigCPtr, this);
  }

  public void setIsAuthForce(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsAuthForce_set(swigCPtr, this, value);
  }

  public int getIsAuthForce() {
    return jctpv6v3v13x64apiJNI.CThostFtdcBrokerUserField_IsAuthForce_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcBrokerUserField(), true);
  }

}
