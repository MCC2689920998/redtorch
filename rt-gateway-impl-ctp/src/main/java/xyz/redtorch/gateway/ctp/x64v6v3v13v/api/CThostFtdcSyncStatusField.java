/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v13v.api;

public class CThostFtdcSyncStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncStatusField obj) {
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
        jctpv6v3v13x64apiJNI.delete_CThostFtdcSyncStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctpv6v3v13x64apiJNI.CThostFtdcSyncStatusField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v13x64apiJNI.CThostFtdcSyncStatusField_TradingDay_get(swigCPtr, this);
  }

  public void setDataSyncStatus(char value) {
    jctpv6v3v13x64apiJNI.CThostFtdcSyncStatusField_DataSyncStatus_set(swigCPtr, this, value);
  }

  public char getDataSyncStatus() {
    return jctpv6v3v13x64apiJNI.CThostFtdcSyncStatusField_DataSyncStatus_get(swigCPtr, this);
  }

  public CThostFtdcSyncStatusField() {
    this(jctpv6v3v13x64apiJNI.new_CThostFtdcSyncStatusField(), true);
  }

}
