/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcRemoveParkedOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRemoveParkedOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRemoveParkedOrderActionField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcRemoveParkedOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setParkedOrderActionID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_ParkedOrderActionID_set(swigCPtr, this, value);
  }

  public String getParkedOrderActionID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_ParkedOrderActionID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcRemoveParkedOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcRemoveParkedOrderActionField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcRemoveParkedOrderActionField(), true);
  }

}
