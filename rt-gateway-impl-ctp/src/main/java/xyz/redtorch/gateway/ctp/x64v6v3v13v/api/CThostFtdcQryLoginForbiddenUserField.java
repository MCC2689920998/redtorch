/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcQryLoginForbiddenUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryLoginForbiddenUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryLoginForbiddenUserField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcQryLoginForbiddenUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryLoginForbiddenUserField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryLoginForbiddenUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryLoginForbiddenUserField_UserID_get(swigCPtr, this);
  }

  public CThostFtdcQryLoginForbiddenUserField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcQryLoginForbiddenUserField(), true);
  }

}
