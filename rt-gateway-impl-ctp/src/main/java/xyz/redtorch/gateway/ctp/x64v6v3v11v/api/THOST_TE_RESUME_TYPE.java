/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v11v.api;

public final class THOST_TE_RESUME_TYPE {
  public final static THOST_TE_RESUME_TYPE THOST_TERT_RESTART = new THOST_TE_RESUME_TYPE("THOST_TERT_RESTART", jctpv6v3v11x64apiJNI.THOST_TERT_RESTART_get());
  public final static THOST_TE_RESUME_TYPE THOST_TERT_RESUME = new THOST_TE_RESUME_TYPE("THOST_TERT_RESUME");
  public final static THOST_TE_RESUME_TYPE THOST_TERT_QUICK = new THOST_TE_RESUME_TYPE("THOST_TERT_QUICK");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static THOST_TE_RESUME_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + THOST_TE_RESUME_TYPE.class + " with value " + swigValue);
  }

  private THOST_TE_RESUME_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private THOST_TE_RESUME_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private THOST_TE_RESUME_TYPE(String swigName, THOST_TE_RESUME_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static THOST_TE_RESUME_TYPE[] swigValues = { THOST_TERT_RESTART, THOST_TERT_RESUME, THOST_TERT_QUICK };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

