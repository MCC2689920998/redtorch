/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcQryExchangeCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeCombActionField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcQryExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeCombActionField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcQryExchangeCombActionField(), true);
  }

}
