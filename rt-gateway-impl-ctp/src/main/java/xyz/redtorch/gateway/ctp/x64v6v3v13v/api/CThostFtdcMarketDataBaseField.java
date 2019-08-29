/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcMarketDataBaseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataBaseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataBaseField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcMarketDataBaseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_TradingDay_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return jctpv6v3v13x64apiJNI.CThostFtdcMarketDataBaseField_PreDelta_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataBaseField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcMarketDataBaseField(), true);
  }

}
