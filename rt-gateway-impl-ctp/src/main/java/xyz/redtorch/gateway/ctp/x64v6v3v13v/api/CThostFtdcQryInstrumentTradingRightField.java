/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcQryInstrumentTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentTradingRightField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcQryInstrumentTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v13x64apiJNI.CThostFtdcQryInstrumentTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentTradingRightField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcQryInstrumentTradingRightField(), true);
  }

}
