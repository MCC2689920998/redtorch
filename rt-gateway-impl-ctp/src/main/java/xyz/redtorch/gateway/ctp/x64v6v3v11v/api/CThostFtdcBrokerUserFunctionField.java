/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcBrokerUserFunctionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserFunctionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserFunctionField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcBrokerUserFunctionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_UserID_get(swigCPtr, this);
  }

  public void setBrokerFunctionCode(char value) {
    jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_BrokerFunctionCode_set(swigCPtr, this, value);
  }

  public char getBrokerFunctionCode() {
    return jctpv6v3v11x64apiJNI.CThostFtdcBrokerUserFunctionField_BrokerFunctionCode_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserFunctionField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcBrokerUserFunctionField(), true);
  }

}
