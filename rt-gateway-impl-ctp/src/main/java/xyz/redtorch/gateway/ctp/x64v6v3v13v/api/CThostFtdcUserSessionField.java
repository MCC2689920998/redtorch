/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcUserSessionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserSessionField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_MacAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return jctpv6v3v13x64apiJNI.CThostFtdcUserSessionField_LoginRemark_get(swigCPtr, this);
  }

  public CThostFtdcUserSessionField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcUserSessionField(), true);
  }

}
