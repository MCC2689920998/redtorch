/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v16t1v.api;

public class CThostFtdcReqUserLoginWithTextField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqUserLoginWithTextField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqUserLoginWithTextField obj) {
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
        jctpv6v3v16t1x64apiJNI.delete_CThostFtdcReqUserLoginWithTextField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_TradingDay_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_UserID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_Password_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_MacAddress_get(swigCPtr, this);
  }

  public void setClientIPAddress(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ClientIPAddress_set(swigCPtr, this, value);
  }

  public String getClientIPAddress() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ClientIPAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_LoginRemark_get(swigCPtr, this);
  }

  public void setText(String value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_Text_set(swigCPtr, this, value);
  }

  public String getText() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_Text_get(swigCPtr, this);
  }

  public void setClientIPPort(int value) {
    jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ClientIPPort_set(swigCPtr, this, value);
  }

  public int getClientIPPort() {
    return jctpv6v3v16t1x64apiJNI.CThostFtdcReqUserLoginWithTextField_ClientIPPort_get(swigCPtr, this);
  }

  public CThostFtdcReqUserLoginWithTextField() {
    this(jctpv6v3v16t1x64apiJNI.new_CThostFtdcReqUserLoginWithTextField(), true);
  }

}
