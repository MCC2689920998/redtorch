/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcRspApiHandshakeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspApiHandshakeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspApiHandshakeField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcRspApiHandshakeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontHandshakeDataLen(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_FrontHandshakeDataLen_set(swigCPtr, this, value);
  }

  public int getFrontHandshakeDataLen() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_FrontHandshakeDataLen_get(swigCPtr, this);
  }

  public void setFrontHandshakeData(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_FrontHandshakeData_set(swigCPtr, this, value);
  }

  public String getFrontHandshakeData() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_FrontHandshakeData_get(swigCPtr, this);
  }

  public void setIsApiAuthEnabled(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_IsApiAuthEnabled_set(swigCPtr, this, value);
  }

  public int getIsApiAuthEnabled() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRspApiHandshakeField_IsApiAuthEnabled_get(swigCPtr, this);
  }

  public CThostFtdcRspApiHandshakeField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcRspApiHandshakeField(), true);
  }

}
