/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class CoreResourcesEmbeddedBundle extends ICoreResourcesProvider {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected CoreResourcesEmbeddedBundle(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.CoreResourcesEmbeddedBundle_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CoreResourcesEmbeddedBundle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_CoreResourcesEmbeddedBundle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SWIGTYPE_p_QByteArray getResource(String name, float displayDensityFactor, SWIGTYPE_p_bool ok) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.CoreResourcesEmbeddedBundle_getResource__SWIG_0(swigCPtr, this, name, displayDensityFactor, SWIGTYPE_p_bool.getCPtr(ok)), true);
  }

  public SWIGTYPE_p_QByteArray getResource(String name, float displayDensityFactor) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.CoreResourcesEmbeddedBundle_getResource__SWIG_1(swigCPtr, this, name, displayDensityFactor), true);
  }

  public SWIGTYPE_p_QByteArray getResource(String name, SWIGTYPE_p_bool ok) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.CoreResourcesEmbeddedBundle_getResource__SWIG_2(swigCPtr, this, name, SWIGTYPE_p_bool.getCPtr(ok)), true);
  }

  public SWIGTYPE_p_QByteArray getResource(String name) {
    return new SWIGTYPE_p_QByteArray(OsmAndCoreJNI.CoreResourcesEmbeddedBundle_getResource__SWIG_3(swigCPtr, this, name), true);
  }

  public boolean containsResource(String name, float displayDensityFactor) {
    return OsmAndCoreJNI.CoreResourcesEmbeddedBundle_containsResource__SWIG_0(swigCPtr, this, name, displayDensityFactor);
  }

  public boolean containsResource(String name) {
    return OsmAndCoreJNI.CoreResourcesEmbeddedBundle_containsResource__SWIG_1(swigCPtr, this, name);
  }

  public static CoreResourcesEmbeddedBundle loadFromCurrentExecutable() {
    long cPtr = OsmAndCoreJNI.CoreResourcesEmbeddedBundle_loadFromCurrentExecutable();
    return (cPtr == 0) ? null : new CoreResourcesEmbeddedBundle(cPtr, true);
  }

  public static CoreResourcesEmbeddedBundle loadFromLibrary(String libraryNameOrFilename) {
    long cPtr = OsmAndCoreJNI.CoreResourcesEmbeddedBundle_loadFromLibrary(libraryNameOrFilename);
    return (cPtr == 0) ? null : new CoreResourcesEmbeddedBundle(cPtr, true);
  }

}