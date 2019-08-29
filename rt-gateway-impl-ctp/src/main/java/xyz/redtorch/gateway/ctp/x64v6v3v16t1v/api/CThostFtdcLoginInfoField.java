/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcLoginInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcLoginInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcLoginInfoField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcLoginInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setSystemName(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SystemName_set(swigCPtr, this, value);
  }

  public String getSystemName() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SystemName_get(swigCPtr, this);
  }

  public void setPasswordDeprecated(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_PasswordDeprecated_set(swigCPtr, this, value);
  }

  public String getPasswordDeprecated() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_PasswordDeprecated_get(swigCPtr, this);
  }

  public void setMaxOrderRef(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_MaxOrderRef_set(swigCPtr, this, value);
  }

  public String getMaxOrderRef() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_MaxOrderRef_get(swigCPtr, this);
  }

  public void setSHFETime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SHFETime_set(swigCPtr, this, value);
  }

  public String getSHFETime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_SHFETime_get(swigCPtr, this);
  }

  public void setDCETime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_DCETime_set(swigCPtr, this, value);
  }

  public String getDCETime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_DCETime_get(swigCPtr, this);
  }

  public void setCZCETime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_CZCETime_set(swigCPtr, this, value);
  }

  public String getCZCETime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_CZCETime_get(swigCPtr, this);
  }

  public void setFFEXTime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_FFEXTime_set(swigCPtr, this, value);
  }

  public String getFFEXTime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_FFEXTime_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_MacAddress_get(swigCPtr, this);
  }

  public void setOneTimePassword(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_OneTimePassword_set(swigCPtr, this, value);
  }

  public String getOneTimePassword() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_OneTimePassword_get(swigCPtr, this);
  }

  public void setINETime(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_INETime_set(swigCPtr, this, value);
  }

  public String getINETime() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_INETime_get(swigCPtr, this);
  }

  public void setIsQryControl(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_IsQryControl_set(swigCPtr, this, value);
  }

  public int getIsQryControl() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_IsQryControl_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_LoginRemark_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcLoginInfoField_Password_get(swigCPtr, this);
  }

  public CThostFtdcLoginInfoField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcLoginInfoField(), true);
  }

}
