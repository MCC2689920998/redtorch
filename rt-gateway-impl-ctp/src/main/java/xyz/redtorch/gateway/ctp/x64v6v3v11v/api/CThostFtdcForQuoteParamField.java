/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public class CThostFtdcForQuoteParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcForQuoteParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcForQuoteParamField obj) {
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
        jctpv6v3v11x64apiJNI.delete_CThostFtdcForQuoteParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_BrokerID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_ExchangeID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_LastPrice_get(swigCPtr, this);
  }

  public void setPriceInterval(double value) {
    jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_PriceInterval_set(swigCPtr, this, value);
  }

  public double getPriceInterval() {
    return jctpv6v3v11x64apiJNI.CThostFtdcForQuoteParamField_PriceInterval_get(swigCPtr, this);
  }

  public CThostFtdcForQuoteParamField() {
    this(jctpv6v3v11x64apiJNI.new_CThostFtdcForQuoteParamField(), true);
  }

}
