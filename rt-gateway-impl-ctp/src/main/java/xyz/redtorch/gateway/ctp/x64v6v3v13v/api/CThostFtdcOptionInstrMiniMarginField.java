/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcOptionInstrMiniMarginField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMiniMarginField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMiniMarginField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcOptionInstrMiniMarginField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_InvestorID_get(swigCPtr, this);
  }

  public void setMinMargin(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_set(swigCPtr, this, value);
  }

  public double getMinMargin() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_MinMargin_get(swigCPtr, this);
  }

  public void setValueMethod(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_set(swigCPtr, this, value);
  }

  public char getValueMethod() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_ValueMethod_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctpv6v3v13x64apiJNI.CThostFtdcOptionInstrMiniMarginField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMiniMarginField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcOptionInstrMiniMarginField(), true);
  }

}
